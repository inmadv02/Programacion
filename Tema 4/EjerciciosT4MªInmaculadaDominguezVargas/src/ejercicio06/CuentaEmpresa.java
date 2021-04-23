package ejercicio06;

public class CuentaEmpresa extends Cuenta {
	
	private int penalizacion;

	public CuentaEmpresa(String nombreUsuario, int id_cliente, double saldo, double mantenimiento, int penalizacion) {
		super(nombreUsuario, id_cliente, saldo, mantenimiento);
		this.penalizacion = penalizacion;
	}

	public int getPenalizacion() {
		return penalizacion;
	}

	public void setPenalizacion(int penalizacion) {
		this.penalizacion = penalizacion;
	}

	@Override
	public String toString() {
		return "CuentaEmpresa [penalizacion=" + penalizacion + "]";
	}

	@Override
	public double sacarDinero(double sacar) {
		return getSaldo() - sacar - penalizacion;
	}

	@Override
	public double ingresarDinero(double ingresar) {
		// TODO Auto-generated method stub
		return getSaldo() + ingresar;
	}
	
	
	
	
}
