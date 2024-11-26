package com.project.CadastroNinjas.Missoes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.CadastroNinjas.Ninja.NinjaModel;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MissoesDTO {

    private Long id;

    private String nome;

    private DificuldadeMissoes Dificuldade;

    private List<NinjaModel> ninja;

}
