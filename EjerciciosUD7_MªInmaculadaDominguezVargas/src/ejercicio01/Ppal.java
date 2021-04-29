package ejercicio01;

import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Bienvenido a nuestro programa. \n");
		LeerDatosPersonales();
	}
		
		
			
			public static void LeerDatosPersonales() {
				Scanner sc = new Scanner( System.in );
				String aux;
				boolean bucle = true;
				Persona p1 = new Persona ();
				String nombre, apellidos, dni;
				int edad;

			do {
				try {
					System.out.println("Introduzca su nombre.");
					nombre = sc.nextLine();
					System.out.println("Introduzca sus apellidos.");
					apellidos = sc.nextLine();
					System.out.println("Introduzca su edad.");
					aux = sc.nextLine ();
					edad = Integer.parseInt(aux);
					System.out.println("Introduzca su DNI.");
					dni = sc.nextLine();
					bucle = false;
				}
				catch (NumberFormatException numberFormatException) {
					
				 System.err.printf( "\nException: %s\n", numberFormatException );
				 sc.nextLine();
				 System.out.println("Debe introducir números enteros. Inténtelo de nuevo.\n" );
				 
				}
				
				finally {
					System.out.println("Cambios guardados");
				}
			
			
		}while(bucle);

	}
}

