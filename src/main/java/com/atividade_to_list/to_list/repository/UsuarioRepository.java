package com.atividade_to_list.to_list.repository;

import com.atividade_to_list.to_list.entitites.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
