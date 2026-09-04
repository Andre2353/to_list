package com.atividade_to_list.to_list.DTOs;

import com.atividade_to_list.to_list.entitites.Etapatarefa;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TarefaRequest {
    @NotBlank(message = "O nome da tarefa não pode estar vazio")
    private String nome;

    @NotNull(message = "A etapa da tarefa é obrigatória")
    private Etapatarefa etapatarefa;

    @NotNull(message = "O horário da tarefa é obrigatório")
    private LocalDateTime horarioTarefa;
}
