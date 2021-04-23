package ejemplo02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mayoriaEdad = 18, edad =13;
		
		System.out.println("¡Hola! ¿Cuántos años tiene?");
		edad = Leer.datoInt();
		
		if (edad>=edad)
		{ 
			System.out.println("Eres mayor de edad, puedes entrar");
		}
		
		else
		{
			System.out.println("No puedes pasar.");
		}
		
		System.out.println("Adiós");
		}
			
	}

