package com.devuelvemelo.devuelvemelo.services;

import com.devuelvemelo.devuelvemelo.models.Usuario;
import com.devuelvemelo.devuelvemelo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> obtenerTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario guardarUsuario(Usuario usuario) {
        // Validar si el RUT ya existe antes de guardar
        return usuarioRepository.save(usuario);
    }
}