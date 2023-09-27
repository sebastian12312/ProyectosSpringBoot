package com.proyecto.inventario.controlador;


import com.proyecto.inventario.clases.Usuarios;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/administrator")
public class AdministratorController {

    @GetMapping("/usuarios")
    public List<Usuarios> listaUsuarios(){

        return null;
    }
    @GetMapping("/usuario/{numero_documento}")
    public Usuarios buscarUsuario(@RequestParam() String numero_documento){

        return null;
    }
    @PostMapping("/usuario/agregar")
    public Usuarios agregarUsuario(){
        return null;
    }
    @GetMapping("/usuario/modify={numero_documento}")
    public Usuarios modificarUsuario(@RequestParam String numero_documento){

        return null;
    }
    @GetMapping("/usuario/delete={numero_documento}")
    public Usuarios eliminarUSuario(@RequestParam String numero_documento){

        return null;
    }
}
