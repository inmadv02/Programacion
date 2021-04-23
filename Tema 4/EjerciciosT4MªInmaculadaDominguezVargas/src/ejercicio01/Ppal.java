package ejercicio01;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double ganancia = 20.0;
		int cien = 100;
		
		Tablet t1 = new Tablet (40, 200, 3.6, 100);
		Portatil p1 = new Portatil (460, 400, 1.19, 5);
		
		System.out.printf("El precio de venta de la tablet es: %.2f euros", t1.calcularPrecioVenta(ganancia, cien));
		System.out.printf("\nEl precio de venta del portatil es: %.2f euros", p1.calcularPrecioVenta(ganancia, cien));
	}

}
