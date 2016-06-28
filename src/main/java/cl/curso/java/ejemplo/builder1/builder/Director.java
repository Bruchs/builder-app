/**
 * 
 */
package cl.curso.java.ejemplo.builder1.builder;

/**
 * @author matiasF
 *
 */
public class Director {

	private BuilderAuto builderAuto;
	
	public Director() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param builderAuto
	 */
	public Director(BuilderAuto builderAuto) {
		super();
		this.builderAuto = builderAuto;
	}

	/**
	 * @return the builderAuto
	 */
	public BuilderAuto getBuilderAuto() {
		return builderAuto;
	}

	/**
	 * @param builderAuto the builderAuto to set
	 */
	public void setBuilderAuto(BuilderAuto builderAuto) {
		this.builderAuto = builderAuto;
	}
	
	public Auto construirAuto(){
		return builderAuto.construir();
	}
}
