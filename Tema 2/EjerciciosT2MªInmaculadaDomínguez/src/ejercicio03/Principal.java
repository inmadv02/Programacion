package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Leer un número que será la cantidad de dinero que una persona quiere retirar de su cuenta
		   bancaria. Mostrar un mensaje diciendo que “no es posible” si la cantidad que se quiere retirar
		   es mayor que el saldo de la cuenta y el nuevo saldo si se ha podido retirar.*/
		
		double retirar;
		double saldo = 3500;
		double nuevo_saldo;
		
		System.out.println("¡Hola! Bienvenido a la app de BBVA. Actualmente su saldo es de " +saldo
				+ " \n¿Cuánto dinero busca retirar de su cuenta bancaria?");
		retirar = Leer.datoDouble();
		
		if (retirar>saldo) {
			
			System.out.println("No es posible. La cantidad que quiere retirar es mayor que el saldo "
					+ "de su cuenta.");

		}
		
		else {
			
			System.out.println("\n" + retirar +" neuros han sido retirados de su cuenta con éxito.");
			nuevo_saldo = saldo - retirar;
			System.out.println("Ahora, su nuevo saldo es de: " +nuevo_saldo + " euros");
		}
		
		
	}

}
