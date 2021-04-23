package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Realizar un programa que lea un texto del teclado y un número entero y muestre en pantalla dicho
		texto una cantidad de veces igual al número introducido. La clase se puede llamar "Copiado". */
		
		String texto;
		int numero;
		Copiado c1;
		System.out.println("¡Hola! Bienvenido a nuestro programa. Aquí podrá repetir un texto el número de veces"
				+ "que quiera.");
		System.out.println("Por favor, escriba a continuación su texto: ");
		texto = Leer.dato();
		System.out.println("¿Cuántas veces quiere que se repita?");
		numero = Leer.datoInt();
		
		c1 = new Copiado (texto, numero);
		System.out.println(c1.repetir(texto, numero));
		

	}

}
