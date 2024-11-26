package com.project.CadastroNinjas.Ninja;

import com.project.CadastroNinjas.Missoes.MissoesModel;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaDTO {

    private Long id;

    private String nome;

    private int idade;

    private String imgUrl;

    private String email;

    private String rank;

    private MissoesModel missoes;

}
