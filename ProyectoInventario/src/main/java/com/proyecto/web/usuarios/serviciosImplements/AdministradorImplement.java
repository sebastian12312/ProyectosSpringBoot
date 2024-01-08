package com.proyecto.web.usuarios.serviciosImplements;

import com.proyecto.web.usuarios.clases.TipoDocumentos;
import com.proyecto.web.usuarios.clases.Usuarios;
import com.proyecto.web.usuarios.consultasBD.TipoDocumentosRepository;
import com.proyecto.web.usuarios.consultasBD.UsuarioRepository;
import com.proyecto.web.usuarios.servicios.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class AdministradorImplement implements AdministradorService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private TipoDocumentosRepository tipoDocumentosRepository;
    @Override
    public List<Usuarios> listarUsuarios() {

        return usuarioRepository.findUsuarios();
    }

    @Override
    public Usuarios registrarUsuario() {
        return null;
    }

    @Override
    public Usuarios buscarUsuario(String numero_documento) {
        Usuarios buscarUsuario = usuarioRepository.findUserByCodigo(numero_documento);
       return  buscarUsuario;
    }

    @Override
    public void eliminarUsuario(String codigo_usuario) {
            usuarioRepository.deleteBycodigo_usuario(codigo_usuario);
    }

    @Override
    public String registrarUsuarios(String codigo_usuario, String tipo_documento, String numero_documento, String nombre, String apellido, String telefono, String correo_personal, String contraseña,String contraseña_respaldo, String fecha_nacimiento, String id_dependencia, String id_rol, String estado_usuario) {
    String mensaje= "ok";
        usuarioRepository.insertarUsuario( codigo_usuario,  tipo_documento,  numero_documento,  nombre,  apellido,  telefono,  correo_personal,  contraseña,contraseña_respaldo,  fecha_nacimiento,  id_dependencia,  id_rol,  estado_usuario);
        return mensaje;
    }

    @Override
    public List<TipoDocumentos> tipoDocumento() {
        return tipoDocumentosRepository.findByDocumentosType();
    }
}
