package com.proyecto.web.usuario.controller;

import com.proyecto.web.usuario.clase.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class main {

    @RequestMapping(value = "/")
    private String web(){
      Usuario user = new Usuario();

        return "web/index";
    }

}
