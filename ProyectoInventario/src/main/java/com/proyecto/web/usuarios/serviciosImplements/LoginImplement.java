package com.proyecto.inventario.usuarios.serviciosImplements;

import com.proyecto.web.usuarios.clases.Usuarios;
import com.proyecto.inventario.usuarios.consultasBD.UsuarioRepository;
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
        if(respuestaUsuario.getContraseña() != null){
            return  respuestaUsuario;
        } else{
            return  null;
        }

    }
}
