package com.atividade_to_list.to_list.service;

import com.atividade_to_list.to_list.DTOs.TarefaRequest;
import com.atividade_to_list.to_list.DTOs.TarefaResponse;
import com.atividade_to_list.to_list.DTOs.UsuarioRequest;
import com.atividade_to_list.to_list.DTOs.UsuarioResponse;
import com.atividade_to_list.to_list.entitites.Tarefa;
import com.atividade_to_list.to_list.entitites.Usuario;
import com.atividade_to_list.to_list.repository.TarefaRepository;
import org.springframework.stereotype.Service;

@Service
public class TarefaService {
    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }
    public TarefaResponse criarTarefa(TarefaRequest request) {
        Tarefa tarefa = new Tarefa();
        tarefa.setNome(request.getNome());
        tarefa.setEtapatarefa(request.getEtapatarefa());
        tarefa.setHorarioTarefa(request.getHorarioTarefa());

        Tarefa tarefaSalva = tarefaRepository.save(tarefa);

        return new TarefaResponse(
                tarefaSalva.getId(),
                tarefaSalva.getNome(),
                tarefaSalva.getEtapatarefa(),
                tarefaSalva.getHorarioTarefa()
        );
    }
}
