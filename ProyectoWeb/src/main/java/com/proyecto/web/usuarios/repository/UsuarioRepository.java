package com.proyecto.web.usuarios.repository;

import com.proyecto.web.usuarios.clases.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,String> {

    @Query("SELECT u FROM Usuario u WHERE u.codigo = :codigoUsuario and u.contraseña = :contraseñaUsuario")
    Usuario  findValidar(@Param("codigoUsuario") String codigoUsuario, @Param("contraseñaUsuario") String contraseñaUsuario);



}
