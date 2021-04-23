package ejercicio02;

public class Documento {
	
	private String nombreEmpresa;
	private String direccion;
	
	
	public Documento(String nombreEmpresa, String direccion) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.direccion = direccion;
	}


	public String getNombreEmpresa() {
		return nombreEmpresa;
	}


	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	@Override
	public String toString() {
		return "Documento [nombreEmpresa=" + nombreEmpresa + ", direccion=" + direccion + "]";
	}
	
	public void imprimirContenido() {

		System.out.println("\n\t \t \t" + nombreEmpresa);
		System.out.println("\t \t \t" + direccion);
	}
}
