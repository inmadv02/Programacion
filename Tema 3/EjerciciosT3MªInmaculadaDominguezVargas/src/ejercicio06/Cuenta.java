package ejercicio06;

public class Cuenta {
	
	double saldo;
	String nombre;
	
	public Cuenta (String nombre, double saldo) {
		this.saldo = saldo;
	}
	
	public void ingresar (double añadir) {
		
		saldo = saldo + añadir;
	}
		
	public void retirar (double quitar){
	  
	    saldo = saldo - quitar;
	
	}
	public double cambiar (double equivalencia) {
		saldo = saldo * equivalencia;
		
		return saldo;
	}

}
