package ejemplo2;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cuadrado c =  new Cuadrado (2, 3, 5.5);
		
		System.out.println(c.calcularArea());
		
		System.out.println(c.getX());
		
		//No repetir cosas en los métodos. Si necesitamos hacer una cuenta que ya está hecha en un método de una clase
		//madre. Lo llamamos en la clase hija y ya podemos hacer cositas con ese cálculo.
	}

}
