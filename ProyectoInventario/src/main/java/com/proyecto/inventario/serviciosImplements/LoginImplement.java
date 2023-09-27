package com.proyecto.inventario.serviciosImplements;

import com.proyecto.inventario.clases.Usuarios;
import com.proyecto.inventario.consultasBD.UsuarioRepository;
import com.proyecto.inventario.servicios.LoginService;
import com.proyecto.inventario.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LoginImplement implements LoginService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public Usuarios validacionUsuario(String numero_documento, String contraseña) {
        Usuarios respuestaUsuario =  usuarioRepository.findUserByCodigo(numero_documento);
        if(respuestaUsuario.getContraseña().equals(contraseña)){
            return  respuestaUsuario;
        } else{
            return  null;
        }

    }
}
