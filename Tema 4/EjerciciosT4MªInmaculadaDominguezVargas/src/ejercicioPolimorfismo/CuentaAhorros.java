package ejercicioPolimorfismo;

public class CuentaAhorros extends CCuenta{
	
	private double tiempo;

	public CuentaAhorros(String cliente, double ingresos, double gastos, double saldo, double tiempo) {
		super(cliente, ingresos, gastos, saldo);
		this.tiempo = tiempo;
	}

	public double getTiempo() {
		return tiempo;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	
	public double calcularSaldo () {
		int cien = 100;
		int porcentaje = 5;
		return saldo = ingresos * (tiempo * porcentaje/cien) - gastos;
		
	}

	@Override
	public String toString() {
		return "CuentaAhorros [tiempo=" + tiempo + ", cliente=" + cliente + ", ingresos=" + ingresos + ", gastos="
				+ gastos + ", saldo=" + saldo + "]";
	}
	
	
	

}
