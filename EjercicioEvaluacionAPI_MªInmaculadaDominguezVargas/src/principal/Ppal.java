package principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import controller.Tienda;
import crud.CRUDProducto;
import model.Camiseta;
import model.Producto;
import model.Zapato;
import utilidades.Leer;
import vistas.VistasTienda;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Crea una programa para una tienda. El cliente puede comprar un producto, cuyas
		 * caracterÃ­sticas son: id, nombre, precio, descripciÃ³n y fecha de entrada en el catÃ¡logo. Este
		 * producto puede ser de dos tipos: Camiseta y Zapato. Los atributos de cada uno son los siguientes:
		 * 
		 *    Â· Camiseta: talla, color, estampado;
		 *    Â· Zapato: nÃºmero, material.
		 * 
		 * AdemÃ¡s de poder comprar un producto, puede ver la lista de productos, ver los productos ordenados
		 * por precio y id, filtrar los productos por color, estampado y nÃºmero, y ver los productos que estÃ¡n
		 * rebajas. Un objeto del catÃ¡logo se puede poner en rebajas si el tiempo que ha transcurrido desde su
		 * entrada hasta la fecha actual es igual o mayor que 5 meses. Se le descuenta el 40% del precio.
		 *  
		 * El precio de los demÃ¡s artÃ­culos se calcula de la siguiente forma:
		 * 
		 * 	  Â· Producto: el precio menos un descuento del 10%.
		 * 	  Â· Camiseta: precio de un producto, mÃ¡s un plus del 15% si tiene estampado.
		 * 	  Â· Zapato: precio de un producto mÃ¡s un porcentaje del 10% del precio si el zapato
		 * 		estÃ¡ hecho con piel.
		 * 
		 * Asimismo, el administrador de la aplicaciÃ³n podrÃ¡ aumentar el precio de los productos un 5%
		 * por la subida del IVA y ver cÃ³mo quedarÃ­an esos precios. TambiÃ©n puede aÃ±adir y borrar
		 * artÃ­culos del catÃ¡logo.
		 * 
		 */
		
		List <Producto> lista = new ArrayList <Producto> ();
		
		Producto c = new Camiseta (1, "Camiseta", 15.50, "Camiseta con un hombro al descubierto", LocalDate.of(2020, 10, 25), "S", "Rojo", null);
		Producto c1 = new Camiseta (2, "Camiseta", 10.90, "Camiseta de manga corta", LocalDate.of(2020, 12, 12), "XL", "Azul", "Flores");
		Producto c2 =  new Camiseta (3, "Camiseta", 11.95, "Camiseta de manga corta", LocalDate.of(2021, 01, 31), "L", "Verde pastel", "Lunares");
		Producto c3 =  new Camiseta (6, "Camiseta", 12.95, "Camiseta con escote corazÃ³n y mangas abullonadas", LocalDate.of(2021, 03, 14), "XS", "Rojo", "Flores");
		Producto z = new Zapato (4, "Converses", 35.50, "Converses altas con plataforma", LocalDate.of(2021, 01, 25), 38, "Lona");
		Producto z1 = new Zapato (7, "Mocasines", 50.45, "Mocasines brillantes de seÃ±ora", LocalDate.of(2021, 02, 14), 39, "Piel");
		Producto z2 = new Zapato (5, "Botines", 30.95, "Botines negros con tacÃ³n", LocalDate.of(2021, 04, 01), 36, "Piel");
		
		lista.add(c);
		lista.add(c1);
		lista.add(c2);
		lista.add(z);
		lista.add(z1);
		lista.add(z2);
		lista.add(c3);
		
		CRUDProducto cp = new CRUDProducto (lista);
		VistasTienda vt = new VistasTienda(cp);
		Tienda t = new Tienda ();
		String color, nombre, descripcion, fechaNueva, talla, estampado, material;
		int op, op2, id, numero, cien = 100, cero = 0;
		LocalDate fechaRebaja = LocalDate.now();
		double precio, descuento = 10, plus = 15, porcentaje = 10, bajada = 40, subida = 5.0;
		
		
		
		
		System.out.println("\nBienvenido a nuestra tienda. Aquí podrá comprar tanto camisetas como zapatos.");
		
		do {
			System.out.println("\n _______________________________________");
			System.out.println("\n| ¿Qué es lo que desea hacer?\t        |");
			System.out.println("|\t\t\t\t        |");
			System.out.println("| 01. Ver listado de productos.\t        |");
			System.out.println("| 02. Comprar una camiseta.\t        |");
			System.out.println("| 03. Comprar unos zapatos.\t        |");
			System.out.println("| 04. Ordenar productos por precio.     |");
			System.out.println("| 05. Ordenar productos por id.\t        |");
			System.out.println("| 06. Filtrar camisetas por estampados. |");
			System.out.println("| 07. Filtrar camisetas por colores.    |");
			System.out.println("| 08. Filtrar zapatos por numero.\t|");
			System.out.println("| 09. Ver productos en rebajas.\t\t|");
			System.out.println("| 10. Aumentar precio productos.\t|");
			System.out.println("| 11. Añadir productos nuevos.\t\t|");
			System.out.println("| 12. Borrar productos.\t\t\t|");
			System.out.println("| 00. Salir.\t\t\t\t|");
			System.out.println(" ______________________________________\n");
			op = Leer.datoInt();
			
			switch (op) {
			case 1:
				vt.mostrarProductos(lista);
				break;
			case 2:
				System.out.println("\n¿Qué camiseta le gustaría comprar?");
				vt.mostrarCamisetas(lista);
				System.out.println();
				System.out.println("Introduzca su id:");
				id = Leer.datoInt();
				Collections.sort(lista);
				System.out.println(cp.buscarPorId.apply(id));
				System.out.printf("El precio es: %.2f  euros", cp.buscarPorId.apply(id).calcularPrecio(descuento, cien, plus, porcentaje));
				break;
			case 3:
				System.out.println("\n¿Qué zapato le gustaría comprar?");
				vt.mostrarZapatos(lista);
				System.out.println();
				System.out.println("Introduzca su id:");
				id = Leer.datoInt();
				Collections.sort(lista);
				System.out.println(cp.buscarPorId.apply(id));
				System.out.println("El precio es: " + cp.buscarPorId.apply(id).calcularPrecio(descuento, cien, plus, porcentaje));
				break;
			case 4:
				System.out.println("\nProductos ordenados por precio.");
				System.out.println();
				cp.ordenarPorPrecio();
				vt.mostrarOrdenadosPorPrecio();
				break;
			case 5:
				System.out.println("\nProductos ordenados por id.");
				System.out.println();
				cp.ordenarPorId();
				vt.mostrarOrdenadosPorId();
				break;
			case 6:
				System.out.println("\n¿Por qué estampado quiere filtrar las camisetas?");
				estampado = Leer.dato();
				cp.filtrarPorEstampado(estampado);
				break;
			case 7:
				System.out.println("\n¿Por qué color quiere filtrar las camisetas?");
				color = Leer.dato();
				cp.filtrarPorColores(color);
				break;
			case 8:
				System.out.println("\n¿Por qué número quiere filtrar los zapatos?");
				numero = Leer.datoInt();
				cp.filtrarPorNumero(numero);
				break;
			case 9:
				System.out.println("Los productos que están en rebajas son los siguientes: ");
				System.out.println();
				t.rebajarProductos(lista, bajada, fechaRebaja);
			
				break;
			case 10:
				System.out.println("Debido a la subida del IVA un 5%, los productos de nuestra tienda van a ser más caros.");
				System.out.println("Tendrían los siguientes precios: ");
				t.aumentarPrecio(lista, subida);
				break;
			case 11:
				System.out.println("1. Crear camiseta.");
				System.out.println("2. Crear zapatos.");
				System.out.println("3. Crear otro producto.");
				op2 = Leer.datoInt();
				
				switch(op2) {
					case 1:
						System.out.println("Introduzca el id del producto que quiere aÃ±adir:");
						id = Leer.datoInt();
						System.out.println("Introduzca el nombre del producto:");
						nombre = Leer.dato();
						System.out.println("Introduzca el precio del producto:");
						precio = Leer.datoDouble();
						System.out.println("Introduzca la descripción del producto");
						descripcion = Leer.dato();
						System.out.println("Introduzca la fecha de entrada del producto. "
								+ "Tiene que seguir el siguiente formato: 2021-04-16");
						fechaNueva = Leer.dato();
						System.out.println("Introduzca la talla del producto");
						talla = Leer.dato();
						System.out.println("Introduzca el color del producto");
						color = Leer.dato();
						System.out.println("Introduzca el estampado del producto. "
								+ "En caso de que no tenga, ponga null");
						estampado = Leer.dato();
						cp.agregarProducto.apply(new Camiseta(id, nombre, precio, descripcion, cp.transformarFecha(fechaNueva), talla, color, estampado));
						vt.mostrarProductos(lista);
						break;
					case 2:
						System.out.println("Introduzca el id del producto que quiere añadir:");
						id = Leer.datoInt();
						System.out.println("Introduzca el nombre del producto:");
						nombre = Leer.dato();
						System.out.println("Introduzca el precio del producto:");
						precio = Leer.datoDouble();
						System.out.println("Introduzca la descripción del producto");
						descripcion = Leer.dato();
						System.out.println("Introduzca la fecha de entrada del producto. "
								+ "Tiene que seguir el siguiente formato: 2021-04-16");
						fechaNueva = Leer.dato();
						System.out.println("Introduzca el número del producto");
						numero = Leer.datoInt();
						System.out.println("Introduzca el material del producto");
						material = Leer.dato();
						cp.agregarProducto.apply(new Zapato(id, nombre, precio, descripcion, cp.transformarFecha(fechaNueva), numero, material));
						vt.mostrarProductos(lista);
						break;
					case 3:
						System.out.println("Introduzca el id del producto que quiere añadir:");
						id = Leer.datoInt();
						System.out.println("Introduzca el nombre del producto:");
						nombre = Leer.dato();
						System.out.println("Introduzca el precio del producto:");
						precio = Leer.datoDouble();
						System.out.println("Introduzca la descripción del producto");
						descripcion = Leer.dato();
						System.out.println("Introduzca la fecha de entrada del producto. "
								+ "Tiene que seguir el siguiente formato: 2021-04-16");
						fechaNueva = Leer.dato();
						cp.agregarProducto.apply(new Producto(id, nombre, precio, descripcion, cp.transformarFecha(fechaNueva)));
						vt.mostrarProductos(lista);
						break;
					default:
						System.out.println("Opción incorrecta.");
						break;
					}
				
				break;
			case 12:
				System.out.println("Introduzca el id del producto que quiere borrar.");
				id = Leer.datoInt();
				Collections.sort(lista);
				System.out.println(cp.buscarPorId.apply(id));
				System.out.println("________________________________________");
				System.out.println("Este es el producto que quiere borrar.\n");
				cp.eliminarProducto.apply(cp.buscarPorId.apply(id));
				System.out.println("\n________________________________________");
				System.out.println("Producto eliminado.");
				vt.mostrarProductos(lista);
				break;
			default:
				System.out.println("Opción incorrecta. Pruebe de nuevo.");
				break;
			case 0:
				System.out.println("Ha decidido salir.");
			}
		
		}while(op!=cero);
		
//		System.out.println(cp.buscarCamisetas());
//		System.out.println(cp.buscarZapatos());
//		cp.filtrarPorColores(color);

	}

}
