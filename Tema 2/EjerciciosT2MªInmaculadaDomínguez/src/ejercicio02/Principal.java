package ejercicio02;

import utilidades.Leer;

public class Principal {

     public static void main(String[] args) {
		// TODO Auto-generated method stub
    	   
    	double numero1, numero2;
    	int cero = 0;
    	double division;
		
		System.out.println("¡Hola! Bienvenido a nuestro programa. Aquí podrá dividir dos números");
		System.out.println("A continuación, va a tener que introducir dos números");
		System.out.println("\nPrimer número: ");
		numero1 = Leer.datoDouble();
		System.out.println("Segundo número: ");
		numero2 = Leer.datoDouble();
		
		if (numero2==cero) 
		{
			System.out.println("\n¡Error! El segundo número que introduzca no puede ser " + cero);
		}
		
		else 
		{
		division = numero1/numero2;
		
		System.out.printf("El resultado de la división es: % .2f", division);
		
		System.out.println("\nMuchas gracias por utilizar nuestro programa. Hasta la próxima.");

		}
	}

}
