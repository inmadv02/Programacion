package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Leer un número y mostrar por la salida estándar si dicho número es o no par.
		
		double dividendo;
		int divisor = 2;
		int cero = 0;
		
		System.out.println("¡Hola! Bienvenido a nuestro programa. Aquí le ayudaremos a saber"
				+ "cuándo un número es par o no.");
		System.out.println("Para ello, introduzca el número que desee a continuación: ");
		dividendo = Leer.datoDouble();
		
		if (dividendo%divisor==cero) {
			
			System.out.println(dividendo+ " es un número par.");
		}
		
		else {
			
			System.out.println(dividendo + " no es un número par.");
		}
	}

}
