package ejercicio06;

public class CuentaCorriente extends Cuenta{
	
	private int puntos;
	private int contador;
	
	public CuentaCorriente(String nombreUsuario, int id_cliente, double saldo, double mantenimiento, int puntos) {
		super(nombreUsuario, id_cliente, saldo, mantenimiento);
		this.puntos = puntos;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}


	public double sacarDinero(double sacar) {
		setPuntos(puntos++);
		return getSaldo() - sacar - getMantenimiento();
	}

	public double ingresarDinero(double ingresar) {
		setPuntos(puntos++);
		return getSaldo() + ingresar - getMantenimiento();
	}
	
	

}
