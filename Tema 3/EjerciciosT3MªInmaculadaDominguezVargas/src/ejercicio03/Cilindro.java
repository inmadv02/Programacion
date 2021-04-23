package ejercicio03;

public class Cilindro {
	
	double altura;
	double radio;
	double diámetro;
	
	public Cilindro (double radio, double altura) {
		this.radio = radio;
		this.altura = altura;
	}
	
	public double calcularVol (double radio, double altura) {
		double volumen;
		int exponente = 2;
		volumen = Math.PI * Math.pow(radio, exponente) * altura;
		return volumen;
	}
}
