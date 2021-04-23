package ejercicio02Colecciones;

import java.util.Collections;
import java.util.List;

public class GestionClub {
	
	private List <Socio> listado;

	public GestionClub(List<Socio> listado) {
		super();
		this.listado = listado;
	}

	public List<Socio> getListado() {
		return listado;
	}

	public void setListado(List<Socio> listado) {
		this.listado = listado;
	}
	
	
	@Override
	public String toString() {
		return "GestionClub [listado=" + listado + "]";
	}

	public void aniadirSocio (Socio s2) {
		listado.add(s2);
	}
	
	public int buscarSocio (int id) {
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
	
	public void modificarSocio (String nombreNuevo, int id) {
		
		int index = buscarSocio(id);
		
		if(index >= 0) {
			listado.get(index).setNombre(nombreNuevo);
		}
	}
	
	
	public void borrarSocio (int id) {
		int index = buscarSocio(id);
		
		if(index >= 0) {
			listado.remove(index);
		}
	}
	
	public void mostrarSocios () {
		Collections.sort(listado);
		for (Socio s : listado) {
			System.out.println(s);
		}
	}
	
	public void mostrarSocio (Socio s) {
		System.out.println(s);
	}

}
