package ejercicio17;

public class Ascensor {
	
	private int contador;
	private double pesoMax;
	private String puertas;
	
	public Ascensor () {
		
	}
	
	public int getContador() {
		return contador;
	}



	public void setContador(int plantaActual) {
		this.contador = plantaActual;
	}



	public double getPesoMax() {
		return pesoMax;
	}


	public void setPesoMax(double pesoMax) {
		this.pesoMax = pesoMax;
	}



	public void comprarSubidayBajada (int plantaN) {
		if (contador > plantaN) {
			System.out.println("🡫");
			System.out.println("Está bajando.");
		}
		else {
			System.out.println("🡩");
			System.out.println("Está subiendo.");
		}
		
	}
	
	public void comprobarPeso (int numPersonas) {
		double pesoMedio = 70;
		this.pesoMax = 350;
		double pesoT;
		
		pesoT = pesoMedio * numPersonas;
		
		if (pesoT > pesoMax) {
			System.out.println("Se supera el peso máximo que soporta el ascensor.");
			System.out.println("Algunas personas deben bajarse.");
		}
		
	}

}
