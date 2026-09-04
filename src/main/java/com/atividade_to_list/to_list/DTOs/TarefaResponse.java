package com.atividade_to_list.to_list.DTOs;

import com.atividade_to_list.to_list.entitites.Etapatarefa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TarefaResponse {
    private Long id;
    private String nome;
    private Etapatarefa etapatarefa;
    private LocalDateTime horarioTarefa;

}
