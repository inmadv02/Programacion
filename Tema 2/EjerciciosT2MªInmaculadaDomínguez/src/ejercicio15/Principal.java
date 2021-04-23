package ejercicio15;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op, num_entradas;
		double saldo = 1005.90;
		double ingresar;
		int cero = 0;
		double sacar;
		double precio_entradas = 4.50, precioTotal;
		
		do {
		
		System.out.println("\n¡Hola! Bienvenido a BBVA. ¿Qué desea hacer?");
		System.out.println("Para elegir una opción del menú, pulse uno de los siguientes números:");
		System.out.println("1. Ver saldo.");
		System.out.println("2. Retirar dinero. ");
		System.out.println("3. Comprar entradas.");
		System.out.println("4. Ingresar dinero");
		System.out.println("0. Salir.");
		
		op = Leer.datoInt();
		
		switch (op) {
		
		   case 1: 
			   System.out.println("Su saldo es: " + saldo + " euros. \n");
			   break;
		   case 2:
			   if (saldo==cero) {
				   System.out.println("Lo sentimos. No puede sacar dinero porque tiene 0 euros en la cuenta.");
			   }else {
				   System.out.println("¿Cuánto dinero quiere retirar? \n");
				   sacar = Leer.datoDouble();
				   while (saldo<sacar) {
				     System.out.println("Lo sentimos. La cantidad que quiere sacar es mayor que su saldo actual.");
				     System.out.println("Retire una cantidad menor.");
				     sacar = Leer.datoDouble();
				   } 
				   System.out.println("Ha sacado: " + sacar + " euros");
				   saldo = saldo - sacar;
				   System.out.println("Su saldo actual es de: " + saldo + " euros\n");
			   }
			   break;
		   case 3:
			   System.out.println("¿Cuántas entradas quiere comprar? \n");
			   num_entradas = Leer.datoInt();
			   precioTotal = num_entradas * precio_entradas;
			   System.out.println("El precio total por sus entradas es de: " + precioTotal + " euros");
			   saldo = saldo - precioTotal;
			   System.out.println("\nSu saldo actual es de: " + saldo + " euros");
			   break;
		   case 4:
			   System.out.println("¿Qué cantidad le gustaría ingresar?");
			   ingresar = Leer.datoDouble();
			   saldo = ingresar + saldo;
			   System.out.println("Ahora, su sueldo es de: " + saldo + " euros.\n");
			   break;
		   case 0:
			   System.out.println("Ha decidido salir. \n");
			   break;
		   default:
			   System.out.println("Opción incorrecta. \n");
	   } 
	   }while(op!=0);
		
		System.out.println("Muchas gracias por utilizar nuestros servicios. ¡Hasta pronto!");


	}

}
