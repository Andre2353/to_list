package com.atividade_to_list.to_list.service;

import com.atividade_to_list.to_list.DTOs.TarefaRequest;
import com.atividade_to_list.to_list.DTOs.TarefaResponse;
import com.atividade_to_list.to_list.DTOs.UsuarioRequest;
import com.atividade_to_list.to_list.DTOs.UsuarioResponse;
import com.atividade_to_list.to_list.entitites.Tarefa;
import com.atividade_to_list.to_list.entitites.Usuario;
import com.atividade_to_list.to_list.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public List<TarefaResponse> listartarefas() {
        return tarefaRepository.findAll().stream()
                .map(tarefa -> new TarefaResponse(
                        tarefa.getId(),
                        tarefa.getNome(),
                        tarefa.getEtapatarefa(),
                        tarefa.getHorarioTarefa()
                )).toList();
    }

    public TarefaResponse buscarporId(Long id) {
        Tarefa tarefa = tarefaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException
                        ("Usuario não encontrado com id" + id));
        return new TarefaResponse(
                tarefa.getId(),
                tarefa.getNome(),
                tarefa.getEtapatarefa(),
                tarefa.getHorarioTarefa()
        );

    }

    public String deletar(Long id) {
        Optional<Tarefa> tarefa = tarefaRepository.findById(id);
        if (tarefa.isEmpty()) {
            return "Usuario não exite";
        } else {
            tarefaRepository.deleteById(id);
            return "Usuario foi deletado";
        }
    }

    public TarefaResponse atualizarId(Long id, TarefaRequest request) {
        Tarefa tarefaExistente = tarefaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada com id: " + id));

        tarefaExistente.setNome(request.getNome());
        tarefaExistente.setEtapatarefa(request.getEtapatarefa());
        tarefaExistente.setHorarioTarefa(request.getHorarioTarefa());

        Tarefa atualizando = tarefaRepository.save(tarefaExistente);

        return new TarefaResponse(
                atualizando.getId(),
                atualizando.getNome(),
                atualizando.getEtapatarefa(),
                atualizando.getHorarioTarefa()
        );
    }
}
