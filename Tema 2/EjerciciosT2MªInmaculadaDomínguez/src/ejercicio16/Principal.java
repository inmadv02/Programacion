package ejercicio16;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Realizar una “mini-calculadora”, que realice las siguientes operaciones: suma, resta,
		multiplicación, división y decir si un número es par o impar. Se hará con un menú, y se pedirá
		en cada caso del switch los datos necesarios para realizar las operaciones. Se valorarán las
		comprobaciones que se hagan sobre los datos introducidos (por ejemplo, no dividir por cero).*/
		
		int op;
		double numero = 0, numero2 = 0;
		int tope;
		double suma = 0, division = 1, multiplicacion = 1, resta = 0;
		int dos = 2, cero = 0;
		
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
			System.out.println("¿Cuántos números quiere sumar?");
			tope = Leer.datoInt();
			for (int i = 0; i < tope; i++) { 
			System.out.println("Introduzca los números que quiere sumar");
				numero = Leer.datoDouble();
				suma = suma + numero;
			}
			System.out.println("El resultado de la suma es: " +suma);
			break;
		case 2:
			System.out.println("¿Cuántos números quiere restar?");
			tope = Leer.datoInt();
			for(int i = 0; i < tope; i ++) {
				System.out.println("Introduzca los números que quiere restar.");
				numero = Leer.datoDouble();
				if (i<dos) {
					resta = (numero2 - numero) - resta ;
					System.out.println("El resultado de la resta es: " +resta);
				}else {
					resta = numero - resta;
					System.out.println("El resultado de la resta es: " +resta);
				}
			}
			break;
		case 3:
			for (int i = 0; i < dos; i++) {
			System.out.println("Introduzca los números que quiere dividir");
			numero = Leer.datoDouble();
			    while (numero == 0){
					System.out.println("No se puede divir entre 0");
					System.out.println("Inténtelo con otro número.");
					numero = Leer.datoDouble();
				}
			division = division/numero;
			}
			System.out.printf("El resultado de la divisón es: % .2f", division);
			break;
		case 4:
			System.out.println("¿Cuántos números quiere multiplicar?");
			tope = Leer.datoInt();
			for (int i = 0; i < tope; i++) {
				System.out.println("Introduzca los números que quiere multplicar");
				numero = Leer.datoDouble();
				multiplicacion = multiplicacion * numero;
			}
			System.out.printf("El resultado de la multiplicación es: % .2f", multiplicacion);
			break;
		case 5:
			System.out.println("Introduzca un número.");
			numero = Leer.datoDouble();
			if (numero/dos ==cero) {
				System.out.println(numero + " es par.");
			}else {
				System.out.println(numero + " es impar.");
			}break;
		case 0:
			System.out.println("Ha decidido salir.");
			break;
		default:
			System.out.println("Opción incorrecta. Pulse otro número.");
		}
		
		}while (op!=0);
	}

}
