package ejercicio2;

public class Operaciones {

	public static void main(String[] args)
	// Calcula y muestra en pantalla el área de una piscina olímpica (50 m de largo por 21 de ancho)

	{
		double base = 21;
		double altura = 50; 
		double a = base * altura;
		
		System.out.println("Bienvenido a nuestro programa. Aquí le ayudaremos a calcular"
				+ "cualquier operación matemática que desee");
		
		System.out.println("Área:" + a +"metros cuadrados");
		
	// ¿Cuántos litros de agua hacen falta para llenarla si tiene 2,50 m de profundidad? ¿Cuánto costará 
		// llenarla si el metro cúbico cuesta 1,80 €?
		
		double profundidad = 2.50;
		double v = a * profundidad; 
		double precio = v * 1.8;
		
		System.out.println("Volumen:" + v + " metros cúbicos");
		System.out.println("Precio total:" + precio + " euros");
		
		
	}

}
