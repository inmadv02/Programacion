package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Crear un programa que simule el lanzamiento de una moneda (cara o cruz). Para ello, se usarán los
		siguientes métodos:
			• Generar número entero entre 1 y 2 (equivalente a lanzar la moneda). Devuelve el número
			entero generado.
			• Método para comprobar ganador, se le pasarán el número elegido por el jugador y dentro se
			generará el aleatorio llamando al método anterior. Devuelve true si son iguales o false si no.
			• Un método para mostrar en bonito el ganador. Si se le pasa true mostrar un mensaje de
			ganador y si no, debe mostrar "Siga jugando".
			• En el main, se debe crear lo necesario para simular un juego de cara o cruz.*/
		
		Moneda m1;
		//Moneda m1 = new Moneda ()
		int eleccion;
		boolean ganador;
		
		System.out.println("¡Hola! Bienvenido a nuestro programa. Aquí te ayudaremos a tomar decisiones con el milenario"
				+ " truco de 'cara o cruz'.\n");
		System.out.println("Pulse 1 o 2 para elegir cara o cruz.");
		eleccion = Leer.datoInt();
		
		m1 = new Moneda (eleccion);
		ganador = m1.ganador(eleccion);
		m1.resultado(ganador);
		
	}

}
