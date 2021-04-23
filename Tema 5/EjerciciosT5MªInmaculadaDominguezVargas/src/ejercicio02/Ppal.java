package ejercicio02;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] num;
		
		int tam = 50;
		
		num = new double [tam];
		
		
		
		ArrayReales ar = new ArrayReales (num);
		
		ar.rellenarArray();
		
		System.out.println("El número más pequeño es: " + ar.calcularMinimo());
		System.out.println("El número más grande es: " + ar.calcularMaximo());
		System.out.println("El sumatorio de todos estos números es: " + ar.calcularSumatorio());
		

	}

}
