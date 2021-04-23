package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Profesor p1;
		String nombre;
		String apellido;
		int id_profesor;
		double sueldoN, pago = 30.00, porcentaje;
		int horas, horasN;
		int op, contraseña = 1234, comprobacion, cero = 0;
		
		
		System.out.println("¡Hola! Bienvenido a nuestro programa. Aquí podrá gestinar el sueldo de los profesores"
				+ " que ha contratado para su centro.");
		System.out.println("\nPor favor, para añadir un profesor, escriba los siguientes datos. ");
		System.out.println("\nNombre:");
		nombre = Leer.dato();
		System.out.println("Primer apellido:");
		apellido = Leer.dato();
		System.out.println("Número identificador del profesor:");
		id_profesor = Leer.datoInt();
		System.out.println("Número de horas trabajadas:");
		horas = Leer.datoInt();
		
		p1 = new Profesor(nombre, apellido, id_profesor, horas);
		
		System.out.println(p1);
		
		do {
			
		System.out.println("\nUna vez que ha introducido los datos, ¿qué desea hacer?");
		System.out.println("1. Calcular el salario en bruto.");
		System.out.println("2. Calcular el salario neto.");
		System.out.println("3. Comprobar el sueldo.");
		System.out.println("4. Cambiar los datos del profesor.");
		System.out.println("0. Salir del programa.");
		op = Leer.datoInt();
		
		switch (op) {
		
			case 1: 
				System.out.println("Aquí calcularemos el salario bruto del trabajador.");
				System.out.println("En esta empresa, se paga: " + pago + " euros por hora.");
				System.out.println("Por lo tanto, el saldo bruto de su trabajador es de: " +p1.calcularSB(horas, pago));
				break;
				
			case 2:
				System.out.println("Aquí calcularemos el salario neto.");
				System.out.println("¿Qué porcentaje del sueldo bruto le vamos a tener que restar al sueldo?");
				porcentaje = Leer.datoDouble();
				sueldoN = p1.calcularSN(porcentaje);
				System.out.println("Entonces, el sueldo neto es: " + sueldoN);
				break;
				
			case 3:
				System.out.println("Aquí veremos si el esfuerzo del trabajador durante el mes ha merecido la pena.\n");
				p1.comprobar();
				break;
				
			case 4:
				System.out.println("Para ello, introduzca la contraseña.");
				comprobacion = Leer.datoInt();
				
				while (comprobacion != contraseña) {
					System.out.println("Contraseña incorrecta. Inténtelo de nuevo.");
					comprobacion = Leer.datoInt();
				}
				
				System.out.println("A continuación, podrá cambiar el número de horas al mes "
						+ "trabajadas por el profesor.");
				System.out.println("Introduzca un nuevo número.");
				horasN = Leer.datoInt();
				System.out.println("El nuevo nº de horas trabajadas al mes es: " + p1.gethorasN(horasN));
				break;
				
			case 0:
				System.out.println("Ha decidido salir. ¡Hasta la próxima!");
				break;
				
			default:
				System.out.println("Opción incorrecta. Inténtelo de nuevo.");
			
			}
		}while (op!=cero);

	}

}
