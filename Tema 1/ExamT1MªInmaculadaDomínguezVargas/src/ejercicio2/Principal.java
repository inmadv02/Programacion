package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		int numCables = 100;
		double precioCables = 0.14;
		int numPortalamparas = 300;
		double precioPortalamparas = 0.68;
		int numTimbres = 20;
		double precioTimbres = 1.50;
		int numPolimeros = 3;
		double precioPolimeros = 15.50;
		
		//I.V.A
		int iva = 21;
		int divisor = 100;
		
		double presupuesto = 400;
		
		//V.Operaciones
		double totalCables;
		double totalPortalamparas;
		double totalTimbres;
		double totalPolimeros;
		double sumaCyP;
		double sumaTyPl;
		double precioTotal;
		double añadido;
		double precioFinal;
		double sobra;
		
		//Operaciones
		
		totalCables = numCables*precioCables;
		totalPortalamparas = numPortalamparas*precioPortalamparas;
		sumaCyP =  totalCables + totalPortalamparas;
		
		totalTimbres = numTimbres*precioTimbres;
		totalPolimeros = numPolimeros*precioPolimeros;
		sumaTyPl = totalTimbres + totalPolimeros;
		
		precioTotal = sumaCyP + sumaTyPl;
		añadido = (precioTotal*iva)/divisor;
		precioFinal = precioTotal + añadido;
		
		
		System.out.println("\n\t\t     TodoElectro  S.A.");
		System.out.println("\t\t        La Cartuja");
		System.out.println("\t\t   P.V.P  I.V.A INCLUIDO");
		System.out.println("\t\t     01/09/2020  9:35");
		
		System.out.println("\n ---------------------------------------------------------\n");
		
		System.out.println("   Cantidad\t  Producto\tPrecio Und.\tSubtotal\n");
		
		System.out.printf("     " +numCables + "\tMetros Cable\t   " +precioCables + "\t\t% .2f",
				          totalCables);
		
		System.out.printf("\n     " +numPortalamparas + "\tPortalamparas\t   " +precioPortalamparas
				+ "\t       % .2f" , totalPortalamparas);
		
		System.out.println("\n     " +numTimbres + " \t  Timbres\t   " +precioTimbres + "\t\t " 
				+totalTimbres);
		
		System.out.println("      " +numPolimeros + " \t Polímeros\t  " +precioPolimeros + "\t\t " 
				+totalPolimeros);
		
		System.out.println("\n ---------------------------------------------------------\n");
		
		System.out.println("  TOTAL SIN IVA....EUROS \t \t \t" + precioTotal);
		System.out.println("  I.V.A....EUROS  \t \t \t \t " + añadido);
		System.out.println("  PRECIO FINAL....EUROS  \t \t \t" + precioFinal);
		
		sobra = presupuesto - precioFinal;
		
		System.out.printf("\n\nDe los 400€ con los que cuenta el colegio, le sobran: % .2f euros",sobra);
		
		

	}

}
