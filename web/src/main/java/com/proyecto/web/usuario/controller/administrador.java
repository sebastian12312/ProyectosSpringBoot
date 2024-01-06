package com.proyecto.web.usuario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/administrador")
@Controller
public class administrador {
    @GetMapping(value = "/main")
    private String administrador(){
        return "administrator/dashboard";
    }
}
