package ejercicio01;

import java.util.List;

public class Nota {
	
	private String titulo;
	private String texto;
	
	public Nota(String titulo, String texto) {
		super();
		this.titulo = titulo;
		this.texto = texto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Nota [titulo=" + titulo + ", texto=" + texto + "]";
	}
	
	public void mostrarNotas (List <Nota> lista) {
		int contador = 0;
		for(Nota n : lista) {
			contador++;
			System.out.print(contador + " ");
			System.out.println(n);
		}
	}
	
	public void aniadirNotas (List <Nota> lista, Nota n) {
		lista.add(n);
	
	}
	
	public void borrarNota (List <Nota> lista, int index) {
		int uno = 1;
		lista.remove(index-uno);
		System.out.println("Nota borrada con éxito.");
		mostrarNotas(lista);
	}
	
	public void mostrarNota (List <Nota> lista, int index) {
		int uno = 1;
		System.out.println(lista.get(index-uno));
	}

}
