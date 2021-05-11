package com.salesianostriana.dam.demojpag11.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.salesianostriana.dam.demojpag11.servicios.AlumnoServicio;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class AlumnoControler {

	private final AlumnoServicio servicio;
	
	@GetMapping("/")
	public String todosLosAlumnos(Model model) {
		
		model.addAttribute("alumnos", servicio.findAll());
		
		return "index";
	}
	
	@GetMapping("/detalle/{id}")
	public String detalleAlumno(Model model, @PathVariable("id") long id) {
		model.addAttribute("alumno", servicio.findById(id).get());
		
		return "detalle";
	}
}
