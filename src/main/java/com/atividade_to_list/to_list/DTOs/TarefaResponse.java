package com.atividade_to_list.to_list.DTOs;

import com.atividade_to_list.to_list.entitites.Etapatarefa;

import java.time.LocalDateTime;

public class TarefaResponse {
    private Long id;
    private String nome;
    private Etapatarefa etapatarefa;
    private LocalDateTime horarioTarefa;

    public TarefaResponse(Long id, String nome, Etapatarefa etapatarefa, LocalDateTime horarioTarefa) {
        this.id = id;
        this.nome = nome;
        this.etapatarefa = etapatarefa;
        this.horarioTarefa = horarioTarefa;
    }
}
