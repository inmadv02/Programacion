package ejemplo2;

public abstract class Figura {
	
	private int x;
	private int y;
	
	
	public Figura(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	public abstract double calcularArea();
	
	public abstract double calcularPerimetro();

	@Override
	public String toString() {
		return "Figura [x=" + x + ", y=" + y + "]";
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}

}
