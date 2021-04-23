package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String nombre;
		String apellido;
		int id, contraseña = 123, comprobacion;
		int horas, horasN;
		double costeHoras = 30;
		double porcentaje;
		Profesor p1;
		
		System.out.println("¡Hola! Bienvenido a nuestro programa. Aquí podrá gestinar el sueldo de los profesores"
				+ " que ha contratado para su centro.");
		System.out.println("\nPor favor, para añadir un profesor, escriba los siguientes datos. ");
		System.out.println("\nNombre:");
		nombre = Leer.dato();
		System.out.println("Primer apellido:");
		apellido = Leer.dato();
		System.out.println("Número identificador del profesor:");
		id = Leer.datoInt();
		System.out.println("Número de horas trabajadas:");
		horas = Leer.datoInt();
		
		p1 = new Profesor (nombre, apellido, id, horas); //Esto se guarda en this.nombre, this.apellido, etc.
		
		System.out.println(p1);
		
		System.out.printf("El salario bruto es de: %.2f euros. ", p1.calcularSB(costeHoras));
		
		System.out.println("Diga el porcentaje: ");
		porcentaje = Leer.datoDouble();
		System.out.printf("El sueldo neto es de: %.2f euros. ", p1.calcularSN(porcentaje));
		
		p1.comprobarSueldo();
		
		
		
		System.out.println("Diga contraseña: ");
		comprobacion = Leer.datoInt();
		
		if (contraseña == comprobacion) {
			System.out.println("Diga las horas que ha trabajado el profesor:");
			horasN = Leer.datoInt();
			p1.cambiarHoras(horasN);
			System.out.println(p1);
		}else {
			System.out.println("Contraseña incorrecta.");
		}
		
		
	}

}
