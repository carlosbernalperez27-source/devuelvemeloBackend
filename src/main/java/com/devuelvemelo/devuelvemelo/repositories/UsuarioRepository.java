package com.devuelvemelo.devuelvemelo.repositories;

import com.devuelvemelo.devuelvemelo.models.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
    // Método para buscar por RUT 
    Optional<Usuario> findByRut(String rut);
    
    // Método para buscar por email
    Optional<Usuario> findByEmailUsuario(String emailUsuario);

    Optional<Usuario> findByRutAndEmailUsuario(String rut, String emailUsuario);

   
}
