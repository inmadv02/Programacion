package ejercicio01;

public class Círculo {
	
	double radio;
	double diametro;
	
	public Círculo (double radio) {
		this.radio = radio;
	}
	
	public double areaCm () {
		double dos = 2;
		double areaCm;
		
		areaCm = Math.PI * Math.pow(radio, dos);
		return areaCm;
		
	}
	public double areaM () {
		double multiplicar= 10000.00;
		double dos = 2;
        double areaCm;
        double areaM;
		
        areaCm = Math.PI * Math.pow(radio, dos);
		areaM = areaCm * multiplicar;
		return areaM;
		
	}
}
