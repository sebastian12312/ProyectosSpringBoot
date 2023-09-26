package com.proyecto.inventario.controlador;

import com.proyecto.inventario.clases.Usuarios;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class ValidacionUsuario {


    @RequestMapping("/login")
    public List<Usuarios> getUsuario() {

        return null;
    }
}
