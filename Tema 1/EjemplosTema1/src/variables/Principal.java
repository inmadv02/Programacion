package variables;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Las variables siempre se declaran al principio del programa, en las
		// primeras l�neas
		/* As� tambi�n pueden poner comentarios*/
		
		// El nombre de las variables siempre ser� en min�scula, sin tilde; 
		//y si son dos palabras, van juntas y la segunda empieza por may�scula.
		
		//Cuando me encuentro una l�nea con un igual, empiezo a leer la l�nea del igual a la derecha
		
		// Si las variables son del mismo tipo (edad1, edad2, edad3) lo podemos poner en la misma l�nea
		//separados por coma
		
		double precio = 1.00;
		int cantidad = 3;
		double total =0.0; 
		
		System.out.println("Bienvenido a nuestro programa.\nAqu� te ayudaremos a calcular "
				+ "el precio de los productos que compras ");
		
		total = precio/cantidad; 
		
		System.out.printf("La cantidad a pagar es: % .2f euros", total);
		
		//	Para los n�meros con muchos decimales o n�meros peri�dicos en vez de println. printf y ponemos
		// %. el n�mero de los decimales que quiero, seguido de una f y la cantidad. Cerramos comillas, ponemos
		// una coma y luego el nombre de la variable.
		
		//printf("La cantidad a pagar es: % .2f euros", total)
		//printf("La cantidad a pagar es: % .2f euros y en %2f en libras" , total, libras)
		//para imprimir una variable de los enteros %d
		//char --> &s
		
	}

}
