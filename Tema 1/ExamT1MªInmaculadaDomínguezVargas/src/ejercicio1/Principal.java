package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double hipoteca = 300.0;
		double cuotaCoche = 150.0;
		double ingresos = 1200.0;
		int multiplicacion = 100;
		double deudas;
		double division;
		double resultadoFinal;
		
		System.out.println("¡Hola! Bienvenido a nuestro programa. Aquí le ayudaremos a calcular"
				+ " su NE mensual siempre que lo necesite.");
		
		deudas = hipoteca + cuotaCoche;
		division = deudas/ingresos;
		resultadoFinal = division*multiplicacion;
		
		System.out.println("\nLas deudas que debe pagar son de: " + deudas + " euros\n");
		System.out.println("Teniendo en cuenta sus ingresos, su NE es de: " +resultadoFinal);
		

	}

}
