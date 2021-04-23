package ejercicio06;

public abstract class Cuenta {
	
	private String nombreUsuario;
	private int id_cliente;
	private double saldo;
	private double mantenimiento;
	

	public Cuenta(String nombreUsuario, int id_cliente, double saldo, double mantenimiento) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.id_cliente = id_cliente;
		this.saldo = saldo;
		this.mantenimiento = mantenimiento;
	}



	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public double getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(double mantenimiento) {
		this.mantenimiento = mantenimiento;
	}
	

	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	@Override
	public String toString() {
		return "Cuenta [nombreUsuario=" + nombreUsuario + ", id_cliente=" + id_cliente + ", mantenimiento="
				+ mantenimiento + "]";
	}
	
	public abstract double sacarDinero (double sacar);
	
	public abstract double ingresarDinero(double ingresar);

}
