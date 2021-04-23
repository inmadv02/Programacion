package ejemplo4;

public class Cuadrado extends Figura{
	
	private double lado;

	public Cuadrado(String nombre, String color, double lado) {
		super(nombre, color);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double calcularArea() {
		return lado*lado;
	}

	
	public double calcularPerimetro() {
		return lado*4;
	}
	
	public void mostrarLados() {
		System.out.println("gnrjnnnnnudtk");
	}

}
