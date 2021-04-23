package yaFunciona;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] entrar;
		String respuesta = "", negacion = "No", afirmacion = "Sí", sinTilde = "Si";
		int clave = 959302, op = 0, tamE = 4, tamM = 6, numero;
		int cero = 0, uno = 1, dos = 2, tres = 3, cuatro = 4, cinco = 5;
		int hasta = 7, desde = 0;
		String [] metas = {"Ahorrar para comprar un vehículo", "Montar una empresa", "Ahorrar para un regalo de cumpleaños",
				"Comprar una vivienda", "Ahorrar para comprar ropa", "Ahorrar para un cumpleaños", 
				"Ahorrar para un aniversario"};
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
			System.out.println("Introduzca la clave secreta: ");
			clave = Leer.datoInt();
				while (clave!=959302) {
					System.out.println("Clave incorrecta. Inténtelo de nuevo.\n");
					clave = Leer.datoInt();
			    }
		//añadir tic.
			System.out.println("\nHa iniciado sesión con éxito.\n");
			System.out.println("Recuerde que si quiere cerrar el programa, debe pulsar 0.\n");
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
						System.out.println("2. Estoy en ello.");
						System.out.println("3. En un futuro.");
						System.out.println("4. No tengo plan. Sorpréndeme.");
						System.out.println("5. Volver al menú principal.");
						break;
					case 3:
						System.out.println("Aquí puede encontrar su ");
						break;
					case 0:
						System.out.println("Ha decidido cerrar sesión.");
						break;
					default: 
						System.out.println("Opción incorrecta. Inténtelo de nuevo.");
						
						switch (op) {
						
							case 1: 
								System.out.println("En el tiempo que ha estado activo en Still-In, las metas que\n"
										+ "se han cumplido son las siguientes.\n");
								System.out.println("Ahorrar 600€ en cuatro meses.");
								System.out.println("\t Detalles");
								System.out.println("Ahorrar para el viaje con mis amigos.");
								System.out.println("Comprar la sudadera que tanto quería.");
								System.out.println("Ahorrar para las entradas del concierto.");
								break;
							case 2: 
								System.out.println("En esta categoría, guardamos las metas que están todavía sin cumplir.\n"
										+ "Esperamos que dentro de poco podamos incluirlas en 'Metas cumplidas'");
								System.out.println("Regalo de Navidad para mis padres.");
								System.out.println("Comprar un coche nuevo");
								break;
							case 3:
								break;
							case 4:
								System.out.println("¿No sabe qué reto ponerse exactamente? No pasa nada. Con nuestro\n"
										+ "generador de metas aleatorias podrá elegir la que más le guste sin necesidad\n"
										+ "de pensar nada.\n");
								System.out.println("¿Preparado?");
								numero = r.nextInt(hasta-desde+1)+desde;
									do {
										while (numero==cero){
											System.out.println("La meta que ha salido es: " + metas [cero]);
									    	System.out.println("¿Elegirá esta?");
									    	System.out.println("Diga 'Sí' para guardar la meta.");
									    	System.out.println("Diga 'No' para seguir intentándolo.");
									    	respuesta = Leer.dato();
									    	if (respuesta == afirmacion) {
									    		System.out.println("Meta guardada.");
									    	}else {
									    		System.out.println("Va a intentarlo de nuevo");
									    	}
											
										}
										
									}while (respuesta!=sinTilde);
							break;
								    
						}
				}
				
				
			}while (op!=cero);
		
		
		}while (op!=cero);

	}

}
