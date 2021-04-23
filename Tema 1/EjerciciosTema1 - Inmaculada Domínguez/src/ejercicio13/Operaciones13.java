package ejercicio13;

public class Operaciones13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Calcula la intensidad (I) que circulará por un circuito electrónico con una resistencia eléctrica
		(R) de 20 KΩ al que se le aplica una tensión (V) de 250 voltios. La fórmula es I=V/R. Da el
		resultado con dos decimales. (K=103, busca la forma de escribir K sin necesidad de escribir
		1000)*/
		
		double r = 20.0;
		double v = 250.0;
		int base = 10;
		double k;
		double i;
		
		System.out.println("¡Hola! Bienvenido a nuestro programa. Aquí podrá calcular la intensidad que"
				+ "\nque circula por los circuitos electrónicos siempre que quiera.\n");
		
		k = Math.pow(base, 3);
		
		i = v/(r*k);
		
		System.out.println("La intensidad que circulará por ese circuito electrónico sera de: " +i);
		
		
		
		
		

	}

}
