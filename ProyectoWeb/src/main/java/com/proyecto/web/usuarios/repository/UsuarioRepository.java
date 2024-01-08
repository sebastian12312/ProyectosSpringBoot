package com.proyecto.web.usuarios.repository;

import com.proyecto.web.usuarios.clases.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,String> {

    @Query("SELECT u FROM Usuario u WHERE u.codigo = :codigoUsuario and u.contraseña = :contraseñaUsuario")
    Usuario  findValidar(@Param("codigoUsuario") String codigoUsuario, @Param("contraseñaUsuario") String contraseñaUsuario);

    @Query("SELECT u FROM Usuario u")
    List<Usuario> listaUsuario();
    @Modifying
    @Transactional
    @Query("DELETE FROM Usuario c WHERE c.codigo = :codigoUsuario")
    void deleteBycodigo_usuario(@Param("codigoUsuario") String codigoUsuario);
}
