package com.atividade_to_list.to_list.DTOs;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class usuariorequest {
    @NotBlank(message = "não pode estar vazio ")
    private String nome;
    @NotBlank(message = "o Email não pode estar em branco")
    // verefica se a estrutura correta de um endereço de e-mail válido
    @Email(message = "Por favor, insira um e-mail válido")
    private String email;
    @Size(min = 5,max = 20,message = "a senha precisa ter entre 5 e 20 caracteres")
    private String senha;
}
