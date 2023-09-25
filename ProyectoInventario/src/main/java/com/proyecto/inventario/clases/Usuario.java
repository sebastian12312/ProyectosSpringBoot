package com.proyecto.inventario.clases;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Entity
@Table(name="Usuario")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer id;

    private String  CodigUsuario;
    private String  TipoDocumento;
    private String  Nombre;
    private String  Apellido;
    private String  Telefono;
    private String  CorreoPersonal;
    private String  Contraseña;
    private String  ContraseñaRespaldo;
    private Date    FechaNacimiento;
    private String  IDCargo;
    private String  EstadoUsuario;
}
