package com.proyecto.web.usuarios.controlador;

import com.proyecto.web.usuarios.clases.Usuarios;
import com.proyecto.web.usuarios.servicios.AdministradorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

@Slf4j
@RequestMapping("/administrador")
@Service
public class AdministradorController {

    @Autowired
    private AdministradorService administradorService;
    @GetMapping(value = "/dashboard")
    public String redirectionAdministrator() {
        List<Usuarios> listaUsuario = administradorService.listarUsuarios();
        return "administrator/dashboard";
    }


    @GetMapping(value = "/usuarios")
    public String listaUsuarios(Model model){
        List<Usuarios> listaUsuario = administradorService.listarUsuarios();
        model.addAttribute("listaUsuario",listaUsuario);
        return "administrator/usuarios";
    }
    @GetMapping(value = "/usuario/buscar/{numero_documento}")
    public Usuarios buscarUsuario(@PathVariable("numero_documento") String numero_documento) {
        Usuarios user = administradorService.buscarUsuario(numero_documento);

        return user;
    }
    @GetMapping(value = "/usuario/eliminar/{codigo_usuario}")
    public String eliminarUsuario(@PathVariable("codigo_usuario") String codigo_usuario){
        log.info("codigo_usuario0" + codigo_usuario);
        administradorService.eliminarUsuario(codigo_usuario);
        return "redirect:/administrador/usuarios";
    }
    @PostMapping(value = "/usuario/registrar")
    public String registrarUsuario(
            @RequestParam String tipo_documento,
            @RequestParam String numero_documento,
            @RequestParam String nombre,
            @RequestParam String apellido,
            @RequestParam String telefono,
            @RequestParam String correo_personal,
            @RequestParam String contraseña,
            @RequestParam String fecha_nacimiento,
            @RequestParam String id_dependencia,
            @RequestParam String id_rol,
            @RequestParam String estado_usuario){
            String codigo_usuario = "COD-001501354";
            String contraseña_respaldo = "*********";
        administradorService.registrarUsuarios(codigo_usuario,tipo_documento,numero_documento,nombre,apellido,telefono,correo_personal,contraseña,contraseña_respaldo,fecha_nacimiento,id_dependencia,id_rol,estado_usuario);
        return "redirect:/administrador/usuarios";
    }
}
