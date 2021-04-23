package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operaciones op1;
		int numero;
		
		System.out.println("¡Hola! Bienvenido a nuestro programa. Aquí podrá saber cuándo un número es positivo"
				+ " o negativo, además de comprobar si es par o impar.");
		System.out.println("Diga un número entero: ");
		numero = Leer.datoInt();
		
		op1 = new Operaciones ();
		
		if (op1.comprobar(numero)) {
			System.out.println("El número es positivo.");
			
		}else {
			System.out.println("El número es negativo.");
		}
		if (op1.parOimpar(numero)) {
			System.out.println("El número es par.");
		}else {
			System.out.println("El número es impar");
		}
	}

}
