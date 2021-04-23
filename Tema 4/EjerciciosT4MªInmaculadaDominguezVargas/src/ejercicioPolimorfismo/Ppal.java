package ejercicioPolimorfismo;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam = 2;
		CCuenta lista [] = new CCuenta [tam];
		lista [0] = new CuentaCorriente ("Pepe", 90969.0, 6904.87, 7639233.5, 67, "Tarjeta Corte Inglés");
		lista [1] = new CuentaAhorros ("Miguel", 5983.34, 2378.98, 359309.4, 360);
		CBanco b = new CBanco();
		
		System.out.printf("El saldo de su cuenta corriente es de: %.2f euros", lista[0].calcularSaldo());
		System.out.printf("\nEl saldo de su cuenta de ahorros es de: %.2f euros", lista[1].calcularSaldo());
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println();
            System.out.println("\n \t \t \t \t Datos Cuenta");
            System.out.println("\n " + lista [i].toString());
		}
		
		
	}

}
