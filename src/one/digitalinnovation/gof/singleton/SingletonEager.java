package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado".
 * 
 * @author alan
 */
public class SingletonEager {

	private static final SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
