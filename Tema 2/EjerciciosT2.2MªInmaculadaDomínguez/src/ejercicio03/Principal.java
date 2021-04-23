package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Crear un array de enteros unidimensional de 8 posiciones. Rellenarlo con números
		 * leídos por teclado y mostrar la media de todos los elementos y la cantidad de números
		 * “cero” introducidos.*/
		
		int numero;
		int [] numeros;
		int tam = 8;
		double media = 0, suma = 0;
		int cantCeros = 0, divisor = 8, cero = 0; 
		
		numeros = new int [tam];
		
		System.out.println("¡Hola! Bienvenido a nuestro programa.");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Por favor, introduzca 8 números.");
			numero = Leer.datoInt();
			numeros [i] = numero;
			
			if (numero==cero) {
				cantCeros++;
			}
			suma = suma + numero;
			media = suma/divisor;
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Número: " + numeros [i]);
		}
		
		System.out.printf("La media de los números que ha introducido es: % .2f", media);
		System.out.println("\nEl número de ceros es: " +cantCeros);
	}

}
