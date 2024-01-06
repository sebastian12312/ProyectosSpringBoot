package com.proyecto.web.usuario.clase;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codigo;

    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String contraseña;
    private String rol;
    private String estado;
}
