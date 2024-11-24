package com.project.CadastroNinjas.Ninja;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public NinjaModel newNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }

    public List<NinjaModel> getNinjas () {
        return ninjaRepository.findAll();
    }

    public NinjaModel getNinjaById(Long id){
        Optional<NinjaModel> ninja = ninjaRepository.findById(id);
        return ninja.orElse(null);
    }

    public NinjaModel updateNinja(NinjaModel ninjaUpdated, Long id){
        if (ninjaRepository.existsById(id)){
            ninjaUpdated.setId(id);
            return ninjaRepository.save(ninjaUpdated);
        }

        return null;
    }

    public void deleteNinja(Long id){
        ninjaRepository.deleteById(id);
    }
}
