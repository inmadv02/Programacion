package ejemplo01;

public class EjemExcepciones {
	
	public static void main(String[] args) {
	
		int a[ ] = new int[3];
	
		for ( int i = 0; i< a.length; i++){
			a [i] = i;
		}
	
		metodo( a );
	}
	
	static void metodo (int b[ ]) {
	
		b [2] = 1 / b[0];
	}
}