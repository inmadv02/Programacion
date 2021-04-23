package ejercicio08;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 0;
		int tope = 10;
		int suma = 0;
		int cero = 0;
		int producto = 1;
		
		System.out.println("¡Hola! Bienvenido a nuestro programa. Aquí podrá sumar y multiplicar"
				+ " los diez números que quiera");
		
		do {
		
		for (int i = 0; i<tope ; i++) {
		
		System.out.println("Introduzca un número:");
		numero = Leer.datoInt();
		
		suma = suma + numero;
		
		producto = producto * numero; 
		
		}
		
		System.out.println("La suma total de los números introducidos es: " +suma);
		System.out.println("El producto total de los números introducidos es: " + producto);
			
		}while(numero == cero);
		
    }
	
}


