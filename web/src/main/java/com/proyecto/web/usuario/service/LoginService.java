package com.proyecto.web.usuario.service;


import com.proyecto.web.usuario.clase.Usuario;

public interface LoginService {
     Usuario validacionUsuario(String codigoUsuario, String contraseñaUsuario);
     String consultaUsuario(String codigoUsuario);
}
