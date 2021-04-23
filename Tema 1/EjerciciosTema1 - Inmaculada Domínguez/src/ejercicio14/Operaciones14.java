package ejercicio14;

public class Operaciones14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Imprime por pantalla un ticket de una tienda. El empleado se llama “John Snow”, y el cliente
		ha comprado dos latas de Coca Cola a 70 céntimos, una bolsa de pipas de 0.40 € y una espada
		llamada “Garra” que cuesta 150 €. No hace falta calcular le devolución de la compra*/
		
		String empleado = "John Snow";
		double cocaCola = 0.70;
		int numeroL = 2;
		double pipas = 0.40;
		double espada = 150.0;
		double total;
		double entrega = 155.00;
		
		System.out.println("           MERCADONA");
		System.out.println("        Reino del Norte");
		System.out.println("     P.V.P I.V.A INCLUIDO");
		System.out.println("04/10/2020   17:36   OP:064839");
		System.out.println("  Le ha atendido: " +empleado);
		System.out.println("-------------------------------\n");
		
		total = (numeroL*cocaCola) + pipas + espada;
		
		System.out.println("1.  2 COCACOLA      0.7");
		System.out.println("2.  1 PIPAS         0.4");
		System.out.println("3.  1 GARRA       150.0\n");
		System.out.println("-------------------------------\n");
		System.out.println("TOTAL...EUROS     " +total);
		System.out.println("ENTREGA...EUROS   " +entrega);
		
		
		
		
		
		
		
		
	}

}
