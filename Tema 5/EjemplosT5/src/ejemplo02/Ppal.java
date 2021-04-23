package ejemplo02;

import java.util.ArrayList;
import java.util.List;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> listadoBueno = new ArrayList <String> ();
		List <String> lista = new ArrayList <String> ();
		
		listadoBueno.add("Ángel");
		listadoBueno.add("Miguel");
		listadoBueno.add("Holiwis");
		listadoBueno.add(3, "¿Qué tal?");
		
		System.out.println(listadoBueno);
		System.out.println(listadoBueno.size());

	}

}
