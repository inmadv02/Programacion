package prueba;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] entrar;
		char respuesta = ' ';
		int clave = 959302, op = 0, op2 = 0, op3 = 0; 
		int tamM = 7, tamE = 3;
		int cero = 0, uno = 1, dos = 2, tres = 3, cuatro = 4, cinco = 5, seis = 6, nueve = 9;
		int hasta = 7, desde = 0;
		String [] metas = {"Ahorrar para comprar un vehículo", "Montar una empresa", "Ahorrar para un regalo de cumpleaños",
				"Comprar una vivienda", "Ahorrar para comprar ropa", "Ahorrar para un cumpleaños", 
				"Ahorrar para un aniversario"};
		String [] metaG;
		Random r = new Random (System.nanoTime());
		
		//Aquí iría el logo del programa. 
		
		do {
			
		System.out.println("\t \t \tHola. Bienvenido a Still-In."); //En vez de programa, pondría el nombre real.
		System.out.println("\t El programa que le ayuda a gestionarse y cumplir sus objetivos\n");
		
		entrar = new String [tamE];
		
			System.out.println("Iniciar sesión\n");
			System.out.print("Nombre de usuario: \n");
			entrar [cero] = Leer.dato();
			System.out.println("Correo electrónico: \n");
			entrar [uno] = Leer.dato();
			System.out.print("Contraseña: \n");
			entrar [dos] = Leer.dato();
			System.out.println("Introduzca la clave secreta: "); //959302. ESTA ES LA CLAVE. COMO ESTE PROGRAMA CONTIENE
			clave = Leer.datoInt();                              //INFORMACIÓN DEL BANCO, HE PUESTO ESTA CLAVE COMO MEDIDA    
				while (clave!=959302) {                          //DE SEGURIDAD. 
					System.out.println("Clave incorrecta. Inténtelo de nuevo.\n");
					clave = Leer.datoInt();
			    }
		//añadir tic.
			System.out.println("\nHa iniciado sesión con éxito.\n");
			System.out.println("Recuerde que si quiere cerrar el programa, debe pulsar 1.\n");
			System.out.println("_______________________________\n");
			
			do {
				System.out.println("\n¿Qué es lo que desea hacer?\n");
				System.out.println("1. Mi perfil.");
				System.out.println("2. Mis metas.");
				System.out.println("3. Mi dinero.");
				System.out.println("0. Cerrar sesión.");
				op = Leer.datoInt();
				
				switch (op) {
				
					case 1:
						System.out.println("Aquí puede encontrar los datos que nos ha proporcionado.\n");
						System.out.println("Correo electrónico: " + entrar [uno]); 
						System.out.println("Nombre de usuario: " + entrar [cero]);
						System.out.println("Contraseña: ------");
						System.out.println("Número de metas cumplidas: 6.");
						System.out.println("Sexo: no especificado.");
						System.out.println("Se unió: 19/02/2019");
						break;
					case 2:
						System.out.println("Aquí puede ver las metas que ha cumplido, las que están \n"
								+ "haciéndose y las que quedan por completarse\n");
						System.out.println("Asimismo, guardamos sus objetivos futuros; y si está indeciso\n"
								+ "podemos ayudarle a comenzar un nuevo plan con nuestro generador aleatorio\n"
								+ "de metas.\n");
						System.out.println("1. Metas cumplidas.");
						metaG = new String [tamM];
						System.out.println("2. Estoy en ello.");
						System.out.println("3. En un futuro.");
						System.out.println("4. No tengo plan. Sorpréndeme.");
						System.out.println("5. Volver al menú principal.");
						
						op2 = Leer.datoInt();
						
						switch (op2) {
							
							case 1: 
								System.out.println("En el tiempo que ha estado activo en Still-In, las metas que\n"
										+ "se han cumplido son las siguientes.\n");
								System.out.println("Ahorrar 600€ en cuatro meses.");
								System.out.println("\t Detalles");
								System.out.println("Ahorrar para el viaje con mis amigos.");
								System.out.println("Comprar la sudadera que tanto quería.");
								System.out.println("Ahorrar para las entradas del concierto.");
								System.out.println("Ahorrar para la fiesta de mi vigésimocuarto cumpleaños");
								System.out.println("Pagar el examen de B2 en inglés.");
								break;
							case 2: 
								System.out.println("En esta categoría, guardamos las metas que están todavía sin cumplir.\n"
										+ "Esperamos que dentro de poco podamos incluirlas en 'Metas cumplidas'");
								System.out.println("Regalo de Navidad para mis padres.");
								System.out.println("Comprar un coche nuevo");
								System.out.println("Juntar el dinero que le debo a mis padres.");
							    break;
							case 3:
								System.out.println("En esta última categoría, encontrará los planes que quiere realizar\n"
										+ "en un futuro.");
								System.out.println("Pagar el examen de C1 en inglés.\n");
								System.out.println("Pagar el examen de B1 en francés.\n");
								break;
							case 4:
								System.out.println("¿No sabe qué reto ponerse exactamente? No pasa nada. Con nuestro\n"
								+ "generador de metas aleatorias podrá elegir la que más le guste sin necesidad\n"
								+ "de pensar nada.\n");
								System.out.println("¿Preparado?");
								
								for (int i = 0; i < metas.length; i++) {
									 System.out.println("La meta que ha salido es: " +metas[i]);
									 System.out.println("Pulse 6 para guardar la meta.");
									 System.out.println("Pulse 9 para seguir intentándolo.");
									 respuesta = Leer.datoChar();
									 
									 do {
										 while (respuesta == nueve) {
											 for (int j = 0; j < metas.length; j++) {
												 System.out.println("La meta que ha salido es: " +metas[j]);
												 System.out.println("Pulse 6 para guardar la meta.");
												 System.out.println("Pulse 9 para seguir intentándolo.");
												 respuesta = Leer.datoChar();
											 }
		   							    }
									
									 }while (respuesta!=nueve);
									 
								  }
							

								  /*do {
									while (numero==cero){
										System.out.println("La meta que ha salido es: " + metas [cero]);
								    	System.out.println("¿Elegirá esta?");
								    	System.out.println("Diga 'Sí' para guardar la meta.");
								    	System.out.println("Diga 'No' para seguir intentándolo.");
								    	respuesta = Leer.datoChar();
								    	if (respuesta == seis) {
								    		System.out.println("Meta guardada.");
								    		metas [cero] = metaG [cero];//Duda
								    	}else {
								    		System.out.println("Va a intentarlo de nuevo");
								    		numero = r.nextInt(hasta-desde+1)+desde;
								    	}	
									}
									while (numero==uno){
										System.out.println("La meta que ha salido es: " + metas [uno]);
								    	System.out.println("¿Elegirá esta?");
								    	System.out.println("Pulse 6 para guardar la meta. ");
								    	System.out.println("Pulse 9 para seguir intentándolo.");
								    	respuesta = Leer.datoChar();
								    	if (respuesta == seis) {
								    		System.out.println("Meta guardada.");
								    		metas [uno] = metaG [uno];
								    	}else {
								    		System.out.println("Va a intentarlo de nuevo");
								    		numero = r.nextInt(hasta-desde+1)+desde;
								    	}	
									}
									while (numero==dos){
										System.out.println("La meta que ha salido es: " + metas [dos]);
								    	System.out.println("¿Elegirá esta?");
								    	System.out.println("Pulse 6 para guardar la meta. ");
								    	System.out.println("Pulse 9 para seguir intentándolo.");
								    	respuesta = Leer.datoChar();
								    	if (respuesta == seis) {
								    		System.out.println("Meta guardada.");
								    		metas [dos] = metaG [dos];
								    	}else {
								    		System.out.println("Va a intentarlo de nuevo");
								    		numero = r.nextInt(hasta-desde+1)+desde;
								    	}
									}
									while (numero==tres){
										System.out.println("La meta que ha salido es: " + metas [tres]);
								    	System.out.println("¿Elegirá esta?");
								    	System.out.println("Pulse 6 para guardar la meta. ");
								    	System.out.println("Pulse 9 para seguir intentándolo.");
								    	respuesta = Leer.datoChar();
								    	if (respuesta == seis) {
								    		System.out.println("Meta guardada.");
								    		metas [tres] = metaG [tres];
								    	}else {
								    		System.out.println("Va a intentarlo de nuevo");
								    		numero = r.nextInt(hasta-desde+1)+desde;
								    	}
									}
									while (numero==cuatro){
										System.out.println("La meta que ha salido es: " + metas [cuatro]);
								    	System.out.println("¿Elegirá esta?");
								    	System.out.println("Pulse 6 para guardar la meta. ");
								    	System.out.println("Pulse 9 para seguir intentándolo.");
								    	respuesta = Leer.datoChar();
								    	if (respuesta == seis) {
								    		System.out.println("Meta guardada.");
								    		metas [cuatro] = metaG [cuatro];
								    	}else {
								    		System.out.println("Va a intentarlo de nuevo");
								    		numero = r.nextInt(hasta-desde+1)+desde;
								    	}	
									}
									while (numero==cinco){
										System.out.println("La meta que ha salido es: " + metas [cinco]);
								    	System.out.println("¿Elegirá esta?");
								    	System.out.println("Pulse 6 para guardar la meta. ");
								    	System.out.println("Pulse 9 para seguir intentándolo.");
								    	respuesta = Leer.datoChar();
								    	if (respuesta == seis) {
								    		System.out.println("Meta guardada.");
								    		metas [cinco] = metaG [cinco];
								    	}else {
								    		System.out.println("Va a intentarlo de nuevo");
								    		numero = r.nextInt(hasta-desde+1)+desde;
								    	}	
									}
									while (numero==seis){
										System.out.println("La meta que ha salido es: " + metas [seis]);
								    	System.out.println("¿Elegirá esta?");
								    	System.out.println("Pulse 6 para guardar la meta. ");
								    	System.out.println("Pulse 9 para seguir intentándolo.");
								    	respuesta = Leer.datoChar();
								    	if (respuesta == seis) {
								    		System.out.println("Meta guardada.");
								    		metas [seis] = metaG [seis];
								    	}else {
								    		System.out.println("Va a intentarlo de nuevo");
								    		numero = r.nextInt(hasta-desde+1)+desde;
								    	}
									}
								}while (respuesta!=seis);/*/
						
						    break;
							case 5:
								System.out.println("Ha decidido volver al menú principal");
							break;
							default:
								System.out.println("Opción incorrecta. Inténtelo de nuevo.");
						}
					break;	    
					case 3:
						System.out.println("Aquí puede ver el saldo que le queda, sus gastos y el dinero\n"
								+ "que ha ahorrado desde que está en nuestro programa. ");
						System.out.println("Le recordamos que este apartado está vinculado con su cuenta \n"
								+ "bancaria, pero no por ello podrá usar Still-In para hacer transferencias, pedir\n"
								+ "préstamos, etc. ");
						System.out.println("¿Qué le gustaría hacer?");
						System.out.println("1. Ver mi saldo.");
						System.out.println("2. Ver mis gastos.");
						System.out.println("3. Ver mis ahorros.");
						
						switch (op3) {
							
						  case 1: 
						
						}
						

						break;
					case 0:
						System.out.println("Ha cerrado sesión");
						break;
					default: 
						System.out.println("Opción incorrecta. Inténtelo de nuevo.");
						
						
						
								    
						}
				
			}while (op!=cero);
		
		
		}while (op!=uno);

	}

}



