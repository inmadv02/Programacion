package ejercicio04;

import java.util.Random;

public class Moneda {
	
	int ladoM;
	
	public Moneda (int ladoM) {
		this.ladoM = ladoM;
	}
	
	//public Moneda ()
	
	public int generador () {
		Random numA = new Random (System.nanoTime());
		int hasta = 2;
		int desde = 1;
		//int a;
		// a = ale.nextInt (hasta-desde+1)+desde;
		ladoM = numA.nextInt(hasta-desde+1)+desde;
		return ladoM;
		//return a
	}
	
	public boolean ganador (int eleccion) {
		//Moneda nueva = new Moneda (ladoM);
		boolean ganador;
		//En vez de ladoM, podemos crear otra variable "a" y sustituir ladoM
		//
		ladoM = generador();
		if (eleccion == ladoM) {
			ganador = true;
		}else
			ganador = false;
		return ganador;
		
	}
	public void resultado (boolean ganador) {
		if (ganador==true) {
			System.out.println("¡Felicidades, ha ganado! Corra a compartir su premio con sus familiares y amigos.");
		}else {
			System.out.println("¡Casi! Ha estado usted a muy poco de ganar. Inténtelo la próxima vez.");
		}
	}

}
