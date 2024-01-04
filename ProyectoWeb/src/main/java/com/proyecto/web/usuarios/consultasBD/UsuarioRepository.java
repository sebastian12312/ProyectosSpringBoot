package com.proyecto.web.usuarios.consultasBD;

import com.proyecto.web.usuarios.clases.Usuarios;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios,String> {

//    validacion usuario
    @Query("SELECT u FROM Usuario u WHERE u.correo = :correoUsuario AND u.contraseña = :contraseñaUsuario")
    Usuarios findUserByCodigo(@Param("correoUsuario") String correoUsuario, @Param("contraseñaUsuario") String contraseñaUsuario);

    @Query("SELECT i FROM Usuarios i ")
    List<Usuarios> findUsuarios();


    @Modifying
    @Transactional
    @Query("DELETE FROM Usuarios c WHERE c.codigo_usuario = :codigo_usuario")
    void deleteBycodigo_usuario(@Param("codigo_usuario") String codigo_usuario);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Usuarios (codigo_usuario, tipo_documento, numero_documento, nombre, apellido, telefono, correo_personal, contraseña,contraseña_respaldo, fecha_nacimiento, id_dependencia, id_rol, estado_usuario) " +
            "VALUES (:codigo_usuario, :tipo_documento, :numero_documento, :nombre, :apellido, :telefono, :correo_personal, :contrasena,:contraseña_respaldo, :fecha_nacimiento, :id_dependencia, :id_rol, :estado_usuario)", nativeQuery = true)

    void insertarUsuario(@Param("codigo_usuario") String codigo_usuario,
                         @Param("tipo_documento") String tipo_documento,
                         @Param("numero_documento") String numero_documento,
                         @Param("nombre") String nombre,
                         @Param("apellido") String apellido,
                         @Param("telefono") String telefono,
                         @Param("correo_personal") String correo_personal,
                         @Param("contrasena") String contraseña,
                         @Param("contraseña_respaldo") String contraseña_respaldo,
                         @Param("fecha_nacimiento") String fecha_nacimiento,
                         @Param("id_dependencia") String id_dependencia,
                         @Param("id_rol") String id_rol,
                         @Param("estado_usuario") String estado_usuario);

}