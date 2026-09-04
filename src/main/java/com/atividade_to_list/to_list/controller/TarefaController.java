package com.atividade_to_list.to_list.controller;

import com.atividade_to_list.to_list.DTOs.TarefaRequest;
import com.atividade_to_list.to_list.DTOs.TarefaResponse;
import com.atividade_to_list.to_list.service.TarefaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @PostMapping
    public ResponseEntity<TarefaResponse> criar(@RequestBody TarefaRequest request) {
        TarefaResponse response = tarefaService.criarTarefa(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<TarefaResponse>> listar() {
        return ResponseEntity.ok(tarefaService.listartarefas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TarefaResponse> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(tarefaService.buscarporId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TarefaResponse> atualizar(@PathVariable Long id, @RequestBody TarefaRequest request) {
        return ResponseEntity.ok(tarefaService.atualizarId(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {
        String mensagem = tarefaService.deletar(id);
        return ResponseEntity.ok(mensagem);
    }
}