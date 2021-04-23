package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		int cero = 0;
		double peso;
		double mercurio =  0.38;
		double venus = 0.91;
		double tierra = 1.00;
		double marte = 0.38;
		double jupiter = 2.53;
		double saturno = 1.06;
		double urano = 0.92;
		double neptuno = 1.2;
		double pesoNuevo;
		
					
		
		System.out.println("¡Hola! Bienvenido a nuestro programa. Aquí podrá saber cuál sería su peso"
				+ "\nen cada uno de los planetas que forman nuestro Sistema Solar");
		System.out.println("Para ello, debe introducir su peso aquí: ");
		peso = Leer.datoDouble();
		
		do {

		System.out.println("\nA continuación, si quiere saber su peso en un planeta en concreto, pulse el"
				+ " siguiente número:");
		System.out.println("1. Mercurio");
		System.out.println("2. Venus");
		System.out.println("3. Tierra");
		System.out.println("4. Marte");
		System.out.println("5. Júpiter");
		System.out.println("6. Saturno");
		System.out.println("7. Urano");
		System.out.println("8. Neptuno");
		System.out.println("9. Salir");
		
		op = Leer.datoInt();
		
		switch (op) {
		
		  case 1: 
			  pesoNuevo = peso * mercurio;
			  System.out.printf("Su peso en Mercurio es de: % .2f kg", pesoNuevo);
			  break;
		  case 2:
			  pesoNuevo = peso * venus;
			  System.out.printf("Su peso en Venus es de: % .2f kg", pesoNuevo);
			  break;
		  case 3:
			  pesoNuevo = peso * tierra;
			  System.out.printf("Su peso en la Tierra es de: % .2f kg", pesoNuevo);
			  break;
		  case 4: 
			  pesoNuevo = peso * marte;
			  System.out.printf("Su peso en Marte es de: % .2f kg", pesoNuevo);
			  break;
		  case 5:
			  pesoNuevo = peso * jupiter;
			  System.out.printf("Su peso en Júpiter es de: % .2f kg", pesoNuevo);
			  break;
		  case 6:
			  pesoNuevo = peso * saturno;
			  System.out.printf("Su peso en Saturno es de: % .2f kg", pesoNuevo);
			  break;
		  case 7: 
			  pesoNuevo = peso * urano;
			  System.out.printf("Su peso en Urano es de: % .2f kg", pesoNuevo);
			  break;
		  case 8:
			  pesoNuevo = peso * neptuno;
			  System.out.printf("Su peso en Neptuno es de: % .2f kg", pesoNuevo);
			  break;
		  case 9:
			  System.out.println("Ha decidido salir");
			  break;
		  default:
			  System.out.println("Opción incorrecta. Pruebe con un número del 1 al 8.");
		}
		
	    }while(op!=cero);
		
		System.out.println("última línea del programa. Se hace solo al final.");
		
	}

}
