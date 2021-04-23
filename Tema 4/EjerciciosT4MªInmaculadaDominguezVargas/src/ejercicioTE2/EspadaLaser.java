package ejercicioTE2;

public class EspadaLaser extends Producto{
	
	private String tipo;

	public EspadaLaser(double precioBase, int cantidadUnidades, String nombre, boolean activo, String tipo) {
		super(precioBase, cantidadUnidades, nombre, activo);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "EspadaLaser [tipo=" + tipo + "]";
	}
	
	public double calcularPVP (double porcentaje, double cantidadFija) {
		setActivo(false);
		String nombre = "doble";
		if(tipo.equals(nombre)) {
			return getPrecioBase() + + (getPrecioBase() * porcentaje/100) + cantidadFija;
		}else {
			return getPrecioBase() + + (getPrecioBase() * porcentaje/100);
		}
	}

}
