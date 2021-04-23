package ejemplo02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*los setters nos sirven para modificar un valor en uno de los atributos.
		 * Por otro lado, los getters sirven para obtener los valores de un atributo.
		 * 
		 * Debería haber un set y un get por cada atributo.*/
		
		/* A los atributos hay que ponerle private */
		
		double base;
		double altura;
		String tipo, nuevoTipo;
		double cantidad;
		Triangulo t1;
		
		System.out.println("Diga la base:");
		base = Leer.datoDouble();
		System.out.println("Diga la base:");
		altura = Leer.datoDouble();
		System.out.println("Diga el tipo:");
		tipo = Leer.dato();
		
		t1 = new Triangulo (base, altura, tipo);
		
		System.out.println("\n Antes de cambiar: ");
		System.out.println("Nuevo tipo:");
		nuevoTipo = Leer.dato();
		t1.setTipo(nuevoTipo);
		
		System.out.println("Después: " + t1);
		
		System.out.println("Si solo quiero un atributo" + t1.getBase());
}

}
