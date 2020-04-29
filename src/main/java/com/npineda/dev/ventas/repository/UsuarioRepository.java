package com.npineda.dev.ventas.repository;


import com.npineda.dev.ventas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Serializable> {

    List<Usuario> findByNombreAndContrasena(String nombre, String contrasena);
}
