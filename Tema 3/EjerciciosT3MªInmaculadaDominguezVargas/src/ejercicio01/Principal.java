package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Hacer un programa que calcule el área de un círculo en cm2. En el main debemos crear un objeto tipo
		 * Círculo y llamar a dicho método. Mejorar el programa añadiendo a la clase Círculo otro método que
		 * calcule el área del círculo en m2.*/
		
		Círculo c1;
		double resultadoCm = 0.0;
		double resultadoM = 0.0;
		
		System.out.println("¡Hola! Bienvenido a nuestro programa. Aquí podrá calcular el área de un círculo en cm2 y m2");
		
		c1 = new Círculo (2.53);
		
		System.out.println("El radio del círculo es: " + c1.radio);
		
		resultadoCm = c1.areaCm();
		
		System.out.printf("El área de ese círculo es: %.2f cm2", resultadoCm );
		resultadoM = c1.areaM();
		System.out.printf("\nAsimismo, su área en metros cuadrados es: %.2f", resultadoM);

	}

}
