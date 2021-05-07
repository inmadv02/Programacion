package com.salesianostriana.dam.demojpag1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {

	@Id
	@GeneratedValue
	private long id;
	private String nombre;
	private String apellidos;
	
	
	public Alumno (String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
}
