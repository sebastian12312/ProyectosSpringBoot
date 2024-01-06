package com.proyecto.web.usuario.controller;




import com.proyecto.web.usuario.clase.Usuario;
import com.proyecto.web.usuario.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@Slf4j
public class controladorLogin {

    @Autowired
    private LoginService loginService;
    @PostMapping(value = "/login")
    private String validacionUsuario(@RequestParam String codigoUsuario,@RequestParam String contraseñaUsuario){
        Usuario user = new Usuario();
        user = loginService.validacionUsuario(codigoUsuario,contraseñaUsuario);


        return "redirect:/administrador/main";

    }
}
