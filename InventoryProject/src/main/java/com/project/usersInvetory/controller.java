package com.project.usersInvetory;

import org.springframework.web.bind.annotation.RequestMapping;
import com.project.usersInvetory.users;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @RequestMapping(value = "usuario")
    public users getUsuario(){
        users usuario = new users();
        usuario.setDni("70994268");
        return usuario;
    }

}
