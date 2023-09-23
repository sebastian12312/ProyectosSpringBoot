package com.proyecto.inventario.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControladorUsuario {
    @GetMapping("/prueba")
    public List<String> prueba(){

        return List.of("manzan","manzan2","manzan3");
    }

}
