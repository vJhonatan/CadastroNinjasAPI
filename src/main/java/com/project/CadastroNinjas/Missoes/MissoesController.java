package com.project.CadastroNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/missoes")
public class MissoesController {

    MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @PostMapping
    public MissoesModel createMission(@RequestBody MissoesModel mission){
        return missoesService.createMission(mission);
    }

    @GetMapping
    public List<MissoesModel> getMissions(){
        return missoesService.getMissions();
    }

    @GetMapping("/{id}")
    public MissoesModel getMissionById(@PathVariable Long id){
        return missoesService.getMissionById(id);
    }

    @PutMapping("/{id}")
    public MissoesModel updateMission(@RequestBody MissoesModel missionUpdated, @PathVariable Long id){
        return missoesService.updateMission(missionUpdated,id);
    }

    @DeleteMapping("/{id}")
    public void deleteMission(@PathVariable Long id){
        missoesService.deleteMission(id);
    }
}
