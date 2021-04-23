package ejemplo4;

public class Circulo extends Figura{
	
	private double radio;

	public Circulo(String nombre, String color, double radio) {
		super(nombre, color);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return Math.pow(radio, 2)*Math.PI;
	}

	@Override
	public double calcularPerimetro() {
		return 2*Math.PI*radio;
	}
	
	public void mostrarRadianes() {
		System.out.println("etrhbtrhrt");
	}
	
	

}
