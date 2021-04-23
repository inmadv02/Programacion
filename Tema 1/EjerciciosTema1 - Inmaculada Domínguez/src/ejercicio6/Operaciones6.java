package ejercicio6;

public class Operaciones6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 euro equivale a 1,16 dólares americanos, y un dolar equivale a 0,86 euros.
		
		double euros = 2.5;
		double dolar = 1.16, dolar2 = 0.86;
		double cambio; 
		
		
		System.out.println("Bienvenido a nuestro convertor de divisas.\nEsperamos que nuestro programa"
				+ " le sea de ayuda.");
		
		cambio = euros*dolar;
		
		System.out.println("Dos euros con cincuenta son: " + cambio + "$");
		
		

	}

}
