package com.proyecto.inventario.controlador;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/")
public class WebController {


    @GetMapping("/")
    public String index(){
        return "web/index";
    }
    @GetMapping("/administration/{}")
    public String redirectionAdministration(){
        return "administrator/administrator";
    }
    @GetMapping("/dashboard/{}")
    public String redirectionUsuario(){
        return "administrator/administrator";
    }
}
