package ejemplo01;

public class Animal implements IDepredador, ICuidador{

	private String nombre;
	private int tipoAlimentario; //0 when they eat meat. Otherwise, 1 
	

	public Animal(String nombre, int tipoAlimentario) {
		super();
		this.nombre = nombre;
		this.tipoAlimentario = tipoAlimentario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTipoAlimentario() {
		return tipoAlimentario;
	}

	public void setTipoAlimentario(int tipoAlimentario) {
		this.tipoAlimentario = tipoAlimentario;
	}


	public void localizar(Animal presa) {
		// TODO Auto-generated method stub
		System.out.println("Localizandooo~~");
		
	}

	public void cazar(Animal presa) {
		// TODO Auto-generated method stub~
		System.out.println("¡¡Al ataquerrrr!!");
		System.out.println("A por la: " +presa.nombre);
		
	}

	@Override
	public void cuidar() {
		// TODO Auto-generated method stub
		System.out.println("Cuidando");
		
	}
	
	

}
