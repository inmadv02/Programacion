package ejercicio18;

import java.util.Arrays;
import java.util.Random;

public class Alumno {
	
	private String nombre;
	private String apellidos;
	private int id_alumno;
	private int [] notas;
	
	public Alumno (String nombre, String apellidos, int id_alumno) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.id_alumno = id_alumno;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getId_alumno() {
		return id_alumno;
	}

	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}
	
	public int [] rellenarArray (int desde, int hasta, int tam) {
		Random r = new Random (System.nanoTime());
		notas = new int [tam];
		
		for (int i = 0; i < notas.length; i++) {
			notas [i] = r.nextInt(hasta-desde+1)+desde;
		
	    }
		return notas;
	}
	
	public double calcularNotaMedia () {
		double suma = 0.0;
		double media;
		
		for (int i = 0; i < notas.length; i++) {
			suma = suma + notas[i];
		}
		
		media = suma/notas.length;
		return media;
		
	}
	
	public void mostrarTabla () {
		System.out.println("\n\tNotas");
		System.out.println("__________________");
		for (int i = 0; i < notas.length; i++) {
			System.out.println("\t" + notas [i]);
		}
	}
	
	public void mostrarSuspensos () {
		int contador = 0, cinco = 5;
		for (int i = 0; i < notas.length; i++) {
			while (notas [i] < cinco) {
				contador++;
			}
		
		}
		
		System.out.println("Hay " +contador + "suspensos");
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", id_alumno=" + id_alumno + ", notas="
				+ Arrays.toString(notas) + "]";
	}

	//public String toString() {
		//return "Alumno" + "\n___________"
				//+ "\nNombre: " + nombre + "\nApellidos: " + apellidos + "\nid_alumno: " + id_alumno;
	//}
	
	
	
	
}
