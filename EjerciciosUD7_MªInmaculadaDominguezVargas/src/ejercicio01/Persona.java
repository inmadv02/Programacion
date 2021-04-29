package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private int edad;
	private String dni;
	
	
	public Persona() {
		super();
	}

	public Persona(String nombre, String apellidos, int edad, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", dni=" + dni + "]";
	}
	
	public void LeerDatosPersonales() {
		Scanner sc = new Scanner( System.in );
		String aux;
		boolean bucle;
		
		try {
			System.out.println("Introduzca su nombre.");
			this.nombre = sc.nextLine();
			System.out.println("Introduzca sus apellidos.");
			this.apellidos = sc.nextLine();
			System.out.println("Introduzca su edad.");
			aux = sc.nextLine ();
			this.edad = Integer.parseInt(aux);
			System.out.println("Introduzca su DNI.");
			this.dni = sc.nextLine();
			bucle = false;
		}
		catch (NumberFormatException numberFormatException) {
			
		 System.err.printf( "\nException: %s\n", numberFormatException );
		 sc.nextLine();
		 System.out.println("Debe introducir números enteros. Inténtelo de nuevo.\n" );
		 
		}
		
		finally {
			System.out.println("Cambios guardados");
		}
	}
	

}
