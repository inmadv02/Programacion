package ejercicio10;

public class Sala {
	
	private int id_sala;
	private int total_localidades;
	private Entrada e = new Entrada ();
	
	public Sala (int id_sala, int total_localidades, Entrada e) {
		this.id_sala = id_sala;
		this.total_localidades = total_localidades;
		this.e = e;
		
	}
	
	public Sala () {
		
	}
	
	public int getId_sala() {
		return id_sala;
	}

	public void setId_sala(int id_sala) {
		this.id_sala = id_sala;
	}


	public int getTotal_localidades() {
		return total_localidades;
	}

	public void setTotal_localidades(int total_localidades) {
		this.total_localidades = total_localidades;
	}


	public Entrada getE() {
		return e;
	}


	public void setE(Entrada e) {
		this.e = e;
	}

	public double comprarEntradas (int cant_ent, double precio, int num_fila, int num_butaca){
		e.setLibre(false);
		e.setNum_butaca(num_butaca);
		e.setNum_fila(num_fila);
		double precioFinal;
		precioFinal = cant_ent*precio;
		
		return precioFinal;
		
	}
	
	public int contador (int cant_ent) {
		int cant_total  = 0;
		return cant_total = cant_total + cant_ent;
	}
	
	public void cambiarPrecio (double precio) {
		e.setPrecio(precio);
	}
	
	public double calcularGananciasDiarias (int cant_total) {
		double total_ganancias;
		total_ganancias = e.getPrecio()*cant_total;
		return total_ganancias;
	}
	
	public double calcularPalomitas (int cant_palomitas, double precio_palomitas) {
		double total_palomitas;
		return total_palomitas = cant_palomitas * precio_palomitas;
	}
	
	public double calcularRefrescos (int cant_refrescos, double precio_refrescos) {
		double total_refrescos;
		return total_refrescos = cant_refrescos * precio_refrescos;
	}
	
	public double calcularPerritos (int cant_perritos, double precio_perritos) {
		double total_perritos;
		return total_perritos = cant_perritos * precio_perritos;
	}
	
	public double calcularPatatas (int cant_patatas, double precio_patatas) {
		double total_patatas;
		return total_patatas = cant_patatas * precio_patatas;
	}
	
}
