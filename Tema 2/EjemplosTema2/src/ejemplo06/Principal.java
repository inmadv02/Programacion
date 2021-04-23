package ejemplo06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		double saldo = 640;
		double ingresar;
		int cero = 0;
		double sacar;
		
		do {
		
		System.out.println("¡Hola! ¿Qué desea hacer? Pulse el número adecuado.");
		System.out.println("1. Dar bienvenida.");
		System.out.println("2. Ingresar cantidad. ");
		System.out.println("3. Mostrar saldo.");
		System.out.println("4. Sacar cantidad");
		System.out.println("0. Salir.");
		
		op = Leer.datoInt();
		
		switch (op) {
		
		   case 1: 
			   System.out.println("Bienvenido a nuestro programa.\n");
			   break;
		   case 2:
			   System.out.println("¿Cuánto quiere ingresar? \n");
			   ingresar = Leer.datoDouble();
			   saldo = saldo + ingresar;
			   System.out.println("Su nuevo saldo es: " + saldo + "euros\n");
			   break;
		   case 3: 
			   System.out.println("Su saldo es: " + saldo + " euros. \n");
			   break;
		   case 4:
			   if (saldo == cero) {
				   System.out.println("No puede sacar dinero. Su saldo es de 0 euros.\n");
			   }  
			   //A PARTIR DE AQUÍ NO SÉ QUÉ HACER
			   sacar = Leer.datoDouble(); 
			   if (sacar>saldo) {
					   System.out.println("No puede sacar más dinero del que tiene dentro de"
					   		+ " su cuenta");
			   }
			   else {
				   System.out.println("¿Cuánto dinero quiere sacar?\n");
				   saldo = saldo - sacar;
				   System.out.println("Su saldo actual es: " + saldo + "euros");
			   }
			   break;
		   case 0:
			   System.out.println("Ha decidido salir. \n");
			   break;
		   default:
			   System.out.println("Opción incorrecta. \n");
	   } 
	   }while(op!=0);
		
		System.out.println("última línea del programa. Se hace solo al final.");

	}

}
