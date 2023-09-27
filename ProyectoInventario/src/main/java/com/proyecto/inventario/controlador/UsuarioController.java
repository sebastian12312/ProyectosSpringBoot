package com.proyecto.inventario.controlador;

import com.proyecto.inventario.clases.Usuarios;
import com.proyecto.inventario.servicios.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/home")
public class UsuarioController {

   @Autowired
    private UsuarioService usuarioService;

   //redireccionamiento de ValidacionUsuarion del user
   @GetMapping("/dashboard")
    public String redirectionUsuario(){
        return "dashboard/dashboard";
    }
   @RequestMapping (value = "/listar")
    public List<Usuarios> Listar(){
       List<Usuarios> List = usuarioService.listarUSuario();
       int cantidad = List.size();
       log.info("cantidad"+String.valueOf(cantidad));
       return List;
   }


}
