package ejemplo04;

import java.util.Iterator;
import java.util.List;

public class Secretaria {
	
	private List <Alumno> listaAlumno;

	public Secretaria(List<Alumno> listaAlumno) {
		super();
		this.listaAlumno = listaAlumno;
	}

	public List<Alumno> getListaAlumno() {
		return listaAlumno;
	}

	public void setListaAlumnos(List<Alumno> listaAlumno) {
		this.listaAlumno = listaAlumno;
	}

	
	public String toString() {
		return "Secretaria [listaAlumno=" + listaAlumno + "]";
	}
	
	public void agregarAlumno (Alumno alum) {
		listaAlumno.add(alum);
	}
	
	public boolean agregarAlumno2 (Alumno al) {
		return listaAlumno.add(al);
	}
	
	public int buscarAlum(String dni) {
		int temp = -1;
		boolean salir = false;

		for (int i = 0; i < listaAlumno.size() && !salir; i++) {
			if (listaAlumno.get(i).getDni().equalsIgnoreCase(dni)) {
				temp = i;
				salir = true;
			}
		}
		return temp;
	}
	
	public Alumno buscarAlum2 (String dni) { //preguntar cómo se hace o hacerlo en casa
		Alumno temp = null;
		boolean salir = false;

		for (int i = 0; i < listaAlumno.size() && !salir; i++) {
			if (listaAlumno.get(i).getDni().equalsIgnoreCase(dni)) {
				temp = listaAlumno.get(i);
				salir = true;
			}
		}
		return temp;
		
	}
	
	public void modificarAlumno(String dni, String nombreNuevo) {
		
		int index = buscarAlum(dni);

		if (index >= 0) {
					
			listaAlumno.get(index).setNombre(nombreNuevo);
		}
	}
	
	public void imprimirLista() {
		for (Alumno alumno : listaAlumno) {
			System.out.println(alumno);
		}
	}
	
	public void borrarAlumno(String dni) {
		int index = buscarAlum(dni);

		if (index >= 0) {
			listaAlumno.remove(index);
		}
	}
	
	public void mostrarErrorAgregar (boolean b) {
		if (b){
			System.out.println("Se ha agregado el alumno correctamente");
		}else {
			System.out.println("Error al insertar");
		}
		
				
	}
	
	public void mostrarTodos () {
		
		Iterator <Alumno> it = listaAlumno.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
