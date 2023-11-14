package com.udea.registrosUsuarios.repositorio;

import com.udea.registrosUsuarios.entidad.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuariosRepositorio extends JpaRepository <Usuarios, Integer> {

}
// aqui esta el CRUD
