package com.proyecto.web.usuarios.controlador;

import com.proyecto.web.usuarios.clases.Usuarios;
import com.proyecto.web.usuarios.servicios.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Controller
@Service
@Slf4j
@RequestMapping("/auth")
public class ValidacionUsuario {

    @Autowired
    private LoginService loginService;
    @PostMapping("/login")
    public String ValidacionLogin(@RequestParam String numero_documento,@RequestParam String password) {
        Usuarios respuestaUsuario = loginService.validacionUsuario(numero_documento,password);

        return "redirect:/administrador/dashboard";

    }


    @GetMapping("/error")
    public String redirectionNull(){
        return "web/index";
    }
}
