package ejemplo2;

public abstract class Rectangulo extends Figura {
	

	private double base;
	private double altura;
	
	
	public Rectangulo(int x, int y, double base, double altura) {
		super(x, y);
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


	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}
	
	public double calcularArea() {
		return base*altura;
	}
	
	public double calcularPerimetro() {
		return (base*2)*(altura*2);
	}
	
	
}
