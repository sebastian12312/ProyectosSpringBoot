package com.proyecto.web.usuarios.repository;

import com.proyecto.web.usuarios.clases.users;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Users extends JpaRepository<users,String> {
}
