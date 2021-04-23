package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Realizar un programa que calcule el volumen de un cilindro. Vosotros debéis decidir qué método usar
		y qué valores pasarle. */
		
		double radio;
		double altura;
		Cilindro c1;
		System.out.println("¡Hola! Bienvenido a nuestro programa. Aquí podrá calcular el volumen del cilindro que quiera.");
		System.out.println("Para ello, primero debe decirnos el radio que le gustaría que tuviera el cilindro: ");
		radio = Leer.datoDouble();
		System.out.println("¿Y qué altura quiere que tenga?");
		altura = Leer.datoDouble();
		
		c1 = new Cilindro (radio, altura);
		
		System.out.printf("El volumen del cilindro es de: %.2f m3 ", c1.calcularVol(radio, altura));
	}

}
