package com.atividade_to_list.to_list.entitites;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//fala para o codigo que é uma entidade
@Entity
// defini o nome que vai aparecer nas tabelas do banco de dados
@Table(name = "usuario")
//Gera automaticamente os métodos Getters, Setters
@Data
// cria um contrutor vazio
@NoArgsConstructor
// Cria um construtor recebendo todos os atributos da classe
@AllArgsConstructor
public class Usuario {
    // vai falar que o id vai ser uma chave primaria
    @Id
    //configura o auto incremente no banco
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // não permite que o dado ou o espaço esteja vazio
    @NotBlank(message = "não pode estar vazio ")
    private String nome;
    @NotBlank(message = "o Email não pode estar em branco")
    // verefica se a estrutura correta de um endereço de e-mail válido
    @Email(message = "Por favor, insira um e-mail válido")
    private String email;
    @Size(min = 5,max = 11,message = "a senha precisa ter entre 5 e 11 caracteres")
    private String senha;

}
