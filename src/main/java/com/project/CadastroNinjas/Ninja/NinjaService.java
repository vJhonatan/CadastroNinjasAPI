package com.project.CadastroNinjas.Ninja;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    public NinjaDTO newNinja(NinjaDTO ninjaDTO){
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
    }

    public List<NinjaDTO> getNinjas () {

        List<NinjaModel> ninjaModel = ninjaRepository.findAll();
        return ninjaModel.stream()
                .map(ninjaMapper::map)
                .collect(Collectors.toList());
    }

    public NinjaDTO getNinjaById(Long id){
        Optional<NinjaModel> ninjaById = ninjaRepository.findById(id);
        return ninjaById.map(ninjaMapper::map).orElse(null);
    }

    public NinjaDTO updateNinja(NinjaDTO ninjaDTO, Long id){
        Optional<NinjaModel> ninja = ninjaRepository.findById(id);
        if (ninja.isPresent()) {
            NinjaModel ninjaUpdated = ninjaMapper.map(ninjaDTO);
            ninjaUpdated.setId(id);
            NinjaModel newNinja = ninjaRepository.save(ninjaUpdated);
            return ninjaMapper.map(newNinja);
        }

        return null;
    }

    public void deleteNinja(Long id){
        ninjaRepository.deleteById(id);
    }
}
