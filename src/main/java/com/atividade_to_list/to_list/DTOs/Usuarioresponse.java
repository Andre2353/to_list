package com.atividade_to_list.to_list.DTOs;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Usuarioresponse {
    private Long id;
    private String nome;
    private String email;
    private String senha;
}
