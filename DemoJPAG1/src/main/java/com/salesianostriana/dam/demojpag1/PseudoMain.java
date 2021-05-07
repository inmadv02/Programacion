package com.salesianostriana.dam.demojpag1;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class PseudoMain {

	private final AlumnoRepository repos;
	
	@PostConstruct
	public void run() {
	
		Alumno a = new Alumno ("Pepe", "Marquínez");
		Alumno b = new Alumno ("Juan", "García");
		
		repos.save(a);
		repos.save(b);
		
		List <Alumno> queryResult = repos.findAll();
		
		System.out.println(queryResult);
		
	}
}
