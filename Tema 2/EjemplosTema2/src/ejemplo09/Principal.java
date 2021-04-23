package ejemplo09;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad = 12, edad2 =67, edad3 = 78;
		int tam = 3, tamD;
		double diez = 10;
		double [] notas;
		
		/*Declarar un array*/
		
		//int [] edades = new int [tam];
		
		System.out.println("Bienvenido a nuestro programa.");
		System.out.println("¿Cuántas notas quiere meter?");
		tamD = Leer.datoInt();
		
		notas = new double [tamD];
		//un bucle entero para cargar y otro para mostrar. No vale mezclarlos o combinarlos.
		
		//Cargar un valor.
		
		for (int i = 0; i < notas.length; i++) {
			
			//notas [i] = 9; Guardaría un 9 en todos
			
			System.out.println("Diga una nota.");
			notas [i] = Leer.datoDouble();
			
		}
		
		//Mostrar
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Sus notas son: \t" + notas [i]);
		}
		
		for (int i = 0; i < notas.length; i++) {
			notas [i]= notas [i]*diez;
		}
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Sus notas son: \t" + notas [i]);
		}
		
		//Guardar un valor
		
		//edades [0] = 3;
		
		//Sacar
		
		//a = edades [2];
		
		
		
	}

}
