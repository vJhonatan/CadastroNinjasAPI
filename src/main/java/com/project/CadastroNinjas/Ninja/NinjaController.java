package com.project.CadastroNinjas.Ninja;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService){
        this.ninjaService = ninjaService;
    }

    @PostMapping
    public NinjaModel newNinja(@RequestBody NinjaModel ninja){
        return ninjaService.newNinja(ninja);
    }

    @GetMapping
    public List<NinjaModel> getNinjas(){
        return ninjaService.getNinjas();
    }

    @GetMapping("/{id}")
    public NinjaModel getNinjaByid(@PathVariable Long id){
        return ninjaService.getNinjaById(id);
    }

    @PutMapping("/{id}")
    public NinjaModel updateNinja (@RequestBody NinjaModel ninjaUpdated, @PathVariable Long id){
        return ninjaService.updateNinja(ninjaUpdated,id);
    }

    @DeleteMapping("/{id}")
    public void deleteNinja(@PathVariable Long id){
        ninjaService.deleteNinja(id);
    }
}
