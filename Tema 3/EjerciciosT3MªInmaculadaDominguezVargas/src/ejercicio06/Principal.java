package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*6. Se desea llevar un control del estado de una cuenta corriente. Una cuenta corriente está caracterizada
		por su saldo y el nombre del titular y sobre ella se pueden realizar tres tipos de operaciones:
			• Ingresar (cantidad): ingresa en la cuenta una cantidad de dinero dada por el usuario. No
			imprime de nuevo el saldo, pero sí lo actualiza.
			• Retirar (cantidad): Debe comprobar si queda suficiente saldo y si es así, disminuye la cuenta
			una determinada cantidad de dinero especificada por el usuario. No imprime de nuevo el
			saldo, pero sí lo actualiza.
			• Calcular saldo en dólares americanos. Se le debe pasar el valor de cambio y debe devolver el
			valor del saldo en dólares.
			• Consultar el saldo.
			Supón que la cuenta inicialmente tiene un saldo de cero. Escribe una clase CuentaCorriente que
			implemente las funcionalidades descritas y un main con un menú para probarlas.*/
		
		int op;
		int cero = 0;
		double añadir;
		double quitar;
		double equivalencia;
		Cuenta c1 = new Cuenta ("Inma", 5400.45);
		
		do {
		System.out.println("\n¡Hola! Bienvenido a su cuenta corriente de BBVA. ¿Qué es lo que quiere hacer?");
		System.out.println("1. Ingresar cantidad.");
		System.out.println("2. Retirar cantidad.");
		System.out.println("3. Calcular el saldo en dólares americanos");
		System.out.println("4. Consultar el saldo");
		System.out.println("0. Salir.\n");
		op = Leer.datoInt();
		
		switch (op) {
		
			case 1:
				System.out.println("\n¿Cuánto quiere ingresar?");
				añadir = Leer.datoDouble();
				c1.ingresar(añadir);
				break;
			case 2: 
				if (c1.saldo == cero) {
					System.out.println("\nNo tiene dinero en la cuenta. No puede realizar esta acción.");
				}else {
					System.out.println("\n¿Cuánto quiere retirar?");
					quitar = Leer.datoDouble();
					while (c1.saldo < quitar) {
						System.out.println("\nEsa cantidad es mayor a la que tiene en el banco. Pruebe de nuevo.");
						quitar = Leer.datoDouble();
					}
					c1.retirar(quitar);
				}
				break;
			case 3:
				System.out.println("\n¿A cuánto equivale 1 euro en dólares?");
				equivalencia = Leer.datoDouble();
				System.out.printf("Su sueldo es de: %.2f dolares.\n", c1.cambiar(equivalencia));
				break;
			case 4:
				System.out.printf("El saldo es de: %.2f euros \n", c1.saldo);
				break;
			case 0:
				System.out.println("\nHa decidido salir de su cuenta. ¡Que tenga un buen día!");
				break;
			default:
				System.out.println("Opción incorrecta. Inténtelo de nuevo");
		}
		}while (op!=cero);
		
		
	}

}
