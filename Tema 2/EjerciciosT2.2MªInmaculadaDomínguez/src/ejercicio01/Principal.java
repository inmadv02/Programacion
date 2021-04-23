package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Crear un array de tipo String, inicializarlo en la propia definición con el nombre de 5
		personas y mostrarlo por la pantalla mediante un bucle for.*/
		
		int tam = 5;
		String [] autores = {"Antonio Machado","Miguel Unamuno","Pío Baroja","José Martínez Ruíz 'Azorín","Ramón Mª del Valle-Inclán"};
		String [] listado;
		
		System.out.println("¡Hola! Bievenido a nuestro programa, el cual se centra en la generación del"
				+ " 98 de la literatura española.\n");
		System.out.println("A continuación, nombraremos los nombres de los autores más famosos de esta"
				+ " generación.");
		
		System.out.println("¿Cuántos autores quiere que se muestren?");
		  tam = Leer.datoInt();
		  listado = new String [tam];
		  
		for (int i = 0; i < listado.length; i++) {
			System.out.println("El autor se llama: " + autores [i]);
		}
	
	}

}
