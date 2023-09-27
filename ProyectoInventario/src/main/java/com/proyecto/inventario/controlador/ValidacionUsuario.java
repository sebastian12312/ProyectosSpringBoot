package com.proyecto.inventario.controlador;

import com.proyecto.inventario.clases.Usuarios;
import com.proyecto.inventario.servicios.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@Controller
@Service
@Slf4j
@RequestMapping("/auth")
public class ValidacionUsuario {

    @Autowired
    private LoginService loginService;
    @PostMapping("/login")
    public String ValidacionLogin(@RequestParam String numero_documento,@RequestParam String passoword) {
        Usuarios respuestaUsuario = loginService.validacionUsuario(numero_documento,passoword);
        if(respuestaUsuario.getEstado_usuario().equals("ok")){
        log.info("ok");
            log.info("fecha nacimiento",respuestaUsuario.getFecha_nacimiento());
        }else{
            log.error("error");
        }
        return "redirect:/auth";
    }
}
