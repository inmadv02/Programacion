package ejercicio05;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double porcentaje = 5;
		int ventasRealizadas = 50;
		
		
		Empleado e1 = new Empleado ("Juan", 2000, 1);
		Empleado e2 = new EmpleadoFijo ("Pepe", 1500, 2, 260.95);
		EmpleadoAComision e3 = new EmpleadoAComision ("Inma", 1850, 3, 2.5);
		EmpleadoAComision e4 = new EmpleadoAComision ("Esteban", 1650, 4, 2.8);
		
		Empleado [] listado = {e1, e2, e4};
		
		Oficina of = new Oficina (listado);
		
		System.out.println("¡Hola! Bienvenido a nuestro programa.\n");
		System.out.printf("%.2f euros", of.calcularSueldo(e1, porcentaje, ventasRealizadas));
		System.out.printf("\n%.2f euros", e3.calcularSueldo(porcentaje, ventasRealizadas));
		System.out.println();
		e3.imprimirMensaje(porcentaje, ventasRealizadas);
		
		

	}

}
