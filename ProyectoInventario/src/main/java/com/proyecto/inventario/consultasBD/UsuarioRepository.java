package com.proyecto.inventario.consultasBD;

import com.proyecto.inventario.clases.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios,String> {
    @Query("SELECT i FROM Usuarios i ")
    List<Usuarios> findUsuarios();

    @Query("SELECT u FROM Usuarios u WHERE u.numero_documento = :numero_documento ")
    Usuarios  findUserByCodigo(@Param("numero_documento") String numero_documento);
}
