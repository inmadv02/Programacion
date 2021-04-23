package ejercicio;

public class Concesionario {
	
	private String direccion;

	public Concesionario(String direccion) {
		super();
		this.direccion = direccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Concesionario [direccion=" + direccion + "]";
	}
	
	public double calcularAlquilerUnVehiculo (Vehiculo v, double cantidadFija, double descuento, double cantidadPatinete) {
		return v.calcularPrecio(cantidadFija, descuento, cantidadPatinete);
	}
	
	public void mostrarListado (Vehiculo [] listado) {
		
		System.out.println("\t \t \t C A T Á L O G O");
		
		for (int i = 0; i < listado.length; i++) {
			System.out.println(listado[i]);
			if (listado[i] instanceof Patinete) {	
				((Patinete)listado[i]).avisarPatinete();
			}
		}
	}
	
	public double calcularRecaudadoPatinetes(Vehiculo [] listado,  double cantidadFija, double descuento, double cantidadPatinete) {
		double totalRecaudado = 0.0;
		for (int i = 0; i < listado.length; i++) {
			if (listado[i] instanceof Patinete) {	
				totalRecaudado += ((Patinete)listado[i]).calcularPrecio(cantidadFija, descuento, cantidadPatinete);
			}
		}
		return totalRecaudado;
	}
	
	public double calcularAlquilerVehiculoElegido (Vehiculo [] listado, int op, double cantidadFija, 
									double descuento, double cantidadPatinete) {
		int uno = 1;
					
		if (listado[op - uno] instanceof Batmovil) {
				return ((Batmovil)listado[op - uno]).calcularPrecio(cantidadFija, descuento, cantidadPatinete);
				
			} else if (listado[op - uno] instanceof Patinete){
				return ((Patinete)listado[op - uno]).calcularPrecio(cantidadFija, descuento, cantidadPatinete);
			
			} else {
				
				return calcularAlquilerUnVehiculo(listado[op - uno], cantidadFija, descuento, cantidadPatinete);
				
			}
		
		
	}
	

}
