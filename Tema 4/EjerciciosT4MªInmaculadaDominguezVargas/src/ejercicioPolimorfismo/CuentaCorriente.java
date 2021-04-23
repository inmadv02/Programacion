package ejercicioPolimorfismo;

public class CuentaCorriente extends CCuenta{
	
	private double movimientos;
	private String tarjetasAsociadas;
	
	public CuentaCorriente(String cliente, double ingresos, double gastos, double saldo, double movimientos,
			String tarjetasAsociadas) {
		super(cliente, ingresos, gastos, saldo);
		this.movimientos = movimientos;
		this.tarjetasAsociadas = tarjetasAsociadas;
		
	}


	public double getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(double movimientos) {
		this.movimientos = movimientos;
	}

	public String getTarjetasAsociadas() {
		return tarjetasAsociadas;
	}

	public void setTarjetasAsociadas(String tarjetasAsociadas) {
		this.tarjetasAsociadas = tarjetasAsociadas;
	}

	
	@Override
	public String toString() {
		return "CuentaCorriente [movimientos=" + movimientos + ", tarjetasAsociadas=" + tarjetasAsociadas + ", cliente="
				+ cliente + ", ingresos=" + ingresos + ", gastos=" + gastos + ", saldo=" + saldo + "]";
	}


	public double calcularSaldo () {
		return saldo = ingresos - gastos;
		
	}
	

}
