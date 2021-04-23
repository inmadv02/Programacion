package ejemplo11;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hasta, desde;
		int listado [];
		Random r = new Random (System.nanoTime());
		int ale = 0;
		listado = new int [ale];
		
		System.out.println("El tamaño es: ");
		hasta = listado.length-1;
		desde = 0;
		ale = r.nextInt(hasta-desde+1)+desde;
		
		for (int i = 0; i <listado.length; i++) {
			ale = r.nextInt(hasta-desde+1)+desde;
		}
		//for (int i = 0; i < listado.length
	}

}
