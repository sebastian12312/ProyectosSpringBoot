package com.proyecto.inventario.servicios;

import com.proyecto.inventario.clases.Usuarios;

import java.util.List;

public interface AdministradorService {
    List<Usuarios> listarUsuarios();
    Usuarios registrarUsuario();
    Usuarios buscarUsuario(String numero_documento);

}
