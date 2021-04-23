package ejemplo1;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trabajador t = new Trabajador ("Inma", "Jefa sección");
		
		Empleado e1 = new Empleado("Juán", "Coordinador", 2500, 10.1);
		
		Consultor c1 = new Consultor ("Pepé", "Consultor sección", 160, 36.7);
	
		
		System.out.println(t.getNombre());
		
		System.out.println(e1.getNombre());
		
		System.out.println(t.calcularPaga());
	
		System.out.println(e1.calcularPaga());
		
		System.out.printf("%.2f", c1.calcularPaga());
		
		
		System.out.println();
	
		//abstract: cuentas bancarias, personas. Cosas que no sean fáciles de definir nada más
		//sabiendo el nombre. Ejemplo: animales. No puedo pintar uno libremente, necesito saber
		//si es vertebrado, invertebrado, mamífero, vivíparo, ovíparo...
	
	
	}

}
