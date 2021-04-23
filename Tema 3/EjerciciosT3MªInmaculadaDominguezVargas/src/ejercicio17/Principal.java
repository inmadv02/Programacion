package ejercicio17;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int plantaN;
		int plantaActual;
		int numPersonas;
		Ascensor a1 = new Ascensor ();
		
		
		System.out.println("Buen día. ¿Cuántas personas se han montado?");
		numPersonas = Leer.datoInt();
		a1.comprobarPeso(numPersonas);
		System.out.println("¿En qué piso se encuentra ahora mismo?");
		plantaActual = Leer.datoInt();
		plantaActual = a1.getContador();
		System.out.println("¿A qué planta le gustaría ir?");
		plantaN = Leer.datoInt();
		a1.comprarSubidayBajada(plantaN);
		
		System.out.println("Se están abriendo las puertas.");
		System.out.println("Ya ha llegado a su planta.");
	}

}
