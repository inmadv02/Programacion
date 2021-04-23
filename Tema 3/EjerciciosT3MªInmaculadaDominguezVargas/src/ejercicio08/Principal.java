package ejercicio08;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Crear un programa que emule una máquina vendedora de tickets de metro. Tendremos que crear la
		clase Ticket (Clase POJO), la clase Maquina (donde estarán todos los métodos con funcionalidad) y la
		clase principal o de prueba. Podremos:
			• Comprar uno o varios billetes.
			• Calcular el cambio a devolver.
			• Imprimir por pantalla el billete. Solo uno. Si se han comprado “x” debemos mostrar en el
			ticket el mensaje “válido para x personas”.
		Además, al final de la jornada, el operario que lleva el mantenimiento de la máquina, debe tener
		disponible un método que le ofrezca el saldo total de la recaudación de la máquina en ese día (no es
		necesario usar fechas) y ponga a cero el contador.
		Por último, también debe contar con la posibilidad de cambiar el precio de los billetes ya que estos
		suelen subir todos los años.
		Las operaciones para el operario se harán solo si se introduce la contraseña adecuada.
		Estas últimas funcionalidades también se harán con métodos dentro de la clase Maquina.*/
		
		int op, op2;
		int num = 0, cero = 0;
		double precio = 1.5, dinero, precioT = 0, nuevoPrecio;
		String destino = "" ;
		Maquina m1 = new Maquina ();
		int contrasenia = 57824;
		int contrasenaT;
		System.out.println("¡Hola! Bienvenido a MetroSevilla. ¿Qué es lo que quiere hacer?");
		
		do {
			System.out.println("\n1. Comprar uno o varios billetes.");
			System.out.println("2. Calcular el cambio a devolver.");
			System.out.println("3. Su ticket.");
			System.out.println("4. Opciones avanzadas.");
			System.out.println("0. Salir.");
			op = Leer.datoInt();
			
			switch (op) {
			
				case 1: 
					System.out.println("¿Hacia dónde se quiere dirigir?");
					destino = Leer.dato();
					System.out.println("¿Cuántos billetes quiere comprar?");
					num = Leer.datoInt();
					System.out.printf("\nEl precio total es: %.2f euros", m1.comprar(num, precio));
				break;
				
				case 2:
					System.out.println("Introduzca su dinero para pagar los billetes.");
					dinero = Leer.datoDouble();
					while (m1.devolverCambio(num,precio,dinero)==cero) {
						System.out.println("Su cambio es de 0.00 euros.");
					}
					System.out.printf("Aquí tiene su cambio: %.2f euros", m1.devolverCambio(num, precio, dinero));
				break;
				case 3:
					m1.imprimir(destino, num, precioT);
				break;
				case 4:
					System.out.println("Solo disponible para el operario.");
					System.out.println("Introduzca la contraseña.");
					contrasenaT = Leer.datoInt();
					while (contrasenaT!=contrasenia) {
						System.out.println("Contraseña incorrecta. Inténtelo de nuevo.");
					}
					System.out.println("¿Qué es lo que quiere hacer?");
					System.out.println("1. Recaudar.");
					System.out.println("2. Cambiar precio billetes.");
					op2 = Leer.datoInt();
					
					switch (op2) {
					
						case 1:
							System.out.println();
							break;
						case 2:
							System.out.println("¿Cuál es el nuevo precio de los billetes?");
							nuevoPrecio = Leer.datoDouble();
							m1.setNuevoprecio(nuevoPrecio);
							break;
						default:
							System.out.println("Opción incorrecta.");
				        }
			    break;	
				case 0:
				System.out.println("Ha decidido salir.");
				break;
				default:
					System.out.println("Opción incorrecta. Inténtelo de nuevo.");
				
			}
	  }while (op!=cero);
		

	}

}
