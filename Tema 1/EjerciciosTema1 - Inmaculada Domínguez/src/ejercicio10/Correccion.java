package ejercicio10;

public class Correccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* A mi padre le gusta medir la capacidad de las personas que admite un lugar o evento en “el
		 * número de Navas (mi pueblo)”, en este caso, Navas sería una unidad de medida de número de
		 * personas que habría en un lugar, por ejemplo, si mi pueblo tiene 1500 habitantes, en un campo
		 * de futbol de 15000 espectadores, cabrían “10 Navas”.
		 * 
		 * Calcular el número de Navas que entrarían en el Camp Nou, en el concierto de U2 del estadio
		 * Olímpico donde asistieron 65000 personas y en el teatro del colegio, que tiene 600 localidades.
		 */
		
		int Navas = 1500;
		int concierto = 65000;
		int campNou = 99354;
		int teatro = 600;
		double navasCon;
		double navasNou;
		double navasTeatro;
		
		
		
		System.out.println("Hola. Bienvenido a nuestro progeama. Aquí podrá calcular el número de"
				+ " Navas cabrían en los sitios que visite");
		
		navasCon = (double) concierto/Navas;
		navasNou = (double) campNou/Navas;
		navasTeatro = (double) teatro/Navas;
		
		System.out.println("El número de Navas que cabrían en el Camp Nou serían: " + navasNou);
		System.out.printf("El número de Navas que cabrían en el concierto de U2 serían: % .2f", navasCon);
		System.out.print("\nEl número de Navas que cabrían en el Camp Nou serían: " + navasTeatro);
		
		
		


	}

}
