package ejemplo4;

public class OperacionesFiguras {
	
	public double calcularElAreaDeUnaFigura (Figura f){
		return f.calcularArea();//esta f llama al m�todo reescrito
	}
	
	/*1) Dentro del m�todo sumarAreas, se est� llamando al 
	 *   m�todo calcularElAreaDeUnaFigura, al que se le pasa 
	 *   como par�metro una figura del array
	 *   
	 *2) El m�todo calcularElAreaDeUnaFigura es el que
	 *   distingue a qu� versi�n de calcularArea hay que llamar
	 *   seg�n lo que haya en el listado, un cuadrado o un c�rculo
	 */

	public double sumarAreas (Figura [] listado){
		double resultado=0;

		for (int i=0; i<listado.length;i++){
			resultado=resultado+calcularElAreaDeUnaFigura(listado[i]);
		}
		return resultado;
	}
}
