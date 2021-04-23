package ejercicio9;

public class Operaciones9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double rCircunferencia= 3.00;
		double rCirculo = 5.2;
		int numero = 2;
		double longitud;
		double area;
		
		/* Haz un programa que calcule la longitud de una circunferencia de radio 3 metros y
		   el área de un círculo de radio 5.2 metros */
		 
		System.out.println("¡Hola! Bienvenido a nuestro programa. Aquí le ayudaremos a calcular"
				+ " el área y la longitud de cualquier figura que desee.");
		
		longitud = (double)numero*Math.PI*rCircunferencia;
		
		area = (double)Math.PI*Math.pow(rCirculo, numero);
		
		System.out.printf("La longitud de la circunferencia es de: % .2f metros", longitud, "metros");
		System.out.printf("\nEl área del círculo es de: % .2f metros cuadrados", area, "metros cuadrados");

	}

}
