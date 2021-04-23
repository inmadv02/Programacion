package ejercicio16;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Realizar una “mini-calculadora”, que realice las siguientes operaciones: suma, resta,
		multiplicación, división y decir si un número es par o impar. Se hará con un menú, y se pedirá
		en cada caso del switch los datos necesarios para realizar las operaciones. Se valorarán las
		comprobaciones que se hagan sobre los datos introducidos (por ejemplo, no dividir por cero).*/
		
		int op, tope = 2;
		Calculadora c1 = new Calculadora ();
		int cero = 0;
		double numero = 0, numero2 = 0;
		
		System.out.println("¡Hola! Bienvenido a nuestro programa. Aquí podrá sumar, restar, multiplicar y dividir"
				+ "\nlos números que quiera. Hasta podrá comprobar si son pares o impares. ");
		
		do {
			System.out.println("\nHa entrado en el menú. Pulse un número del 0 al 5 dependiendo\nde lo que quiera hacer.");
			System.out.println("1. Sumar.");
			System.out.println("2. Restar. ");
			System.out.println("3. Dividir.");
			System.out.println("4. Multiplicar.");
			System.out.println("5. Par o impar.");
			System.out.println("0. Salida.");
			
			op = Leer.datoInt();
			
			switch (op) {
			
				case 1: 
					System.out.println("Introduzca los números que quiere sumar.");  
						numero = Leer.datoDouble(); 
						numero2 = Leer.datoDouble();
				    
					System.out.printf("El resultado es: %.2f ", c1.sumar(numero, numero2));
				break;
				
				case 2:
					System.out.println("Introduzca los números que quiere restar");
					  	numero = Leer.datoDouble();
						numero2 = Leer.datoDouble(); 
				    
					System.out.printf("El resultado es: %.2f", c1.restar(numero, numero2)); 
				break;
				
				case 3:
					System.out.println("Introduzca los números que quiere dividir.");
					numero = Leer.datoDouble(); 
					numero2 = Leer.datoDouble();
					System.out.printf("El resultado es: %.2f", c1.dividir(numero, numero2));
				break;
				
				case 4:
					System.out.println("Introduzca los números que quiere multiplicar.");
					 numero = Leer.datoDouble();
					numero2 = Leer.datoDouble();
					
					System.out.printf("El resultado es: %.2f", c1.multiplicar(numero, numero2)); 
				break;
				
				case 5:
					System.out.println("Introduzca un número.");
					numero = Leer.datoDouble();
					c1.parOimpar(numero, cero);
				break;
				
				case 0:
					System.out.println("Ha decidido salir.");
				break;
				
				default:
					System.out.println("Opción incorrecta. Inténtelo de nuevo.");
			}
			 
				
		}while (op!=cero);

	}

}
