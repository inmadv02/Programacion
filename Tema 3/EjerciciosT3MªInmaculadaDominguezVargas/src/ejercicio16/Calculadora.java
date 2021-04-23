package ejercicio16;

public class Calculadora {
	
	
	public double sumar (double numero, double numero2) {
		double suma = 0;
			suma = numero + numero2;
	    return suma;
	}
	
	public double restar (double numero, double numero2) {
		double resta = 0;
			resta = numero - numero2;
	  return resta;
		
	}
	
	public double dividir (double numero, double numero2) {
		double dividir = 1;
		dividir = numero/numero2;
		return dividir;
	}

	public double multiplicar (double numero, double numero2) {
		double multiplicar = 1;
			multiplicar = numero2 * numero;
		return multiplicar;
	}
		
	public void parOimpar (double numero, int cero) {
		int dos = 2;
		if (numero%dos ==cero) {
			System.out.println(numero + " es par.");
		}else {
			System.out.println(numero + " es impar.");
		}
	
	}
	
}
