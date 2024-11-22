package com.project.CadastroNinjas.Ninja;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ninjas")

public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // Criar um ninja
    @PostMapping
    public String newNinja(){
        return "ninja criado";
    }

    // Listar ninjas
    @GetMapping
    public String getNinjas(){
        return "Ninjas";
    }

    // Listar Ninja por Id
    @GetMapping("/{id}")
    public String getNinjaByid(@PathVariable Long id){
        return "ninja por id";
    }

    // Atualizar Ninja
    @PutMapping("/{id}")
    public String updateNinja (@PathVariable Long id){
        return "Ninja atualizado";
    }

    // Deletar Ninja
    @DeleteMapping("/{id}")
    public String deleteNinja(@PathVariable Long id){
        return "Ninja deletado";
    }
}
