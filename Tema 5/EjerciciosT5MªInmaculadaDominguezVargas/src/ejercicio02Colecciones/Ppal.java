package ejercicio02Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op, id, cero = 0;
		String nombre, nombreNuevo, apellidos, email, telefono;

		Socio s1 = new Socio(1, "JosÃ© Manuel", "GonzÃ¡lez", "josemg@gmail.com", "000666555");
		Socio s2 = new Socio(5, "Ã�ngel", "Naranjo", "angelnr@gmail.com", "111222333");
		Socio s3 = new Socio(3, "Antonio", "PÃ©rez", "antpez@gmail.com", "640000555");
		Socio s4;

		List<Socio> listado = new ArrayList<Socio>();

		listado.add(s1);
		listado.add(s2);
		listado.add(s3);

		GestionClub gc = new GestionClub(listado);

		do {

			System.out.println("Â¡Hola! Bienvenido al club de campo Sevilla. Â¿QuÃ© es lo que le gustarÃ­a hacer?\n");
			System.out.println("1. AÃ±adir un nuevo socio.");
			System.out.println("2. Cambiar los datos de un socio en particular");
			System.out.println("3. Buscar un socio.");
			System.out.println("4. Mostrar todos los socios del club.");
			System.out.println("5. Borrar un socio.");
			System.out.println("0. Salir.");
			op = Leer.datoInt();

			switch (op) {

			case 1:

				System.out.println("Rellene los campos que va a encontrar a continuaciÃ³n.");
				System.out.println("Nombre: ");
				nombre = Leer.dato();
				System.out.println("Apellidos: ");
				apellidos = Leer.dato();
				System.out.println("Email: ");
				email = Leer.dato();
				System.out.println("Telefono: ");
				telefono = Leer.dato();
				s4 = new Socio(4, nombre, apellidos, email, telefono);
				gc.aniadirSocio(s4);
				gc.mostrarSocio(s4);

				break;

			case 2:

				System.out.println("Introduzca el id del socio al que le gustarÃ­a cambiarle los datos");
				id = Leer.datoInt();

				while (gc.buscarSocio(id) < 0) {
					System.out.println("Socio no encontrado. Pruebe de nuevo.");
					id = Leer.datoInt();
				}

				System.out.println("Introduzca el nuevo nombre del usuario: ");
				nombreNuevo = Leer.dato();
				gc.modificarSocio(nombreNuevo, id);
				System.out.println(gc.getListado().get(gc.buscarSocio(id)));

				break;
			case 3:

				System.out.println("Â¿QuÃ© id tiene el socio que estÃ¡ buscando?");
				id = Leer.datoInt();
				if (gc.buscarSocio(id) < 0) {
					System.out.println("Socio no encontrado. Pruebe de nuevo.");
					id = Leer.datoInt();
				} else {
					System.out.println(gc.getListado().get(gc.buscarSocio(id)));
				}
				break;

			case 4:

				System.out.println("SOCIOS DEL CLUB (ordenados por su id de socio, de menor a mayor)");
				gc.mostrarSocios();

				break;

			case 5:

				System.out.println("Â¿QuÃ© id tiene el socio que quiere borrar?");
				id = Leer.datoInt();
				gc.borrarSocio(id);

				break;
			case 0:

				System.out.println("Ha decidido salir.");

			default:

				System.out.println("OpciÃ³n incorrecta.");

				break;
			}

		} while (op != cero);

	}

}
