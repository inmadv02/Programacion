package ejercicio09;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno a1;
		String nombreT;
		String apellidosT;
		double hasta, desde, notaNueva;
		int tam, posicion;
		
		System.out.println("¡Hola! Bienvenido a nuestro programa. Aquí podra"
				+ " comprobar y cambiar las notas de sus alumnos.");
		System.out.println("Introduzca el nombre:");
		nombreT = Leer.dato();
		System.out.println("Introduzca el apellido:");
		apellidosT = Leer.dato();
		
        a1 = new Alumno (nombreT, apellidosT);
		
		System.out.println(a1);
	
		System.out.println("Máximo de notas que permitirá el programa.");
		tam = Leer.datoInt();
		System.out.println("Nota máxima que permitirá el programa.");
		hasta = Leer.datoDouble();
		System.out.println("Nota mínima que permitirá el programa.");
		desde = Leer.datoDouble();
		
		a1.ponerNotas(hasta, desde, tam);
		
		a1.mostrarNotas();
		
		System.out.println("El número de suspensos es: " + a1.contadorSuspensos());
		
		System.out.printf("La nota media de " + nombreT + " es: %.2f", a1.calcularNotaMedia());
		
		System.out.println("¿Qué nota le gustaría modificar?");
		posicion = Leer.datoInt();
		System.out.println("Introduzca el valor por el que quiere cambiar la nota:");
		notaNueva = Leer.datoDouble();
		System.out.println(a1.CambiarNota(posicion, notaNueva));
		a1.mostrarNotas();
		
		
		
	}

}
