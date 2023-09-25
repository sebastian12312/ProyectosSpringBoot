package com.proyecto.inventario.serviciosImplements;

import com.proyecto.inventario.clases.Usuario;
import com.proyecto.inventario.consultasBD.UsuarioRepository;
import com.proyecto.inventario.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsuarioImplement implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public List<Usuario> listaUsuarios() {

        return usuarioRepository.findUsuario();
    }
    //aqui implementamos el contrato u tambien la interface

}
