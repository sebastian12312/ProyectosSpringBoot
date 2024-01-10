package com.proyecto.web.controller;

import com.proyecto.web.usuarios.clases.Usuario;
import com.proyecto.web.usuarios.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@RequestMapping(value = "/administrador")
@Controller
public class administrador    {
    @Autowired
    private UsuarioService usuarioService;
    @GetMapping(value = "/main")
    public String administrador(HttpSession session, Model model){
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
    public String usuarios(Model model){
        List<Usuario> listaUsuario = usuarioService.listaUsuario();
        model.addAttribute("listaUsuario", listaUsuario);
        return "administrator/usuarios";
    }
    @GetMapping(value = "/usuarios/eliminar")
    public String eliminarUsuario(Model model, @RequestParam() String codigoUsuario){
        usuarioService.eliminarUsuario(codigoUsuario);
        return "administrator/usuarios";
    }
    @GetMapping(value = "/usuarios/buscar")
    public String buscarUsuario(Model model, @RequestParam() String codigoUsuario){
        System.out.println("cidugi" + codigoUsuario);
        Usuario user = usuarioService.buscarUsuario(codigoUsuario);
        model.addAttribute("usuarioEncontrado", user);
        return "redirect:/administrador/usuarios";
    }
    @PostMapping (value = "/usuarios/registrar")
    public String registrarUsuario(@RequestParam String codigo,@RequestParam  String nombre,@RequestParam  String apellido,@RequestParam  String correo,@RequestParam  String telefono,@RequestParam  String contraseña,@RequestParam  String rol,@RequestParam  String estado){
       usuarioService.agregarUsuario(codigo, nombre,  apellido,  correo);
        //System.out.println( "datos " +codigo+ nombre+ apellido+ correo+ telefono+ contraseña+ rol+ estado);
        return "redirect:/administrador/usuarios";
    }
    @GetMapping(value = "/inventario")
    public String inventario(){
        return "administrator/inventario";
    }
}
