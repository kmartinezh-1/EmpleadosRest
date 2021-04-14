package com.wisoft.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wisoft.entity.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado,Long>{

	
	public List<Empleado> findByCiudadNacimiento(String ciudad);
}
 