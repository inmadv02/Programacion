package ejemplo01;

import utilidades.Leer; 

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad = 18;
		String nombre = "Inmaculada";
		String apellido1 = "Domínguez";
		String apellido2 = "Vargas";
		
		System.out.println("¡Hola!");
		System.out.println("Ahora tiene: " +edad);
		System.out.println("Diga su edad:");
		edad = Leer.datoInt();
		System.out.println("Diga su nombre:");
		nombre = Leer.dato();
		System.out.println("Diga su primer apellido:");
		apellido1 = Leer.dato();
		System.out.println("Diga su segundo apellido:");
		apellido2 = Leer.dato();
		
		System.out.println("Y después de leer, tiene: " +edad);

	}

}
