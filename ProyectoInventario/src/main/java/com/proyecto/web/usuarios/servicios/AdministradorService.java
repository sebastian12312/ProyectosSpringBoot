package com.proyecto.web.usuarios.servicios;

import com.proyecto.web.usuarios.clases.TipoDocumentos;
import com.proyecto.web.usuarios.clases.Usuarios;

import java.util.List;

public interface AdministradorService {
    List<Usuarios> listarUsuarios();
    Usuarios registrarUsuario();
    Usuarios buscarUsuario(String numero_documento);
    void eliminarUsuario(String codigo_usuario);
    String registrarUsuarios(String codigo_usuario, String tipo_documento,  String numero_documento,  String nombre,
                              String apellido,  String telefono,  String correo_personal,
                            String contraseña,String contraseña_respaldo, String fecha_nacimiento, String id_dependencia,  String id_rol,
                              String estado_usuario);
    List<TipoDocumentos> tipoDocumento();
}
