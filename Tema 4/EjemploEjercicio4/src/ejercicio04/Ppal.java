package ejercicio04;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double descuento = 10;
		int topeDias = 4;
		Producto a1 = new Alimentacion("Tomate", 0.30, 0.60, 10, true);
		Producto a2 = new Alimentacion("Leche", 0.90, 1.00, 30, true);
		Producto a3 = new Alimentacion("Tableta de chocolate", 0.70, 0.98, 150, true);
		Producto e1 = new Electronica ("Tablet", 100.00, 150.00, true);
		
		LineaVenta lv1 = new LineaVenta (6, a1);
		LineaVenta lv2 = new LineaVenta (4, a2);
		LineaVenta lv3 = new LineaVenta (5, a3);
		
		LineaVenta listado [] = {lv1, lv2, lv3};
		
		CarritoTicket v = new CarritoTicket (listado);
		
		System.out.printf("%.2f", a1.calcularPvp(descuento, topeDias));
		System.out.printf("\n%.2f", a2.calcularPvp(descuento, topeDias));
		System.out.printf("\n%.2f", v.calcularTotal(descuento, topeDias));

	}

}
