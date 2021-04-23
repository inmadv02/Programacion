package ejercicio11;

public class Operaciones11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Escribir un programa que sirva para calcular el precio final de un producto. El cliente 
		 * se lleva 4 unidades del producto por lo que se le aplica un descuento del 20 % al precio
		 * total.*/
		
		int unidades = 4;
		double precio = 2.35;
		double oferta = 20.0;
		double denominador = 100;
		double precioTotal;
		double descuento;
		double precioFinal;
		
		System.out.println("¡Hola! Bienvenido a nuestro programa. Aquí le ayudaremos a calcular el"
				+ "\nel precio final que aparecerá en su ticket de la compra antes de llegar a caja.\n");
		
		precioTotal = unidades*precio;
		descuento = (precioTotal*oferta)/denominador;
		precioFinal = precioTotal-descuento;
		
		System.out.println("El precio total de los cuatro artículos es de: " +precioTotal + " euros");
		System.out.println("La cantidad que se descuenta es de: " + descuento + " euros" );
		System.out.printf("El precio final a pagar es: % .2f euros", precioFinal, "euros");

		
	}

}
