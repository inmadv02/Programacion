package ejercicio03;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double porcentajeCilindrada = 25;
		double porcentajePotencia = 60;
		double plusFurgoneta = 200;
		double cantidadFija = 340.0;
		
		Vehiculo v1 = new Vehiculo (145.0, 500.0, "Diésel");
		Coche c1 = new Coche (134.0, 460.0, "Gasolina", "Rojo");
		Moto m1 = new Moto (79.0, 278.0, "Gasolina", "Ducati");
		Furgo f1 = new Furgo (150.0, 300.0, "Gasolina", 500.0);
		
		
		System.out.printf("El impuesto que debe pagar por el vehículo es: %.2f euros", 
				v1.calcularImpuestoCirculacion(cantidadFija, porcentajeCilindrada));
		
		System.out.printf("\nEl impuesto que debe pagar por el coche es: %.2f euros", 
				c1.calcularImpuestoCirculacion(cantidadFija, porcentajeCilindrada));
		
		System.out.printf("\nEl impuesto que debe pagar por la moto es: %.2f euros", 
				m1.calcularImpuestoCirculacion(cantidadFija, porcentajePotencia));
		
		System.out.printf("\nEl impuesto que debe pagar por la furgoneta es: %.2f euros", 
				f1.calcularImpuestoCirculacion(cantidadFija, plusFurgoneta));
		
		
		

	}

}
