package ejercicio06;

public class CuentaJoven extends Cuenta{
	
	private int bonus;
	private int contador;

	public CuentaJoven(String nombreUsuario, int id_cliente, double saldo, double mantenimiento, int bonus) {
		super(nombreUsuario, id_cliente, saldo, mantenimiento);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	@Override
	public String toString() {
		return "CuentaJoven [bonus=" + bonus + "]";
	}

	@Override
	public double sacarDinero(double sacar) {
		return getSaldo() - sacar;
	}

	@Override
	public double ingresarDinero(double ingresar) {
		return getSaldo() + ingresar + bonus;
	}
	
	public int calcularBonus() {
		return getContador() * getBonus();
	}
	
	

}
