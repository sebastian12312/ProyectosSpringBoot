package com.proyecto.web.controller;

import com.proyecto.web.usuarios.clases.Usuario;
import com.proyecto.web.usuarios.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@RequestMapping(value = "/administrador")
@Controller
public class administrador    {
    @Autowired
    private UsuarioService usuarioService;
    @GetMapping(value = "/main")
    private String administrador(HttpSession session, Model model){
       String nombreUsuario = (String) session.getAttribute("nombreUsuario");
       String codigoUsuario = (String) session.getAttribute("codigoUsuario");
       session.setAttribute("nombreUsuario",nombreUsuario);
       model.addAttribute("user", nombreUsuario);
        if(codigoUsuario != null){
            session.setAttribute("codigoUsuario",codigoUsuario);
        }else{
            session.setAttribute("codigoUsuario",null);
        }
        return "administrator/dashboard";
    }
    @GetMapping(value = "/usuarios")
    private String usuarios(Model model){
        List<Usuario> listaUsuario = usuarioService.listaUsuario();
        model.addAttribute("listaUsuario", listaUsuario);
        return "administrator/usuarios";
    }
    @GetMapping(value = "/usuarios/eliminar")
    private String eliminarUsuario(Model model, @RequestParam() String codigoUsuario){
        usuarioService.eliminarUsuario(codigoUsuario);
        return "administrator/usuarios";
    }
    @GetMapping(value = "/inventario")
    private String inventario(){
        return "administrator/inventario";
    }
}
