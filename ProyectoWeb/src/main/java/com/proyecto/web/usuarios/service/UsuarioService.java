package com.proyecto.web.usuarios.service;


import com.proyecto.web.usuarios.clases.Usuario;

import java.util.List;

public interface UsuarioService {
     Usuario validacionUsuario(String codigoUsuario, String contraseñaUsuario);
     String consultaUsuario(String codigoUsuario);
     List<Usuario> listaUsuario();
     void eliminarUsuario(String codigoUsuario);
     Usuario buscarUsuario(String codigoUsuario);
     Boolean agregarUsuario(String id, String nombre, String apellido, String correo);
}
