package com.proyecto.web.usuarios.controller;



import com.proyecto.web.usuarios.clases.Usuario;
import com.proyecto.web.usuarios.service.UsuarioService;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@Slf4j
public class login {

    @Autowired
    private UsuarioService usuarioService;
    @PostMapping(value = "/login")
    private String validacionUsuario(@RequestParam String codigoUsuario, @RequestParam String contraseñaUsuario, HttpSession session, Model model) {

        Usuario user = new Usuario();
        user = usuarioService.validacionUsuario(codigoUsuario, contraseñaUsuario);
        try {
            if(user.getRol() != null){

                if(user.getRol().equals("administrador")){
                    session.setAttribute("nombreUsuario",user.getNombre());
                    session.setAttribute("codigoUsuario",user.getCodigo());
                    return "redirect:/administrador/main";
                }else if(user.getRol().equals("usuario")){
                    return "redirect:/usuario/home";
                }else{
                    return "redirect:/";
                }
            }else{
                return "redirect:/";
            }
        }catch (Exception  e){
            System.out.println("ERROR DE SESION: " + e.getMessage());
            return "redirect:/";
        }

    }
}
