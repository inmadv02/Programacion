package ejemplo10;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EJEMPLO 1 
		
		/*int hasta = 49, desde = 1;
		int uno = 1;
		int tope;
		int num;
		Random r = new Random (System.nanoTime());
		
		int ValorDado = r.nextInt(hasta - desde + uno) +uno;
		
		System.out.println("El número aleatorio que ha salido es:" +r);*/
		
		/*Random num= new Random (System.nanoTime());
		
		for (int i=0; i<uno; i++){
		
			int numeroAleatorio= num.nextInt (hasta);
			System.out.println("Número aleatorio entre 1 y 49: "+numeroAleatorio);
		}*/
		
		//EJEMPLO 2
		/*int hasta, desde;
		int tope;
		
		Random num= new Random (System.nanoTime());
		
		System.out.println("¡Hola! Bienvenido a nuestro programa. \n");
		System.out.println("¿Cuántos números aleatorios quiere generar?");
		tope = Leer.datoInt();
		
		System.out.println("¿En qué número quiere que empiecen a generarse los números aleatorios?");
		desde = Leer.datoInt();
		System.out.println("¿Y en qué número quiere que acaben de generarse los números aleatorios?");
		hasta = Leer.datoInt();
			for (int i=0; i<tope; i++) {
				int numeroAleatorio= num.nextInt (hasta);
				System.out.println("Número aleatorio: " +numeroAleatorio);
			}*/
		
		//EJEMPLO 3
		
		int [] lista;
		int tam, hasta, desde;
		Random r = new Random (System.nanoTime());
		System.out.println("¿Cuántos números quiere?");
		tam = Leer.datoInt();
		lista = new int [tam];
		System.out.println("¿Número mayor?");
		hasta = Leer.datoInt();
		System.out.println("¿Número menor?");
		desde = Leer.datoInt();
		
		for (int i = 0; i<lista.length; i++) {
			lista [i] = r.nextInt(hasta-desde+1)+desde;
		}
		for (int i = 0; i<lista.length; i++) {
			System.out.println(lista[i]);
		}
	}
}

