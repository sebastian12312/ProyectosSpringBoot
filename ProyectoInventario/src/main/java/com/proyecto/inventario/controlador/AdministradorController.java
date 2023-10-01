package com.proyecto.inventario.controlador;

import com.proyecto.inventario.clases.Usuarios;
import com.proyecto.inventario.servicios.AdministradorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
        log.info(":"+listaUsuario.size()+1);

        return "administrator/dashboard";
    }


    @GetMapping(value = "/usuarios")
    public String listaUsuarios(Model model){
        List<Usuarios> listaUsuario = administradorService.listarUsuarios();
        log.info(":"+listaUsuario.size()+1);
        model.addAttribute("listaUsuario",listaUsuario);
        return "administrator/usuarios";
    }
    @GetMapping(value = "/buscar")
    public String buscarUsuario(Model model , @RequestParam String numero_documento){
        Usuarios buscarUsusario = administradorService.buscarUsuario(numero_documento);
        log.info("message" +buscarUsusario.getFecha_nacimiento());
        return null;
    }
}
