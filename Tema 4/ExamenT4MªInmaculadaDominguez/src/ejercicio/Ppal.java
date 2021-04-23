package ejercicio;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehiculo v = new Vehiculo ("8790JKK", 5, 4);
		Batmovil b1 = new Batmovil ("0001KKK", 4, 2, 5);
		Patinete p1 = new Patinete ("6666THG", 2, 1, 95.0);
		
		Vehiculo [] listado = {v, b1, p1};
		
		Concesionario cn = new Concesionario ("Calle Evangelista");
		
		double cantidadFija = 100.50, cantidadPatinete = 142.90, descuento = 10;
		int op, contrasenia = 1234, comprobacion, cero = 0;
		
		System.out.println("�Hola! Bienvenido a nuestro concesionario. Aqu� podr� comprar los veh�culos "
				+ "con los que siempre ha so�ado durante su infancia y adolescencia.");
		
		do {
			
		
		System.out.println("\n�Qu� veh�culo le gustar�a comprar?");
		System.out.println("\n1. Veh�culo normal y corriente.");
		System.out.println("2. El m�tico B�tmovil.");
		System.out.println("3. Un patinete volador.");
		System.out.println("4. Ver cat�logo en profundidad.");
		System.out.println("5. Solo personal autorizado.");
		System.out.println("0. Salir.");
		op = Leer.datoInt();
		
		switch (op) {
		
		case 1:
			System.out.println("\nHa decidido comprar un veh�culo normal.");
			System.out.printf("\nLo ha adquirido por el m�dico precio de: %.2f euros \n", cn.calcularAlquilerUnVehiculo(v, cantidadFija, descuento, cantidadPatinete));
			break;
		case 2: 
			System.out.println("\n�Ha comprado un Batm�vil!");
			System.out.printf("\nY su precio es... %.2f euros \n", cn.calcularAlquilerVehiculoElegido(listado, op, cantidadFija, descuento, cantidadPatinete));
			break;
		case 3:
			System.out.println("\n�Wow! Ha decidio comprar un patinete volador.");
			System.out.printf("\nSu precio es de: %.2f euros \n", cn.calcularAlquilerVehiculoElegido(listado, op, cantidadFija, descuento, cantidadPatinete));
			break;
		case 4: 
			System.out.println("\nUsted es un cliente responsable y prefiere ver las caracter�sticas de cada veh�culo "
					+ "antes de comprarse alguno.");
			System.out.println("Buena elecci�n.");
			cn.mostrarListado(listado);
			
			break;
		case 5:
			System.out.println("Introduzca la contrase�a, por favor: ");
			comprobacion = Leer.datoInt();
			while (comprobacion != contrasenia) {
				System.out.println("Contrase�a incorrecta. Int�ntelo de nuevo.");
				comprobacion = Leer.datoInt();
			}
			System.out.println("\nDurante este mes, esto es lo que hemos recaudado vendiendo patinetes.");
			System.out.printf("\n%.2f", cn.calcularRecaudadoPatinetes(listado, cantidadFija, descuento, cantidadPatinete));
			break;
		case 0:
			System.out.println("Ha decidido salir. �Hasta la pr�xima!");
			break;
		default:
			System.out.println("Opci�n incorrecta.");
		}
		
		}while (op!=cero);
		
		//Probando m�todos rescritos
		
		System.out.println("__________________________________________________");
		
		System.out.printf("\nPrecio Batm�vil: %.2f euros\n", b1.calcularPrecio(cantidadFija, descuento, cantidadPatinete));
		System.out.printf("\nPrecio patinete: %.2f euros\n", p1.calcularPrecio(cantidadFija, descuento, cantidadPatinete));
		

	}

}
