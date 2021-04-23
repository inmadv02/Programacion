package ejercicio05;

public class Copiado {
	
	String texto;
	int numero;
	
	public Copiado (String texto, int numero) {
		this.texto = texto;
		this.numero = numero;
	}
	
	public String repetir (String texto, int numero) {
		String repe = "";
		for (int i = 0; i < numero; i++) {
			repe = repe + " " + texto;
		}
		return repe;
	}
}
