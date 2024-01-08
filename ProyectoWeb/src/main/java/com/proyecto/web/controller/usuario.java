package com.proyecto.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/usuario")
@Controller
public class usuario {

    @GetMapping ("/home")
    private String web(){
        return"usuarios/home";
    }
}
