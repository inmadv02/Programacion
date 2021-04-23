package ejemplo02;

public class Triangulo {
	
	private double base;
	private double altura;
	private String tipo;
	
	public Triangulo (double base, double altura, String tipo) {
		this.base = base;
		this.altura = altura;
		this.tipo = tipo;	
		
	}

	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double calcularArea () {
		double denominador = 2;
		return (base*altura)/denominador;
		
	}
	
	public double calcularArea(double cantidad) {
		double den = 2;
		return ((base*altura)/den)-cantidad;
	}
	
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", tipo=" + tipo + "]";
	}
	
	
	
	
	
	
	/*public void setBase (double baseN) {
		this.base = baseN
	}*/

}
