package ejercicio;

import java.util.Comparator;

public class ComparaPorPrecio implements Comparator <Trastero> {
	
	public int compare(Trastero uno, Trastero dos) {
		
		int negativo = -1, positivo = 1, cero = 0;
		double precio1 = uno.getPrecio();
		double precio2 = dos.getPrecio();
		
		if (precio1 < precio2) {
			return positivo;
		}
		
		if(precio1 > precio2) {
			return negativo;
		}
		else {
			return cero;
		}
	}

}
