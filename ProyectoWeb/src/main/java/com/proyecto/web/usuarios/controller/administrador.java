package com.proyecto.web.usuarios.controller;

import com.proyecto.web.usuarios.clases.Usuario;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/administrador")
@Controller
public class administrador {

    @GetMapping(value = "/main")
    private String administrador(HttpSession session, Model model){
       String nombreUsuario = (String) session.getAttribute("nombreUsuario");
       String codigoUsuario = (String) session.getAttribute("codigoUsuario");
       session.setAttribute("codigoUsuario",codigoUsuario);
       session.setAttribute("nombreUsuario",nombreUsuario);
       model.addAttribute("user", nombreUsuario);

       return "administrator/dashboard";


    }
    @GetMapping(value = "/usuarios")
    private String usuarios(HttpSession session, Model model){
        String nombreUsuario = (String) session.getAttribute("nombreUsuario");
        model.addAttribute("nombreUsuario",nombreUsuario);
        return "administrator/usuarios";
    }
}
