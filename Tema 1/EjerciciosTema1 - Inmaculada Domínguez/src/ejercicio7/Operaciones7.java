package ejercicio7;

public class Operaciones7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double champu = 1.80;
		double oferta = 20;
		double denominador = 100;
		double descuento;
		double precioFinal;
		
		// Escribir línea a línea el programa. No se escriben números directamente en el código./
		
		System.out.println("Hola, bienvenido a nuestro programa.\nAqu� le mostraremos el"
				+ " precio de los productos en oferta que se \nencuentran en su cesta antes de"
				+ " que pase por caja.");
		
		descuento = (champu*oferta)/denominador; 
		precioFinal = champu-descuento;
		
		System.out.println("El descuento aplicado a su champ� es del: " + oferta + " %");
		System.out.println("La cantidad descontada del precio del champ� es: " + descuento + " euros");
		System.out.println("El precio final del champ� es: " + precioFinal + " euros");
		
		
		
	}

}
