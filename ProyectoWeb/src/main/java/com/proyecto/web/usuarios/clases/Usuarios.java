package com.proyecto.web.usuarios.clases;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Data
@Entity
@Table (name = "usuario")
public class Usuarios {
    @Id
    private String codigoUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String correoUsuario;
    private String telefonoUsuario;
    private String contraseñaUsuario;
    private String rolUsuario;
    private String estadoUsuario;
}
