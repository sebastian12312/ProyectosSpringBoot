package com.proyecto.web.usuarios.serviciosImplements;

import com.proyecto.web.usuarios.clases.Usuarios;
import com.proyecto.web.usuarios.consultasBD.UsuarioRepository;
import com.proyecto.web.usuarios.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsuarioImplement implements UsuarioService{
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public List<Usuarios> listarUSuario() {
        return usuarioRepository.findUsuarios();

    }
}
