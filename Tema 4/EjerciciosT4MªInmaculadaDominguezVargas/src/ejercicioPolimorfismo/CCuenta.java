package ejercicioPolimorfismo;

public abstract class CCuenta {
	
	public String cliente;
	public double ingresos;
	public double gastos;
	public double saldo;
	
	public CCuenta(String cliente, double ingresos, double gastos, double saldo) {
		super();
		this.cliente = cliente;
		this.ingresos = ingresos;
		this.gastos = gastos;
		this.saldo = saldo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getIngresos() {
		return ingresos;
	}

	public void setIngresos(double ingresos) {
		this.ingresos = ingresos;
	}

	public double getGastos() {
		return gastos;
	}

	public void setGastos(double gastos) {
		this.gastos = gastos;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "CCuenta [cliente=" + cliente + ", ingresos=" + ingresos + ", gastos=" + gastos + ", saldo=" + saldo
				+ "]";
	}
	
	public abstract double calcularSaldo();
	
	

}
