package ejercicio02;

public class Operaciones {
	
	public boolean comprobar (int numero) {
		boolean respuesta;
		int cero = 0;
		
		if (numero >= cero) {
			
			respuesta = true;
			return respuesta;
		}else {
			respuesta = false;
			return respuesta;
		}	
	}
	public boolean parOimpar (int numero) {
		boolean respuesta;
		int divisor = 2;
		int cero = 0;
		if (numero%divisor == cero){
			respuesta = true;
			return respuesta;
		}else {
			respuesta = false;
			return respuesta;
		}
	}
}
