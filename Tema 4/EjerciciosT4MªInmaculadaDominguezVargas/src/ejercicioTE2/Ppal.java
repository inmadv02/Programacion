package ejercicioTE2;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double porcentaje = 30, cantidadFija = 100.5;
		int op;
		Producto p1 = new Movil (200.00, 100, "Samsung Galazy A20e", true, "Samsung", "A20e");
		Producto p2 = new EspadaLaser (560.65, 50, "Espada Double 3000", true, "doble");
		Producto p3 = new EspadaLaser (360.95, 102, "Espada Simple 2500", true, "simple");
		
		Producto [] lista = {p1, p2, p3};
		
		System.out.println("¡Hola! Bienvenido a nuestra tienda. Aquí podrá comprar:");
		System.out.println("1. Móviles.");
		System.out.println("2. Espadas láser");
		System.out.println("¿Cuál de estos dos productos le gustaría comprar?");
		op = Leer.datoInt();
		
		switch (op) {
		
		case 1:
			
		}
	}

}
