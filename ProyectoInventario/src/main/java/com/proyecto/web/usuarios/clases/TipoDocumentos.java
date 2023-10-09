package com.proyecto.web.usuarios.clases;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "tipodocumento")
public class TipoDocumentos {
    @Id
    private String tipo_documento;
    private String nombre;
    private String descripcion;
}
