package com.proyecto.web.usuario.implement;
import com.proyecto.web.usuario.repository.UsuarioRepository;
import com.proyecto.web.usuario.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.web.usuario.clase.Usuario;
@Service
public class LoginImplement implements LoginService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public Usuario validacionUsuario(String codigoUsuario, String contraseñaUsuario) {

        Usuario user = usuarioRepository.findValidar(codigoUsuario,contraseñaUsuario);

        if (user != null) {
            System.out.println("Código de usuario: " + user);
        } else {
            System.out.println("Error: Usuario no encontrado para el código y contraseña proporcionados");
        }

        return user;
    }

    @Override
    public String consultaUsuario(String codigoUsuario) {
        return null;
    }
}
