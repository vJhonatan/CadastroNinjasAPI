package com.project.CadastroNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository){
        this.missoesRepository = missoesRepository;
    }

    public MissoesModel createMission(MissoesModel missao){
        return missoesRepository.save(missao);
    }

    public List<MissoesModel> getMissions(){
        return missoesRepository.findAll();
    }

    public MissoesModel getMissionById(Long id){
        Optional<MissoesModel> missao = missoesRepository.findById(id);
        return missao.orElse(null);
    }

    public MissoesModel updateMission(MissoesModel missionUpdated, Long id){
        if (missoesRepository.existsById(id)){
            missionUpdated.setId(id);
            return missoesRepository.save(missionUpdated);
        }

        return null;
    }

    public void deleteMission(Long id){
        missoesRepository.deleteById(id);
    }
}
