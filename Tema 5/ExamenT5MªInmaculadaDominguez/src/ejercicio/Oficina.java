package ejercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Oficina {
	
	private List <Trastero> listado;

	public Oficina(List<Trastero> listado) {
		super();
		this.listado = listado;
	}

	public List<Trastero> getListado() {
		return listado;
	}

	public void setListado(List<Trastero> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Oficina [listado=" + listado + "]";
	}
	
	public void aniadirTrastero(Trastero t) {
		listado.add(t);
	}
	
	public void mostrarTrasteros (Iterator <Trastero> it) {
		
		it = listado.iterator();
		
		if(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
	}
	
	public int buscarPorPrecio (double precio) {
		int temp = -1;
		boolean salir = false;
		for (int i = 0; i < listado.size() && !salir; i++) {
			if(listado.get(i).getPrecio() == precio) {
				temp = i;
				salir = true;
			}
			
		}
		return temp;
		
	}
	
	public Trastero buscarPorNumero (int id) {
		Trastero temp = null;
		boolean salir = false;
		for (int i = 0; i < listado.size() && !salir; i++) {
			if(listado.get(i).getId() == id) {
				temp = listado.get(i);
				salir = true;
			}
		}
		return temp;
	}
	
	public int buscarPorNumero2 (int id) {
		int temp = -1;
		boolean salir = false;
		for (int i = 0; i < listado.size() && !salir; i++) {
			if(listado.get(i).getId() == id) {
				temp = i;
				salir = true;
			}
		}
		return temp;
	}
	
	
	public void eliminarTrastero (int id) {
		Trastero index = buscarPorNumero(id);
		
		listado.remove(index);
	}
	
//	public void eliminarTrasteroMasCaro (double precio) {
//		
//		
//		double mayor = t.getPrecio();
//		
//		for (int i = 0; i < listado.size(); i++) {
//			if(listado.get(i).getPrecio() > mayor ) {
//				
//			}
//		}
//		
//		
//	}
//	
	public void modificarTrastero (double precioNuevo, int id) {
		int index = buscarPorNumero2(id);
		int cero = 0;
		if(index >= cero) {
			listado.get(index).setPrecio(precioNuevo);
		}
	}
	
	public void ordenarPorNumero (Trastero t) {
		t.compareTo(t);
		
		for(Trastero t1 : listado) {
			
			System.out.println(t1);
		}
		
	}
	
	public void mostrarTrasterosLibres () {
		
		for(Trastero t : listado) {
			if(t.isOcupado() == false) {
				System.out.println(t);
			}
		}
	}

}
