package com.proyecto.inventario.clases;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Data
@Entity
@Table (name = "Usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer ID;

    private String  CodigoUsuario;
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
