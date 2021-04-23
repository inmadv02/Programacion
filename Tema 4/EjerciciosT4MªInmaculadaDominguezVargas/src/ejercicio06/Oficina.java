package ejercicio06;

import java.util.Arrays;

public class Oficina {
	
	private Cuenta [] listado;

	public Oficina(Cuenta[] listado) {
		super();
		this.listado = listado;
	}

	public Cuenta[] getListado() {
		return listado;
	}

	public void setListado(Cuenta[] listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Oficina [listado=" + Arrays.toString(listado) + "]";
	}
	
	public double sacarDinero (Cuenta c1, double sacar) {
		return c1.sacarDinero(sacar);
	}
	
	public double ingresarDinero (Cuenta c1, double ingresar) {
		return c1.ingresarDinero(ingresar);
	}
	
	public double calcularDineroTotal () {
		
		double total = 0.0;
		
		for (int i = 0; i < listado.length; i++) {
			total += listado[i].getSaldo();
		}
		return total;
	}
	
	public double calcularGastosDineroEmpresa (double sacar) {
		
		double gastos = 0.0;
		
		for (int i = 0; i < listado.length; i++) {
			
			if (listado[i] instanceof CuentaEmpresa) {
				gastos += sacarDinero(listado[i], sacar);
			}
		}
		return gastos;
	}
	
	public double calcularGastosPuntos () {
		
		double gastosBonus = 0.0;
		
		for (int i = 0; i < listado.length; i++) {
			if (listado[i] instanceof CuentaJoven) {
				gastosBonus += ((CuentaJoven)listado[i]).calcularBonus();
			}
		}
		return gastosBonus;
	
	}
	
}