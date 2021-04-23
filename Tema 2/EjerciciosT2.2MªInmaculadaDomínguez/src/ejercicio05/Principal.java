package ejercicio05;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numeros;
		int tam, hasta, desde;
		int suma = 0;
		int mayor, menor;
		Random r = new Random (System.nanoTime());
		
		System.out.println("¡Hola! Bienvenido a nuestro programa");
		System.out.println("¿Cuántos números quiere introducir?");
		tam = Leer.datoInt();
		numeros = new int [tam];
		System.out.println("¿A partir de qué número quiere que empiecen a surgir números aleatorios?");
		desde = Leer.datoInt();
		System.out.println("¿Y a partir de qué número quiere que paren?");
		hasta = Leer.datoInt();
		
		for (int i = 0; i<numeros.length; i++) {
			numeros [i] = r.nextInt(hasta-desde+1)+desde;
		}
		for (int i = 0; i<numeros.length; i++) {
			System.out.println(numeros[i]);
			
			suma = suma + numeros [i];
		}
		menor = mayor = numeros [0];
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros [i] > mayor) {
				mayor = numeros [i];
			}
			if (numeros [i] < menor) {
				menor = numeros [i];
			}
		}
		System.out.println("El resultado de la suma de estos números aleatorios es: " + suma);
		System.out.println("El valor más pequeño que se ha guardado es: " + menor);
		System.out.println("El valor más grande que se ha guardado es: " + mayor);
    }
}
