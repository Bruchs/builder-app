/**
 * 
 */
package cl.curso.java.ejemplo.builder1.builder;

import java.util.ArrayList;

/**
 * @author matia
 *
 */
public class BuilderAutoToyota extends BuilderAuto {

	@Override
	public Auto construir() {
		Auto nuevoToyota = new Auto();
		Motor nuevoMotorToyota = new Motor(1000);
		ArrayList<Rueda> ruedasToyota = new ArrayList<Rueda>(80);
		GPS gpsToyota = new GPS("Windows 95", "1.5");
		
		nuevoToyota.setModelo("Yaris 2016");
		nuevoToyota.setMarca("Toyota");
		nuevoToyota.setMotor(nuevoMotorToyota);
		nuevoToyota.setRuedas(ruedasToyota);
		nuevoToyota.setGps(gpsToyota);
		return nuevoToyota;
	}

}
