package com.proyecto.web.usuarios.clases;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Data
@Entity
@Table (name = "Usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private String codigo_usuario;

    private Integer  tipo_documento;
    private String  numero_documento;
    private String  nombre;
    private String  apellido;
    private String  telefono;
    private String  correo_personal;
    private String  contraseña;
    private String  contraseña_respaldo;
    private String    fecha_nacimiento;
    private String  id_dependencia;
    private Integer  id_rol;
    private String estado_usuario;


}
