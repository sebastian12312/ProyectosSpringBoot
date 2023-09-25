package com.proyecto.inventario.consultasBD;

import com.proyecto.inventario.clases.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    @Query("select u from Usuario u ")
    List<Usuario> findUsuario();

}
