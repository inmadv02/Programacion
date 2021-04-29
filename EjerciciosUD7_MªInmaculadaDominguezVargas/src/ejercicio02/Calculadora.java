package ejercicio02;

public class Calculadora {
	
	public static double sumar(double num1, double num2) {
		return num1 + num2;
	}

	public static double restar(double num1, double num2) {
		return num1 - num2;
	}
	
	public static double multiplicar(double num1, double num2) {
		return num1 * num2;
	}
	public static double dividir(double num1, double num2) {
		return num1/num2;
	}
	
	public static double hacerRaizCuadrada(double num1) throws RaizNumeroNegativoExcepcion{
		if(num1 < 0) 
		
			throw new RaizNumeroNegativoExcepcion();
		
		return Math.sqrt(num1);
	}
}
