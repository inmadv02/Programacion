package ejercicio09;

import java.util.Arrays;

public class Alumno {
	
	private String nombre;
	private String apellido;
	private double [] notas;
	
	public Alumno (String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		
	}
	
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public double[] getNotas() {
		return notas;
	}


	public void setNotas(double[] notas) {
		this.notas = notas;
	}


	public double [] ponerNotas (double hasta, double desde, int tam){
		this.notas = new double [tam];
		
		for (int i = 0; i < notas.length; i++) {
			notas [i] = Math.random() * (hasta-desde)+desde;
		}
		return notas;
	}
	
	public void mostrarNotas () {
		
		System.out.println("\t \t Notas");
		System.out.println("         ______________________________");
		for (int i = 0; i < notas.length; i++) { 
		System.out.printf("\t \t %.2f \n" , notas [i]);
		}
		
	}
	
	public double calcularNotaMedia () {
		double suma = 0;
		double media;
		for (int i = 0; i < notas.length; i++) {
			suma = suma + notas [i];
		}
		return media = suma/notas.length;	
	}
	
	public int contadorSuspensos () {
		int contador = 0, cinco = 5;
		for (int i = 0; i < notas.length; i++) {
			 if(notas [i] < cinco) {
				contador++;
			}
		}
		return contador;
	}
	public double CambiarNota (int posicion, double notaNueva) {
		
		return notas [posicion] = notaNueva;
	}

}
