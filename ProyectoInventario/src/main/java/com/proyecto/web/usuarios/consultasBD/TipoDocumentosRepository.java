package com.proyecto.web.usuarios.consultasBD;

import com.proyecto.web.usuarios.clases.TipoDocumentos;
import com.proyecto.web.usuarios.clases.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoDocumentosRepository extends JpaRepository<TipoDocumentos,String> {
    @Query("SELECT i FROM TipoDocumentos i ")
    List<TipoDocumentos> findByDocumentosType();
}
