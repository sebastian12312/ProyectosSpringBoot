package com.proyecto.web.usuarios.API;


import com.proyecto.web.usuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("API/administrador")
@RestController
public class administradorAPI {
    @Autowired
    private UsuarioService usuarioService;
    @GetMapping("usuario/eliminar")
    private String eliminarUsuario(@RequestParam  String codigoUsuario){
    usuarioService.eliminarUsuario(codigoUsuario);
        return "web/index";
    }

}
