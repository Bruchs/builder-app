/**
 * 
 */
package cl.curso.java.ejemplo.builder1.builder;

import java.util.ArrayList;

/**
 * @author matiasF
 *
 */
public class Auto {

	private String marca;
	private String modelo;
	private ArrayList<Rueda> ruedas;
	private GPS gps;
	private Motor motor;
	
	public Auto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param marca
	 * @param modelo
	 * @param ruedas
	 * @param gps
	 */
	public Auto(String marca, String modelo, ArrayList<Rueda> ruedas, GPS gps, Motor motor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ruedas = ruedas;
		this.gps = gps;
		this.motor = motor;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the ruedas
	 */
	public ArrayList<Rueda> getRuedas() {
		return ruedas;
	}

	/**
	 * @param ruedas the ruedas to set
	 */
	public void setRuedas(ArrayList<Rueda> ruedas) {
		this.ruedas = ruedas;
	}

	/**
	 * @return the gps
	 */
	public GPS getGps() {
		return gps;
	}

	/**
	 * @param gps the gps to set
	 */
	public void setGps(GPS gps) {
		this.gps = gps;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
}
