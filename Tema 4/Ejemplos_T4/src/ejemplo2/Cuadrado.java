package ejemplo2;

public class Cuadrado extends Figura{
	
	private double lado;

	public Cuadrado(int x, int y, double lado) {
		super(x, y);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + ", calcularArea()=" + calcularArea() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return lado*lado;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
