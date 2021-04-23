package ejercicio12;

public class Operaciones12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* ¡Qué follón! Mi pueblo ha tenido cortes de agua este verano debido a la sequía. Han tenido
		 * que abrir pozos. La capacidad de sacar agua de los pozos se cuenta por litros por segundo y
		 * la capacidad del depósito para guardar el agua en metros cúbicos. Serías capaz de crear un
		 * programa que calcule cuantos metros cúbicos se sacan de uno de los pozos que tiene un caudal
		 * de 8 litros por segundo si está conectado 24 horas */
		
		double caudal = 8.0;
		int horas = 24;
		int s = 3600;
		int m = 1000;
		double conversionAmetros;
		int tiempoTotal;
		double metrosCubicos;
		
		System.out.println("¡Hola! Bienvenido a nuestro programa. Aquí le ayudaremos a calcular "
				+ "\n cuántos metros cúbicos de agua se sacan de un pozo a su elección\n");
		
		
		conversionAmetros = caudal/m;
		
		tiempoTotal = horas*s;
		
		metrosCubicos = conversionAmetros*tiempoTotal;
		
		System.out.println("La cantidad de metros cúbicos que se sacan de uno de los pozos a las 24 horas"
				+ " es: " +metrosCubicos);
		
		
		

	}

}
