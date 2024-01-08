package com.proyecto.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class main {

    @GetMapping("/")
    private String web(){
        return "web/index";
    }
}
