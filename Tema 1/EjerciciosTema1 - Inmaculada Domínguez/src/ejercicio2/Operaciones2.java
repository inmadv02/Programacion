package ejercicio2;

public class Operaciones2 {

	public static void main(String[] args)
	// Calcula y muestra en pantalla el �rea de una piscina olímpica (50 m de largo por 21 de ancho)

	{
		double base = 21;
		double altura = 50; 
		double area; 
		
		System.out.println("Bienvenido a nuestro programa. Aquí le ayudaremos a calcular"
				+ "cualquier operación matemática que desee");
	
		area = base * altura;
		
		System.out.println("Área:" + area +"metros cuadrados");
		
	// ¿Cuántos litros de agua hacen falta para llenarla si tiene 2,50 m de profundidad? ¿Cuánto costará 
		// llenarla si el metro cúbico cuesta 1,80 euros?
		
		double profundidad = 2.50;
		double volumen; 
		double precio; 
		
		volumen  = area * profundidad;
		precio = volumen * 1.8; 
		
		System.out.println("Volumen:" + volumen + " metros c�bicos");
		System.out.println("Precio total:" + precio + " euros");
		
		
	}

}
