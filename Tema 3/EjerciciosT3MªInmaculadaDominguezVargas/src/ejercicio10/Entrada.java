package ejercicio10;

public class Entrada {
	
	private int num_entrada;
	private double precio;
	private boolean libre;
	private int num_fila;
	private int num_butaca;
	
	public Entrada (int num_entrada, double precio, boolean libre, int num_fila, int num_butaca) {
		
	}
	
	public Entrada () {
		
	}
	
	public Entrada (int num_entrada, double precio, boolean libre) {
		this.num_entrada = num_entrada;
		this.precio = precio;
		this.libre = libre;
	}

	public int getNum_entrada() {
		return num_entrada;
	}

	public void setNum_entrada(int num_entrada) {
		this.num_entrada = num_entrada;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isLibre() {
		return libre;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}

	public int getNum_fila() {
		return num_fila;
	}

	public void setNum_fila(int num_fila) {
		this.num_fila = num_fila;
	}

	public int getNum_butaca() {
		return num_butaca;
	}

	public void setNum_butaca(int num_butaca) {
		this.num_butaca = num_butaca;
	}

	
	public String toString() {
		return "Entrada [num_entrada=" + num_entrada + ", precio=" + precio + ", libre=" + libre + ", num_fila="
				+ num_fila + ", num_butaca=" + num_butaca + "]";
	}
	
	
	

}
