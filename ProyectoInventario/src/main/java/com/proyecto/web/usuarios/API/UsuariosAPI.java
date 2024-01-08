package com.proyecto.web.usuarios.API;

import com.proyecto.web.usuarios.clases.TipoDocumentos;
import com.proyecto.web.usuarios.clases.Usuarios;
import com.proyecto.web.usuarios.servicios.AdministradorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@Slf4j
@RequestMapping("/API")
public class UsuariosAPI {
    @Autowired
    public AdministradorService administradorService;
    @GetMapping(value = "/buscar/{numero_documento}")
    public Usuarios buscarUsuario(@PathVariable("numero_documento") String numero_documento) {
        Usuarios user = administradorService.buscarUsuario(numero_documento);

        return user;
    }
    @GetMapping(value = "/tipodocumento")
    public List<TipoDocumentos> tipoDocumentos(){
        return administradorService.tipoDocumento();
    }
}
