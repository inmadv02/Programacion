package ejemploLambda;

import java.util.function.Function;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		VehiculoConRuedas triciclo = new VehiculoConRuedas("Fisher-Price", "Multicolor") {
			//La clase anónima empieza a partir del anterior corchete. 
			@Override
			public String getColor() {
				
				return "Rosa";
			
			}
		};
		
		//(n) -> (n%2) == 0;
		
		Function <String, Integer> funcion = s -> s.length();
		
		System.out.println(funcion.apply("Hola"));
		
		
	}
	

		
	public boolean comprobarPar (double n) {
		
		if(n%2 == 0) {
			return true;
		}
		else {
			return false;
		}
			
	}
	
	

	

}
