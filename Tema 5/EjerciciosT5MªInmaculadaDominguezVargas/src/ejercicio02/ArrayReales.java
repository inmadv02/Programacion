package ejercicio02;

public class ArrayReales implements Estadisticas{
	
	private double [] num;

	public ArrayReales(double[] num) {
		super();
		this.num = num;
	}

	public double[] getNum() {
		return num;
	}

	public void setNum(double[] num) {
		this.num = num;
	}
	
	public void rellenarArray () {
		double hasta = 100.0, desde = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = Math.random() * (hasta-desde)+desde;
			System.out.println(num[i]);
		}
	}

	@Override
	public double calcularMinimo() {
		double num_pequenio = num[0];
		for (int i = 0; i < num.length; i++) {
			
			if (num[i] < num_pequenio) {
				num_pequenio = num[i];
				
			}
		}
		return num_pequenio;
		
		
	}

	@Override
	public double calcularMaximo() {
		
		double mayor = num [0]; 
		for (int i = 0; i < num.length; i++) 
		
			if(num[i] > mayor) {
				mayor = num[i];
				
			}
		return mayor;
		
	}

	@Override
	public double calcularSumatorio() {
		double resultado = 0.0;
		
		for (int i = 0; i < num.length; i++) {
			resultado += num[i];
		}
		return resultado;
	}
	
	

}
