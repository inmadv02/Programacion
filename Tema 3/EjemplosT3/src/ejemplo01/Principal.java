package ejemplo01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear un objeto con todos los atributos
		Persona p0 = new Persona ();
		Persona p2;
		String nombreTeclado;
		int edadT;
		double alturaT;
		Persona pT;
		double alturaCm = 0.0;
		
		Persona p1 = new Persona ("Ángel", 44, 1.83);
		
		alturaCm = p1.convertirACm();
		
		System.out.println("Su altura en cm es: " +alturaCm + " cm");
		
		p1.convertirACm(1.61);
		
		/*Bolsa b1 = new Bolsa (1, 1, 1.50, "Bosque Verde", true, true);
		
		System.out.println("Se llama: " + p1.nombre);
		System.out.println("Tiene: " + p1.edad + " años.");
		System.out.printf("Mide: %.2f metros\n", p1.altura);
		
		//Crear un objeto con solo dos parámetros
		
		p2 = new Persona ("Clara", 18);
		
		System.out.println("Se llama: " +p2.nombre);
		System.out.println("Tiene: " +p2.edad);
		System.out.printf("Mide: %.2f metros", p2.altura);*/
		
		//Leyendo datos por teclado
		
		/*System.out.println("Diga su nombre.");
		nombreTeclado = Leer.dato();
		
		System.out.println("Diga su edad.");
		edadT = Leer.datoInt();
		
		System.out.println("Diga su altura.");
		alturaT = Leer.datoDouble();
		
		//Aquí instanciamos el objeto
		
		pT = new Persona (nombreTeclado, edadT, alturaT);
		System.out.println("Se llama: " +pT.nombreTeclado);
		System.out.println("Tiene: " +pT.edadT);*/
		
		//Imprimir la cadena del toString
		
		//System.out.println(p1);
		
		/* String nom;
		 * 
		 *  nom = p1.getNombre();
		 */
		
		/* syso p1
		 * syso p1.getNombre
		 * syso Diga un nuevo nombre
		 * nuevonmb = Leer.dato
		 * p1.setNombre (nuevonomb);
		 * system.out.println(p1)
		 
		 p1.cumpleanios();
		 
		 syso p1.edad;
		 */
	}

}
