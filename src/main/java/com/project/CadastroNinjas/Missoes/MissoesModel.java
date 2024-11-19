package com.project.CadastroNinjas.Missoes;

import com.project.CadastroNinjas.Ninja.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(name = "dificuldade")
    private DificuldadeMissoes Dificuldade;

    @Column(name = "ninja")
    private NinjaModel ninja;
}
