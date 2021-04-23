package ejemplo01;

public class Persona {
	
	//Nunca les damos valores iniciales.
	
	String nombre;
	int edad;
	double altura;
	
	//Después de los atributos, vienen los constructores.
	
	public Persona (String nombre, int edad, double altura) { //parámetros
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}
	
	public Persona (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona () {
		
	}
	
	//Getters ands setters
	
	public String getNombre () {
		return nombre;
	}
	
	public void setNombre (String nombre) {
		
		this.nombre = nombre;
	}
	
	//Métodos
	
	public double convertirACm () {
		double cien = 100.00;
		double resultado;
		
		resultado = altura*cien;
		return resultado; //La variable del return debe ser del mismo tipo que la del public.
		
		//Como la altura ya es un atributo de la clase persona, no vamos a darle la altura
	}
	
	public double convertirACm (double altura) {
		double cien = 100.00;
		double resultado = 0.0;
		
		resultado = altura*cien;
		return resultado;
	}


	public String toString() {
		return "Su nombre es: " + nombre + ", Su edad es: " + edad + ", Mide: " + altura + "]";	
	}
	
	public int cumpleanios () {
		edad++;
		return edad;
	}
}
