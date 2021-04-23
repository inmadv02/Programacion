package ejemplo04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trabajador t1;
		String nombreT;
		double precioHoraT;
		double [] horasTrabajadas = {10, 15, 13, 11};
		double porc;
		
		System.out.println("Diga el nombre");
		nombreT = Leer.dato();
		System.out.println("Diga el precio por hora.");
		precioHoraT = Leer.datoDouble();
		
		t1 = new Trabajador (nombreT, horasTrabajadas, precioHoraT);
		
		System.out.println(t1);
		
		System.out.printf("Su sueldo bruto es: %.2f euros", t1.calcularSueldo());
		
		System.out.println("Diga el porciento que se descuenta del sueldo bruto:");
		porc = Leer.datoDouble();
		
		System.out.println(t1.calcularSNeto(porc));

	}

}
