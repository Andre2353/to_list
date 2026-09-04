package com.atividade_to_list.to_list.service;

import com.atividade_to_list.to_list.DTOs.UsuarioRequest;
import com.atividade_to_list.to_list.DTOs.UsuarioResponse;
import com.atividade_to_list.to_list.entitites.Usuario;
import com.atividade_to_list.to_list.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    public UsuarioResponse criarUsuario(UsuarioRequest request){
        Usuario usuario = new Usuario();
        usuario.setNome(request.getNome());
        usuario.setEmail(request.getEmail());
        usuario.setSenha(request.getSenha());

        // Guarda a instância retornada com o ID populado pelo banco
        Usuario usuariosalvo = usuarioRepository.save(usuario);
        return new UsuarioResponse(
                usuariosalvo.getId(),
                usuariosalvo.getNome(),
                usuariosalvo.getEmail()

        );
    }

    public List<UsuarioResponse>ListarUsuarios(){
        return usuarioRepository.findAll().stream()
                .map(usuario -> new UsuarioResponse(
                        usuario.getId(),
                        usuario.getNome(),
                        usuario.getEmail()
                )).toList();
    }
    public UsuarioResponse buscarporId(Long id){
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException
                        ("Usuario não encontrado com id" + id));

        return new UsuarioResponse(
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail()
        );

    }
    public String deletar(Long id){
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        if (usuario.isEmpty()){
            return "Usuario não exite";
        }else {
            usuarioRepository.deleteById(id);
            return "Usuario foi deletado";
        }
    }

}
