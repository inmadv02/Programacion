package ejercicio8;

public class Operaciones8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double precioLitro = 1.16;
		int kilometros = 250;
		double consumoL = 3.4;
		double consumoKm = 100;
		double gasolinaGastada;
		double total; 
		
		System.out.println("¡Hola! Bienvenido a nuestro programa.\nAquí podrá calcular"
				+ " cuánto dinero ha gastado \nen gasolina durante sus viajes. ");
		
		 gasolinaGastada = (kilometros*consumoL)/consumoKm; 
		 
		 total = gasolinaGastada*precioLitro; 
		 
		System.out.printf("El dinero que ha gastado en gasolina durante su viaje"
		 		+ " es: % .2f euros", total); 
	

	}

}
