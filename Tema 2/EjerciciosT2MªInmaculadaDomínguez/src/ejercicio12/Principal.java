package ejercicio12;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Se desea realizar un programa que gestione las notas de un alumno del centro. Para ello, se
		 necesita leer las notas de las 6 asignaturas de un solo alumno y mostrar por pantalla al final,
		 la nota media y el número de suspensos que tiene. No usar una variable para cada nota, ni es
		 necesario mostrar las notas de cada asignatura, solo la media y el número de suspensos.*/
		
		double nota = 0;
		int op = 0;
		int cero = 0;
		int tope = 6;
		double suma = 0;
		double media;
		int divisor = 6;
		int aprobado = 5;
		int suspensos = 0;
		
		do {
			suspensos = 0;
		
		System.out.println("¡Hola! Bienvenido a nuestro programa. Aquí le ayudaremos a gestionar las notas"
				+ " de sus alumnos."); //En vez de notas<0 poner opción para salir. Ponerlo en switch
		System.out.println("Menú:");
		System.out.println("1. Introducir notas.");
		System.out.println("0. Salir del programa.");
		
		op = Leer.datoInt();
		
			switch (op) {
				case 1:
					for (int i = 0;i<tope;i++){
						
					System.out.println("\nPor favor, introduzca una nota:");
					nota = Leer.datoDouble();
				    
					suma = suma + nota;
					
						if (nota<aprobado)
							suspensos++;
					}
					media = suma/divisor;
				    System.out.printf("La nota media es de: % .2f", media, ".");
				    System.out.println("\nTiene " + suspensos + " suspensos.");
				    break;
				case 0:
					System.out.println("Ha decidido salir del programa.");
					break;
				default:
					System.out.println("Opción incorrecta.");
		    }    
		}while (op!=cero);
		
	}

}

