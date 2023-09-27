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
    List<Usuarios> usuario = usuarioRepository.findUserByCodigo(numero_documento);
    Usuarios responseUsuario = new Usuarios();
    if(usuario.size()>0){
            boolean response = usuario.get(0).getContraseña().equals(contraseña);
            responseUsuario.setEstado_usuario("ok");
            responseUsuario.setFecha_nacimiento(":121212");
    }else{
        responseUsuario.setEstado_usuario("error");
    }
        return responseUsuario;
    }
}
