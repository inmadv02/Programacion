package ejercicio15;

public class Cuenta {
	
	String usuario;
	double saldo;
	double precio_entradas;
	
	public Cuenta (String usuario, double saldo, double precio_entradas) {
		this.usuario = usuario;
		this.saldo = saldo;
		this.precio_entradas = precio_entradas;
		
	}

	public double retirar (double sacar) {
		saldo = saldo - sacar;
		return saldo;
	}
	
	public double comprarEnt (int num_entradas) {
		double precioTotal;
		precioTotal = num_entradas * precio_entradas;
		
		return precioTotal;
	}
	
	public double ingresar (double ingresar) {
		saldo = ingresar + saldo;
		return saldo;
	}

}
