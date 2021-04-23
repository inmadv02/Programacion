package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op, cero = 0, id, idNuevo, index;
		double capacidad, precio, precioNuevo;
		String direccion;

		
		Trastero t1 = new Trastero (20.5, "Calle Evangelista", 1, 500.00, true);
		Trastero t2 = new Trastero (17.00, "Calle Corral del Moro", 2, 400.00, false);
		Trastero t3 = new Trastero (30.00, "Carretera de Carmona, 12", 3, 700.00, false);
		Trastero t4;
		Trastero t = new Trastero ();
		
 
		
		List <Trastero> listado = new ArrayList <Trastero> ();
		
		Iterator <Trastero> it = listado.iterator();
		
		Oficina of = new Oficina (listado);
		
		listado.add(t3);
		listado.add(t1);
		listado.add(t2);
		
		System.out.println("�Hola! Bienvenido a nuestro programa de alquileres de trasteros.\n");
		
		do {
			
		
		System.out.println("�Qu� es lo que desea hacer?\n");
		System.out.println("1. A�adir un trastero.");
		System.out.println("2. Mostrar todos los trasteros.");
		System.out.println("3. Buscar un trastero por precio.");
		System.out.println("4. Buscar un trastero por n�mero. ");
		System.out.println("5. Buscar por trastero m�s caro.");
		System.out.println("6. Eliminar trastero.");
		System.out.println("7. Modificar trastero.");
		System.out.println("8. Ordenar.");
		System.out.println("9. Mostrar los trasteros libres.");
		System.out.println("0. Salir.");
		op = Leer.datoInt();
		
		switch (op) {
		case 1:
			System.out.println("�Cu�l va a ser la capacidad del trastero?");
			capacidad = Leer.datoDouble();
			System.out.println("�D�nde estar� situado?");
			direccion = Leer.dato();
			System.out.println("�Cu�l va a ser su n�mero?");
			idNuevo = Leer.datoInt();
			System.out.println("�Cu�l va a ser su precio?");
			precio = Leer.datoDouble();
			t4 = new Trastero (capacidad, direccion, idNuevo, precio, true);
			of.aniadirTrastero(t4);
			System.out.println();
			of.getListado().get(idNuevo);
			break;
			
		case 2:
			of.mostrarTrasteros(it);
			break;
		case 3:
			System.out.println("Introduzca el precio por el que quiere buscar un trastero.");
			precioNuevo = Leer.datoDouble();
			
			if(of.buscarPorPrecio(precioNuevo) < cero) {
				System.out.println("Trastero no encontrado.");
			}
			else {
				System.out.println("Trastero encontrado.");
			}
			break;
		case 4:
			System.out.println("Introduzca el n�mero del trastero que quiere encontrar.");
			id = Leer.datoInt();
			if(of.buscarPorNumero(id) == null) {
				System.out.println("Trastero no encontrado.");
			}
			else {
				System.out.println("Trastero encontrado.");
				of.buscarPorNumero(id);

			}
			break;
		case 5:
			System.out.println(" ");
			break;
		case 6:
			System.out.println("�Qu� trastero le gustar�a eliminar? Introduzca su n�mero");
			id = Leer.datoInt();
			of.eliminarTrastero(id);
			
		case 7:
			System.out.println("Alquileres ordenados por n�mero\n");
			Collections.sort(listado);
			of.ordenarPorNumero(t);
			break;
		case 8:
			System.out.println("Alquileres ordenados por precio (de mayor a menor)");
			Collections.sort(listado, new ComparaPorPrecio());
			for(Trastero uno : listado) {
				System.out.println(uno);
			}
			break;
		case 9:
			of.mostrarTrasterosLibres();
			break;
		case 0:
			System.out.println("\n�Hasta pronto!");
		default:
			System.out.println("Opci�n incorrecta.");
			break;
		}
	
	}while(op!=cero);
		
	}

}
