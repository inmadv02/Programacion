package ejemplo03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto p1;
		Producto p2;
		int [] listadoDescuentos = {2, 4, 1, 3};
		String nombreT;
		int cantidadT;
		double precioT;
		int hasta, desde, tam;
		
		int [] listaCargada; 
		
		System.out.println("Diga el nombre del producto:");
		nombreT = Leer.dato();
		System.out.println("Diga el precio.");
		precioT = Leer.datoDouble();
		System.out.println("Diga la cantidad de objetos que quiere comprar.");
		cantidadT = Leer.datoInt();
		
		p1 = new Producto (nombreT, precioT, cantidadT);
		
		System.out.println(p1);
		
		System.out.printf("El precio final después de los descuentos es: "
				+ " %.2f euros", p1.calcularPrecioFinal(listadoDescuentos));
		
		System.out.println("Máx de descuentos:");
		hasta = Leer.datoInt();
		System.out.println("Mín de descuentos.");
		desde = Leer.datoInt();
		System.out.println("Tamaño del array.");
		tam = Leer.datoInt();
		
		listaCargada = new int [tam];
		
		p2 = new Producto ("Patatas", 2.50, 2);
		
		listaCargada = p1.cargarArrayAle(hasta, desde, tam);
		
		p1.mostrarArray(listaCargada);
		
	}

}
