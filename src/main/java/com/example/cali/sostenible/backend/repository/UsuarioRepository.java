package com.example.cali.sostenible.backend.repository;

import com.example.cali.sostenible.backend.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {


}
