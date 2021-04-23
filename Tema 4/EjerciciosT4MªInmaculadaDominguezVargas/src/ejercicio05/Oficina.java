package ejercicio05;

import java.util.Arrays;

public class Oficina {
	
	private Empleado [] listado;
	
	
	public Oficina(Empleado[] listado) {
		super();
		this.listado = listado;
	}
	
	public Empleado[] getListado() {
		return listado;
	}

	public void setListado(Empleado[] listado) {
		this.listado = listado;
	}
	
	@Override
	public String toString() {
		return "Oficina [listado=" + Arrays.toString(listado) + "]";
	}

	public double calcularSueldo (Empleado e1, double porcentaje, int ventasRealizadas) {
		return e1.calcularSueldo(porcentaje, ventasRealizadas);
		
	}
	
	public double calcularGastos (Empleado [] listado, double porcentaje, int ventasRealizadas) {
		
		double gastos = 0.0;
		
		for (int i = 0; i < listado.length; i++) {
			gastos = gastos + listado[i].calcularSueldo(porcentaje, ventasRealizadas);
			//gastos = gastos + calcularSueldo(listado[i]);
		}
		return gastos;
	}
	
	

}
