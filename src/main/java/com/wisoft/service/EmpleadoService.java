package com.wisoft.service;

import java.util.List;

 
import com.wisoft.entity.Empleado;


public interface EmpleadoService {

	public List<Empleado> getAllEmpleados();
	public Empleado saveEmpleado(Empleado empleado);
	public Empleado updateEmpleado(Empleado empleado);
	public Empleado getEmpleadoById(Long id);
	public List<Empleado> getEmpleadosByCiudadNacimiento(String ciudad);
}
