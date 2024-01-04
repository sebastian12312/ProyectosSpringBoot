package com.proyecto.web.usuarios.servicios;

import com.proyecto.web.usuarios.clases.Usuarios;

public interface LoginService {
    public Usuarios validacionUsuario(String numero_documento,String contraseña);
}
