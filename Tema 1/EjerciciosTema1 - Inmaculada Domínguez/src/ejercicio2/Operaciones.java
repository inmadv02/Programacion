package ejercicio2;

public class Operaciones {

	public static void main(String[] args)
	// Calcula y muestra en pantalla el �rea de una piscina ol�mpica (50 m de largo por 21 de ancho)

	{
		double base = 21;
		double altura = 50; 
		double a = base * altura;
		
		System.out.println("Bienvenido a nuestro programa. Aqu� le ayudaremos a calcular"
				+ "cualquier operaci�n matem�tica que desee");
		
		System.out.println("�rea:" + a +"metros cuadrados");
		
	// �Cu�ntos litros de agua hacen falta para llenarla si tiene 2,50 m de profundidad? �Cu�nto costar� 
		// llenarla si el metro c�bico cuesta 1,80 �?
		
		double profundidad = 2.50;
		double v = a * profundidad; 
		double precio = v * 1.8;
		
		System.out.println("Volumen:" + v + " metros c�bicos");
		System.out.println("Precio total:" + precio + " euros");
		
		
	}

}
