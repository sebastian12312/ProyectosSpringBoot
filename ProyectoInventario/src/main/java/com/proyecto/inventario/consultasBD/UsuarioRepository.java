package com.proyecto.inventario.consultasBD;

import com.proyecto.inventario.clases.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios,Integer> {
    @Query("SELECT i FROM Usuarios i ")
    List<Usuarios> findUsuarios();

}
