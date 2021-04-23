package ejemplo05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map <String, String> mapa = new HashMap <String, String> ();
		
		mapa.put("one", "1st");
		mapa.put("second", "2nd");
		mapa.put("third", "3rd");
		
		//el set es para devolver conjuntos de claves, es decir, de keys.
		
		Set <String> set1 = mapa.keySet();
		
		//como no puedo poner en un set los values, porque los set no permiten que se repitan los valores
		//lo metemos en el sitio más general, como Collection
		
		Collection <String> coleccion = mapa.values();
		
		Set<Entry<String, String>> set2 = mapa.entrySet();
		
		//ahora nos dan un set con las entradas (key y value)
		
		System.out.println(set1 + "\n" + coleccion + "\n" + set2);
	}

}
