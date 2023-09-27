package com.proyecto.inventario.servicios;

import com.proyecto.inventario.clases.Usuarios;

public interface LoginService {
    public Usuarios validacionUsuario(String numero_documento,String contraseña);
}
