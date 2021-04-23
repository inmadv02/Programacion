package ejercicio02;

public class Carta extends Documento{

	private String fecha;

	public Carta(String nombreEmpresa, String direccion, String fecha) {
		super(nombreEmpresa, direccion);
		this.fecha = fecha;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Carta [fecha=" + fecha + "]";
	}
	
	public void imprimirContenido() {
		super.imprimirContenido();
		System.out.println("\t \t \tFecha: " + fecha);
	}
	
	
}
