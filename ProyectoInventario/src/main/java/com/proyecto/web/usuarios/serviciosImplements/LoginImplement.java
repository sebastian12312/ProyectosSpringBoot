package com.proyecto.web.usuarios.serviciosImplements;

import com.proyecto.web.usuarios.clases.Usuarios;
import com.proyecto.web.usuarios.consultasBD.UsuarioRepository;
import com.proyecto.web.usuarios.servicios.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginImplement implements LoginService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public Usuarios validacionUsuario(String numero_documento, String contraseña) {
        Usuarios respuestaUsuario =  usuarioRepository.findUserByCodigo(numero_documento);
       return respuestaUsuario;

    }
}
