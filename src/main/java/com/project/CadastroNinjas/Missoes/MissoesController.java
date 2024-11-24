package com.project.CadastroNinjas.Missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/missoes")
public class MissoesController {

    MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    /* TODO: Rota para nova missão */
    @PostMapping
    public void createMission(){

    }

    /* TODO: Rota para listar missões */
    @GetMapping
    public void getMissions(){

    }

    /* TODO: Rota para listar missão por ID */
    public void getMissionById(){

    }

    /* TODO: Rota para atualizar missão */
    public void updateMission(){

    }

    /* TODO: Rota para deletar missão */
    public void deleteMission(){

    }
}
