package com.salesianostriana.dam.demojpag11;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.salesianostriana.dam.demojpag11.modelo.Alumno;
import com.salesianostriana.dam.demojpag11.servicios.AlumnoServicio;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class InitData {

	private final AlumnoServicio servicio;
	
	@PostConstruct
	public void init() {
		List <Alumno> lista = Arrays.asList(
					new Alumno("Luismi", "López"),
					new Alumno("Ángel", "Naranjo"));
		
		lista.forEach(servicio::save);
	}
}
