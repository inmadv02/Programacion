package ejercicio02;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Documento d = new Documento ("Isotrol", "Edificio Bluenet, Calle Isaac Newton, 3, 41092 Sevilla");
		TarjetaVisita t = new TarjetaVisita ("Isotrol", 
				         "Edificio Bluenet, Calle Isaac Newton, 3, 41092 Sevilla", "José Gómez", "00000000");
		Carta c = new Carta ("Isotrol", 
				  "Edificio Bluenet, Calle Isaac Newton, 3, 41092 Sevilla", "04/02/2021");
	
		
		d.imprimirContenido();
		System.out.println();
		t.imprimirContenido();
		System.out.println();
		c.imprimirContenido();
	
	}

}
