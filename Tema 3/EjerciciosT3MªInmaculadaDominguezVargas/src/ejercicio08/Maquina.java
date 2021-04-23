package ejercicio08;

public class Maquina {
	
	int ticket;
	
	public Maquina () {

	}
	
	public double comprar (int num, double precio) {
		double precioT;
		precioT = num * precio;
		return precioT;
	}
	
	public double devolverCambio (int num, double precio, double dinero) {
		double cambio;
		double gastado;
		gastado  = comprar(num, precio);
		cambio = dinero - gastado;
		return cambio;
	}
	
	public void imprimir (String destino, int num, double precio) {
		double gastado2;
		gastado2 = comprar(num, precio);
		System.out.println("\t  MetroSevilla");
		System.out.println("________________________________");
		System.out.println("\nDestino:\t \t \t" + destino);
		System.out.println("Precio:\t \t \t \t  " + gastado2);
		System.out.println("     Valido para " + num + " personas");
	}
	
	//public double recuento (double precioT) {
		//double total;
		
	public void setNuevoprecio (double nuevoPrecio) {
		System.out.printf("El nuevo precio de los billetes es: %.2f", nuevoPrecio);
	}
}
