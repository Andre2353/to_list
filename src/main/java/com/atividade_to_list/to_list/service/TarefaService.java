package com.atividade_to_list.to_list.service;

import com.atividade_to_list.to_list.repository.TarefaRepository;
import org.springframework.stereotype.Service;

@Service
public class TarefaService {
    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }
}
