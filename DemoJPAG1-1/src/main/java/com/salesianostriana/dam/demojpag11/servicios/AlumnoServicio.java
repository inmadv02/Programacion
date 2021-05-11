package com.salesianostriana.dam.demojpag11.servicios;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;


import com.salesianostriana.dam.demojpag11.modelo.Alumno;
import com.salesianostriana.dam.demojpag11.repos.AlumnoRepository;
import com.salesianostriana.dam.demojpag11.servicios.base.BaseService;

@Service
public class AlumnoServicio extends BaseService <Alumno, Long, AlumnoRepository>{


	public List <String> getAllNombres(){
		
		return this.findAll().stream()
				.map(a-> a.getNombre() + " " + a.getApellidos())
				.collect(Collectors.toList());
	}
}
