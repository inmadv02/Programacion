package ejemplo3;

public class Vehiculo {
	
	private double cilidranda;
	private double caballos;
	private int tipo;
	
	
	public Vehiculo(double cilidranda, double caballos, int tipo) {
		super();
		this.cilidranda = cilidranda;
		this.caballos = caballos;
		this.tipo = tipo;
	}
	
	public double calcularImpuesto(double fija) {
		return fija;
	}

	public double getCilidranda() {
		return cilidranda;
	}

	public void setCilidranda(double cilidranda) {
		this.cilidranda = cilidranda;
	}

	public double getCaballos() {
		return caballos;
	}

	public void setCaballos(double caballos) {
		this.caballos = caballos;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Vehiculo [cilidranda=" + cilidranda + ", caballos=" + caballos + ", tipo=" + tipo + "]";
	}
	
	
}
