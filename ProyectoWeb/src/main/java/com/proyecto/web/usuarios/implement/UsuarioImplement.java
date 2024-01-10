package com.proyecto.web.usuarios.implement;

import com.proyecto.web.usuarios.clases.users;
import com.proyecto.web.usuarios.repository.Users;
import com.proyecto.web.usuarios.repository.UsuarioRepository;
import com.proyecto.web.usuarios.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.web.usuarios.clases.Usuario;

import java.util.List;


@Service
public class UsuarioImplement implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public Usuario validacionUsuario(String codigoUsuario, String contraseñaUsuario) {
        try {
            Usuario user = usuarioRepository.findValidar(codigoUsuario, contraseñaUsuario);

            if (user.getCodigo().equals(codigoUsuario)) {
                return user;
            } else {
                String rol = "none";

                return null;
            }
        } catch (Exception e) {
            // Manejar la excepción aquí, ya sea registrándola, imprimiéndola o realizando alguna otra acción
            e.printStackTrace(); // o utiliza algún otro método para manejar la excepción
            return null; // o lanza una excepción específica si lo prefieres
        }
    }
    @Override
    public String consultaUsuario(String codigoUsuario) {
        return null;
    }

    @Override
    public List<Usuario> listaUsuario() {
       List<Usuario> usuarios = usuarioRepository.listaUsuario();
       return usuarios;
    }

    @Override
    public void eliminarUsuario(String codigoUsuario) {
        usuarioRepository.deleteBycodigo_usuario(codigoUsuario);
    }

    @Override
    public Usuario buscarUsuario(String codigoUsuario) {
        Usuario user = usuarioRepository.findBuscarUsuario(codigoUsuario);
        return user;
    }

    @Autowired
    private Users usera ;
    @Override
    public Boolean agregarUsuario(String id, String nombre, String apellido, String correo) {
        users userasd = new users(nombre, apellido, correo);
        usera.save(userasd);

        return true;
    }


}
