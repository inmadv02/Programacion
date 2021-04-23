package ejemplo4;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuadrado c = new Cuadrado("Cuadrado", "Verde", 7.8);
		Circulo ci = new Circulo ("Círculo", "Rojo", 5.5);
		
		System.out.println(c);
		System.out.println(ci);
		System.out.println("Área cuadrado: " + c.calcularArea());
		System.out.println("Perímetro círculo: " + ci.calcularPerimetro());
		
		c.mostrarLados();
		
		//Polimorfismo 
		
		Figura f1 = new Cuadrado ("Segundo cuadrado", "Azul", 2.0);
		Figura f2 = new Circulo ("Segundo círculo", "Rosa", 4.8);
		
		System.out.println("Área cuadrado: " + f1.calcularArea());
		System.out.println("Perímetro círculo: " + f2.calcularPerimetro());
		
		
	}

}
