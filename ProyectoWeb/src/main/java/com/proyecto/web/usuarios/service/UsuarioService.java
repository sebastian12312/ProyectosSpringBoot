package com.proyecto.web.usuarios.service;


import com.proyecto.web.usuarios.clases.Usuario;

public interface UsuarioService {
     Usuario validacionUsuario(String codigoUsuario, String contraseñaUsuario);
     String consultaUsuario(String codigoUsuario);
}
