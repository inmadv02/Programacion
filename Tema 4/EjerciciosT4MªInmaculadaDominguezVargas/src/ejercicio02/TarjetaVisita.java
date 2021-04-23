package ejercicio02;

public class TarjetaVisita extends Documento{
	
	private String nombreContacto;
	private String telefono;
	
	
	public TarjetaVisita(String nombreEmpresa, String direccion, String nombreContacto, String telefono) {
		super(nombreEmpresa, direccion);
		this.nombreContacto = nombreContacto;
		this.telefono = telefono;
	}


	public String getNombreContacto() {
		return nombreContacto;
	}


	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	@Override
	public String toString() {
		return "TarjetaVisita [nombreContacto=" + nombreContacto + ", telefono=" + telefono + "]";
	}
	
	public void imprimirContenido() {
		super.imprimirContenido();
		System.out.println("\t \t \t" + nombreContacto);
		System.out.println("\t \t \t" + telefono);
	}
	

}
