package com.devuelvemelo.devuelvemelo.repositories;

import com.devuelvemelo.devuelvemelo.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}
    // Agrego los métodos 