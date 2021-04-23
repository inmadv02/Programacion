package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1, numero2;
		
		System.out.println("¡Hola! Bienvenido a nuestro programa. Aquí le ayudaremos a comparar dos números"
				+ " y a decir cuál de los dos es mayor.");
		System.out.println("A continuación, va a tener que introducir dos números");
		System.out.println("\nPrimer número: ");
		numero1 = Leer.datoInt();
		System.out.println("Segundo número: ");
		numero2 = Leer.datoInt();
		
		if (numero1>numero2) 
		{
			System.out.println("\n " + numero1 + " es mayor que" + numero2);
		}
		
		if (numero1==numero2) 
		{
			System.out.println("\n" + numero1 + " es igual que " + numero2);
		}
		
		else
		{
			System.out.println("\n"+ numero1 + " es menor que " + numero2);
		}
		
		System.out.println("\nMuchas gracias por utilizar nuestro programa. Hasta la próxima.");

	}

}
