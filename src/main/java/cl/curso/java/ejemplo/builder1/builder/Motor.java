/**
 * 
 */
package cl.curso.java.ejemplo.builder1.builder;

/**
 * @author matia
 *
 */
public class Motor {

	private int caballosFuerza;
	
	public Motor() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param caballosFuerza
	 */
	public Motor(int caballosFuerza) {
		super();
		this.caballosFuerza = caballosFuerza;
	}

	/**
	 * @return the caballosFuerza
	 */
	public int getCaballosFuerza() {
		return caballosFuerza;
	}

	/**
	 * @param caballosFuerza the caballosFuerza to set
	 */
	public void setCaballosFuerza(int caballosFuerza) {
		this.caballosFuerza = caballosFuerza;
	}
	
}
