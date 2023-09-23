package com.proyecto.inventario.clases;
import lombok.Data;

import java.time.LocalDate;

@Data
public class usuario {
    private String DniUsuario;
    private String NombreUsuario;
    private String ApellidoUsuario;
    private String TelefonoUsuario;
    private String CorreoPersonalUsuario;
    private String IdUsuario;
    private String PasswordUsuario;
    private String PasswordRecover;
    private LocalDate FechaNacimiento;
    private int EdadUsuario;
    private String IDCargoUSuario;
    private String EstadoUsuario;
}
