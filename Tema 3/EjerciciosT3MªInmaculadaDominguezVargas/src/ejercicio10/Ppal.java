package ejercicio10;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int op, op2, num_fila, num_butaca, cero = 0, cinco = 5;
		double precio = 5.5, precio_palomitas = 3.50, precio_perritos = 3.50, precio_refrescos = 3, precio_patatas = 2;
		int cant_ent, contrasena = 123, comprobacion, cant_palomitas = 0, cant_perritos = 0, cant_refrescos = 0, cant_patatas = 0, cant_total = 0;
		Sala s1 = new Sala ();
		Entrada e = new Entrada (1, precio, true);
		
		do {
		
		System.out.println("¡Hola! Bienvenido al cine Nervion Plaza");
		System.out.println("\n¿Qué es lo que desea hacer?");
		System.out.println("1. Ver cartelera");
		System.out.println("2. Comprar una entrada.");
		System.out.println("3. Calcular ganancias totales.");
		System.out.println("4. Modificar precio entrada.");
		System.out.println("5. Menú de snacks.");
		
		op = Leer.datoInt();
		
		switch (op) {
		
		case 1:
			System.out.println("\nWonder Woman 1984");
			System.out.println("Hasta el cielo");
			System.out.println("El verano que vivimos");
			System.out.println("Trolls World Tour");
			break;
		case 2:
			System.out.println("\n¿Cuántas entradas quiere?");
			cant_ent = Leer.datoInt();
			System.out.println("¿En qué fila?");
			num_fila = Leer.datoInt();
			System.out.println("¿Y en qué butaca?");
			num_butaca = Leer.datoInt();
			
			while (e.isLibre() == false) {
				System.out.println("Este sitio está ocupado. Por favor, escoja otra butaca.");
				num_butaca = Leer.datoInt();
				System.out.println("Y otra fila.");
				num_fila = Leer.datoInt();
			}
			System.out.println("Entrada comprada.");
			System.out.println(e);
			
			cant_total = s1.contador(cant_ent);
			
			System.out.printf("El precio total sería: %.2f ", s1.comprarEntradas(cant_ent, precio, num_fila, num_butaca));
			break;
		
		case 3:
			System.out.println("Introduzca la contraseña.");
			comprobacion = Leer.datoInt();
			while (comprobacion != contrasena) {
				System.out.println("Contraseña incorrecta. Inténtelo de nuevo.");
				comprobacion = Leer.datoInt();
			}
			System.out.printf("Las ganancias totales durante el día de hoy han sido: %.2f", s1.calcularGananciasDiarias(cant_total));
			
		case 4:
			System.out.println("Introduzca la contraseña.");
			comprobacion = Leer.datoInt();
			while (comprobacion != contrasena) {
				System.out.println("Contraseña incorrecta. Inténtelo de nuevo.");
				comprobacion = Leer.datoInt();
			}
			System.out.println("Introduzca el nuevo precio");
			precio = Leer.datoDouble();
			e.setPrecio(precio);
			System.out.printf("El precio nuevo es de: %.2f euros ", e.getPrecio());
			break;
			
		case 5:
			
			do {
				
				System.out.println("¿Qué le gustaría comprar?");
				System.out.println("1. Palomitas.");
				System.out.println("2. Refresco.");
				System.out.println("3. Perrito caliente.");
				System.out.println("4. Patatas fritas.");
				System.out.println("5. Salir.");
				
				op2 = Leer.datoInt();
				
					switch (op2) {
					
					case 1:
						System.out.println("¿Cuántos cartones de palomitas quiere?");
						cant_palomitas = Leer.datoInt();
						System.out.printf("El precio total es: ", s1.calcularPalomitas(cant_palomitas, precio_palomitas));
						break;
					case 2:
						System.out.println("¿Cuántos vasos de refresco quiere?");
						cant_refrescos = Leer.datoInt();
						System.out.printf("El precio total es: ", s1.calcularRefrescos(cant_refrescos, precio_refrescos));
						break;
					case 3:
						System.out.println("¿Cuántos perritos quiere?");
						cant_perritos = Leer.datoInt();
						System.out.printf("El precio total es: ", s1.calcularPerritos(cant_perritos, precio_perritos));
						break;
					case 4:
						System.out.println("¿Cuántas bolsas de patatas quiere?");
						cant_patatas = Leer.datoInt();
						System.out.printf("El precio total es: ", s1.calcularPatatas(cant_patatas, precio_patatas));
						break;
					case 5:
						System.out.println("Ha decidido volver al menú principal");
						break;
					}
			}while (op2 != cinco);		
			break;
			
			case 0:
				System.out.println("Ha decidido salir.");
				break;
			default:
				System.out.println("Opción incorrecta. Inténtelo de nuevo.");
			}
			
		}while (op != cero);
	}

}


