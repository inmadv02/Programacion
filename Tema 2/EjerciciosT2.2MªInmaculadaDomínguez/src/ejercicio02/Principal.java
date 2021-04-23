package ejercicio02;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Implementar un programa que rellene automáticamente un array de enteros con 10
		 * posiciones, cada elemento debe contener el valor del doble de su índice. Mostrar el
		 * resultado por pantalla.*/
		
		int doble = 2;
		int tam = 10;
		int [] numeros;

		
		numeros = new int [tam];
		
		System.out.println("Bienvenido a nuestro programa. Aquí podemos generar automáticamente 10 números,\n"
				+ "siendo su valor el doble que su índice.");

		for (int i = 0; i < numeros.length; i++) {
			numeros [i] = i*doble;
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("El número es: \t" + numeros [i]);
		}
	}	
}
