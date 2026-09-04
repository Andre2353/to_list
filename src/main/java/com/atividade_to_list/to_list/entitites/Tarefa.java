package com.atividade_to_list.to_list.entitites;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

//fala para o codigo que é uma entidade
@Entity
// defini o nome que vai aparecer nas tabelas do banco de dados
@Table(name = "tarefa")
//Gera automaticamente os métodos Getters, Setters
@Data
// cria um contrutor vazio
@NoArgsConstructor
// Cria um construtor recebendo todos os atributos da classe
@AllArgsConstructor
public class Tarefa {
    // vai falar que o id vai ser uma chave primaria
    @Id
    //configura o auto incremente no banco
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // não permite que o dado ou o espaço esteja vazio
    @NotBlank(message = "não pode estar Vazio ")
    private String nome;
    @Enumerated(EnumType.STRING)
    private Etapatarefa etapatarefa;
    @Column(nullable = false)
    // adiciona  a data e o hora do que aconteceu
    private LocalDateTime horarioTarefa;


}
