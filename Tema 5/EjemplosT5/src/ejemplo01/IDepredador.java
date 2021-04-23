package ejemplo01;

public interface IDepredador {
	
	//no se pone public porque todos son public. Lo mismo con lo de que no ponga abstract
	 
	void localizar(Animal presa);
	void cazar(Animal presa);

}
