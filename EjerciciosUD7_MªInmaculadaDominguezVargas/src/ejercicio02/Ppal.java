package ejercicio02;

import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1, num2;
		int op = 1, cero = 0;
		boolean loop = true;
		Scanner sc = new Scanner (System.in);
		String aux;
		
		System.out.println("Bienvenido a la calculadora de Windows.");
		
		do {
			
		
			System.out.println("\n¿Qué es lo que desea hacer?");
			System.out.println("1. Sumar.");
			System.out.println("2. Restar.");
			System.out.println("3. Multiplicar.");
			System.out.println("4. Dividir.");
			System.out.println("5. Raíz cuadrada");
			
			do {
				
				try {
					aux = sc.nextLine();
					op = Integer.parseInt(aux);
					
					switch(op) {
					
						case 1:
								System.out.println("Introduzca dos números.");
								aux = sc.nextLine();
								num1 = Double.parseDouble(aux);
								aux = sc.nextLine();
								num2 = Double.parseDouble(aux);
								System.out.println("El resultado es: " + Calculadora.sumar(num1, num2));
								
							break;
						case 2:
								System.out.println("Introduzca dos números.");
								aux = sc.nextLine();
								num1 = Double.parseDouble(aux);
								aux = sc.nextLine();
								num2 = Double.parseDouble(aux);
								System.out.println("El resultado es: " + Calculadora.restar(num1, num2));
								
							break;
						case 3:
								System.out.println("Introduzca dos números.");
								aux = sc.nextLine();
								num1 = Double.parseDouble(aux);
								aux = sc.nextLine();
								num2 = Double.parseDouble(aux);
								System.out.println("El resultado es: " + Calculadora.multiplicar(num1, num2));
							break;
						case 4:
								System.out.println("Introduzca dos números.");
								aux = sc.nextLine();
								num1 = Double.parseDouble(aux);
								aux = sc.nextLine();
								num2 = Double.parseDouble(aux);
								System.out.println("El resultado es: " + Calculadora.dividir(num1, num2));
							
							break;
						case 5:
								System.out.println("Introduzca un número.");
								aux = sc.nextLine();
								num1 = Double.parseDouble(aux);
								System.out.println("El resultado es: " + Calculadora.hacerRaizCuadrada(num1));
								
							break;
						case 0:
							System.out.println("Ha decidido salir.");
							break;
						default:
							System.out.println("Opción incorrecta.");
						}
					loop = false;
				}
				
				catch (NumberFormatException numberFormatException) {
					System.err.printf( "\nExcepción: %s\n", numberFormatException);
					System.out.println("Debe introducir números. Inténtelo de nuevo.\n" );
					
					

				}
				catch (ArithmeticException arithmeticException) {
					 System.err.printf("\nExcepción: %s\n", arithmeticException );
					 System.out.println("El denominador no puede ser 0. Inténtelo de nuevo.\n" );
					 sc.nextLine();
				}
				catch (RaizNumeroNegativoExcepcion e) {
					 System.err.printf("\nExcepción: %s\n", e);
					 System.out.println("No se puede hacer la raíz cuadrada de un número negativo. Inténtelo de nuevo.\n" );
					 sc.nextLine();
				}
				
				catch(Exception excepcion) {
					 System.out.println("¡Ups! Parece que ha habido un error inesperado. Inténtelo de nuevo.\n");
					
				}
				
			}while(loop);
					
		}while(op!=cero);
			
	}

}
