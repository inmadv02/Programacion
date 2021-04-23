package ejercicio07;

import java.util.Random;

public class Sorteo {
	
	int numero;
	
	public Sorteo () {
		//this.numero = numero;
	}
	
	public int sortear () {
		Random ale = new Random (System.nanoTime());
		int desde = 1;
		int hasta = 100;
		int resultado;
		
		resultado = ale.nextInt(hasta-desde+1)+desde;
		return resultado;
		
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public boolean comprobar (int numero) {
		int comprobacion;
		comprobacion = sortear();
		boolean respuesta;
		if (numero == comprobacion) {
			respuesta = true;
			return respuesta;
		}else {
			respuesta = false;
			return respuesta;
		}
	}	
	
}
