package com.proyecto.inventario.controlador;

import com.proyecto.inventario.clases.Usuarios;
import com.proyecto.inventario.servicios.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

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
        if(respuestaUsuario != null){
          if (respuestaUsuario.getId_rol().equals(1)){

              return "redirect:/administration/"+respuestaUsuario.getNumero_documento()+"";
          }else if  (respuestaUsuario.getId_rol().equals(2)){
              return "redirect:/home/dashboard";
          }
        }else{
            log.error("error");
            return "redirect:/auth/administration";
        }

        return "redirect:/";
    }


    @GetMapping("/error")
    public String redirectionNull(){
        return "web/index";
    }
}
