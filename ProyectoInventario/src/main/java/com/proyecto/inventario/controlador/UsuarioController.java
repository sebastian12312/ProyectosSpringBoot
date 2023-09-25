package com.proyecto.inventario.controlador;

import com.proyecto.inventario.clases.Usuario;
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
public class UsuarioController {

   @Autowired
    private UsuarioService usuarioService;


   @RequestMapping(value = "/listar")
   public List<Usuario> listarUsuario(){
       List<Usuario> listado = usuarioService.listaUsuarios();
       int cantidad = listado.size();
       log.info(String.valueOf(cantidad));
       return listado;
   }


}
