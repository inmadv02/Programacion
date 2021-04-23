package ejercicio01;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op, cero = 0, index;
		String titulo, texto;
		
		Nota n1 = new Nota ("Primera nota", "\n Un poco de texto");
		Nota n;
		
		List <Nota> lista = new ArrayList <Nota>();
		
		lista.add(n1);
		
		System.out.println("¡Hola! Bienvenido a tu bloc de notas.");
		System.out.println("Estas son las notas que has escrito hasta ahora.\n");
		n1.mostrarNotas(lista);
		
		do {
			
		
			System.out.println("\n¿Qué te gustaría hacer?");
			System.out.println("\n1. Crear una nota nueva");
			System.out.println("2. Borrar una nota.");
			System.out.println("3. Saber cuántas notas he hecho.");
			System.out.println("4. Buscar una nota en particular.");
			System.out.println("0. Salir");
			op = Leer.datoInt();
			
			switch (op) {
			
			case 1:
				System.out.println("Introduce el título de la nota:");
				titulo = Leer.dato();
				System.out.println("Introduce tu texto aquí: ");
				texto = Leer.dato();
				n = new Nota (titulo, texto);
				n.aniadirNotas(lista, n);
				break;
			case 2:
				System.out.println("¿Qué nota te gustaría borrar?");
				n1.mostrarNotas(lista);
				index = Leer.datoInt();
				n1.borrarNota(lista, index);
				break;
			case 3:
				System.out.println("Has hecho: " + lista.size());
				break;
			case 4:
				System.out.println("¿Qué nota te gustaría ver?");
				index = Leer.datoInt();
				n1.mostrarNota(lista, index);
				break;
			case 0:
				System.out.println("Ha decidido salir.");
				break;
			default:
				System.out.println("Opción incorrecta. Inténtelo de nuevo.");
				break;
			}
			
		}while(op != cero);
		

	}

}
