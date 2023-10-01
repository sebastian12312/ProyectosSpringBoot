package com.proyecto.inventario.serviciosImplements;

import com.proyecto.inventario.clases.Usuarios;
import com.proyecto.inventario.consultasBD.UsuarioRepository;
import com.proyecto.inventario.servicios.AdministradorService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class AdministradorImplement implements AdministradorService {
    @Autowired
    private UsuarioRepository usuarioRepository;
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
        if(buscarUsuario.getCodigo_usuario() != null){
            return buscarUsuario;
        }else{
            return null;
        }
    }
}
