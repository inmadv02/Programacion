package ejercicio15;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op, cero = 0, num_entradas;
		Cuenta c1;
		String usuarioT;
		double sacar, ingresar;
		

		do {
			
			System.out.println("\n¡Hola! Bienvenido a BBVA. Ingrese su nombre de usuario, por favor: ");
			usuarioT = Leer.dato();
			c1 = new Cuenta (usuarioT, 6700.67, 2.5);
			System.out.println("\n Ha entrado a su cuenta. ¿Qué desea hacer?");
			System.out.println("Para elegir una opción del menú, pulse uno de los siguientes números:");
			System.out.println("1. Ver saldo.");
			System.out.println("2. Retirar dinero. ");
			System.out.println("3. Comprar entradas.");
			System.out.println("4. Ingresar dinero");
			System.out.println("0. Salir.");
			
			op = Leer.datoInt();
			
			switch (op) {
			
			   case 1: 
				   System.out.println("Su saldo es de: " + c1.saldo + " euros. \n");
				   break;
			   case 2:
				   if (c1.saldo==cero) {
					   System.out.println("Lo sentimos. No puede sacar dinero porque tiene 0 euros en la cuenta.");
				   }else {
					   System.out.println("¿Cuánto dinero quiere retirar? \n");
					   sacar = Leer.datoDouble();
					   if (c1.saldo<sacar) {
					     System.out.println("Lo sentimos. La cantidad que quiere sacar es mayor que su saldo actual.");
					   }else 
					   {
						   System.out.println("Ha sacado: " + sacar + " euros");
						   System.out.println("Su saldo actual es de: " + c1.retirar(sacar) + " euros\n");
					   }
				   }
				   break;
			   case 3:
				   System.out.println("¿Cuántas entradas quiere comprar? \n");
				   num_entradas = Leer.datoInt();
				 
				   System.out.println("El precio total por sus entradas es de: " + c1.comprarEnt(num_entradas) + " euros");
				   break;
			   case 4:
				   System.out.println("¿Qué cantidad le gustaría ingresar?");
				   ingresar = Leer.datoDouble();
				   System.out.println("Ahora, su sueldo es de: " + c1.ingresar(ingresar) + " euros.\n");
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
