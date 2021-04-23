package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*7. Crear un programa que gestione un sorteo de lotería. Tendremos la clase Sorteo y la principal para
			 probar todo. El programa debe hacer lo siguiente:
				• Posibilidad de comprar/generar un décimo (elegir un número).
				• Hacer sorteo, donde se generará aleatoriamente el número premiado.
				• Comprobar si nuestro décimo está premiado.
				• Mostrar si eres ganador o no (en el main). */
		
		int op, op2;
		int numero = 0;
		int cero = 0;
		Sorteo s1 = new Sorteo ();
		
		do {
		System.out.println("¡Hola! Bienvenido a nuestro programa de loterías. ¿Qué es lo que desea hacer?");
		System.out.println("1. Comprar un décimo.");
		System.out.println("2. ¿He ganado?");
		System.out.println("0. Salir.");
		op = Leer.datoInt();
		
		switch (op) {
		
			case 1:
				System.out.println("¿Qué es lo que prefiere hacer?");
				System.out.println("1. Comprar un décimo de nuestra tienda.");
				System.out.println("2. Generar un décimo con el número que quiera.");
				op2 = Leer.datoInt();
				
				switch (op2) {
					
					case 1:
						System.out.println("El décimo que ha salido es: " +s1.sortear());
						break;
					case 2:
						System.out.println("\n¿Qué número quiere elegir? Debe ser un número que esté entre el 1 y el 100.");
						numero = Leer.datoInt();
						break;
					default:
						System.out.println("Opción incorrecta. Pruebe de nuevo.");
				 }
			break;
			  
			case 2:
				
				s1.setNumero(numero);
				System.out.println("¿Estará premiado?");
					if (s1.comprobar(numero)) {
						System.out.println("¡Felicidades, ha ganado!");
					}else {
						System.out.println("¡Vaya! No lo ha conseguido. Inténtelo de nuevo.");
					}
				break;
			case 0:
				System.out.println("Ha decidido salir.");
				break;
			default:
				System.out.println("Opción incorrecta. Pruebe de nuevo.");
		}
		
		}while (op!=cero);
			
	}

}
