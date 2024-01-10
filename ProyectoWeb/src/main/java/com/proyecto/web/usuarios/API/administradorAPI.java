package com.proyecto.web.usuarios.API;


import com.proyecto.web.usuarios.clases.Usuario;
import com.proyecto.web.usuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/API/administrador")
@RestController
public class administradorAPI {
    @Autowired
    private UsuarioService usuarioService;
    @GetMapping("/usuario/eliminar")
    private void eliminarUsuario(@RequestParam  String codigoUsuario){
    usuarioService.eliminarUsuario(codigoUsuario);

    }
    @GetMapping("/usuario/buscar/{codigoUsuario}")
    private Usuario buscarUsuario(@PathVariable String codigoUsuario){
       Usuario user = usuarioService.buscarUsuario(codigoUsuario);
    return user;
    }

}
