package ejercicio18;

import java.util.Arrays;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Alumno a;
		String nombreT;
		String apellidosT;
		int id_alumnoT, hasta, desde, tam;
		System.out.println("¡Hola! Bienvenido a nuestro programa. Aquí podra"
				+ " comprobar y cambiar las notas de sus alumnos.");
		System.out.println("Introduzca el nombre:");
		nombreT = Leer.dato();
		System.out.println("Introduzca el apellido:");
		apellidosT = Leer.dato();
		System.out.println("Introduzca el id:");
		id_alumnoT = Leer.datoInt();
		
		a = new Alumno (nombreT, apellidosT, id_alumnoT);
		
		System.out.println("¿Cuál va a ser la nota mínima que podrá aceptar el programa?");
		desde = Leer.datoInt();
		System.out.println("¿Y la máxima?");
		hasta = Leer.datoInt();
		System.out.println("Tamaño del array");
		tam = Leer.datoInt();
		
		System.out.println(a);
		
		System.out.println("SNODV OS: " + a.toString()); 
		
		//System.out.println("La nota media es: " + a.calcularNotaMedia());
		
		//a.mostrarTabla();
		
		//a.mostrarSuspensos();
		
	}

}
