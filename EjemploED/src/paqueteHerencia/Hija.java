/**
 * 
 */
package paqueteHerencia;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author dominguez.vamar21
 *
 */
public class Hija extends Base {

	public int tercerMetodo(int tope) {
		return ThreadLocalRandom.current().nextInt(1, tope+1);
	}
}
