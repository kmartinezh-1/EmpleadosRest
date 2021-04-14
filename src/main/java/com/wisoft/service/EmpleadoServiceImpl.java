package com.wisoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisoft.entity.Empleado;
import com.wisoft.repository.EmpleadoRepository;


@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	EmpleadoRepository empleadoRepository;
	
	@Override
	public List<Empleado> getAllEmpleados() {
		// TODO Auto-generated method stub
		return empleadoRepository.findAll();
	}

	@Override
	public Empleado saveEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return (Empleado) empleadoRepository.save(empleado);
	}

	@Override
	public Empleado updateEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleado getEmpleadoById(Long id) {
		// TODO Auto-generated method stub
		return (Empleado) empleadoRepository.findById(id).orElse(null);
	}

	@Override
	public List<Empleado> getEmpleadosByCiudadNacimiento(String ciudad) {
		// TODO Auto-generated method stub
		return empleadoRepository.findByCiudadNacimiento(ciudad);
	}

}
