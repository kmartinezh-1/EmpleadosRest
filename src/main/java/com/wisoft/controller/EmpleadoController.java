package com.wisoft.controller;


import javax.validation.Valid;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wisoft.entity.Empleado;
import com.wisoft.service.EmpleadoService;

@RestController
@RequestMapping(value = "/empleados")
public class EmpleadoController {

	
	@Autowired
	EmpleadoService empleadoService;
	
	
	@GetMapping
	public ResponseEntity<List<Empleado>> getAllEmpleados(){
		List<Empleado> empleados=empleadoService.getAllEmpleados();
		
		return ResponseEntity.ok(empleados);
	}
	
	
	
	@PostMapping
	public ResponseEntity<Empleado> saveEmpleado(@Valid @RequestBody  Empleado empleado){
		Empleado empleadoCreated=empleadoService.saveEmpleado(empleado);
		return ResponseEntity.status(HttpStatus.CREATED).body(empleadoCreated);
		
		
	}
	
}
