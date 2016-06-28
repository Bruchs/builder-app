/**
 * 
 */
package cl.curso.java.ejemplo.builder1.builder;

import java.util.ArrayList;

/**
 * @author matia
 *
 */
public class BuilderAutoTesla extends BuilderAuto{

	@Override
	public Auto construir() {
		Auto nuevoTesla = new Auto();
		Motor nuevoMotorTesla = new Motor(1250);
		ArrayList<Rueda> ruedasTesla = new ArrayList<Rueda>(100);
		GPS gpsTesla = new GPS("Windows 95", "1.5");
		
		nuevoTesla.setModelo("Tesla 2014");
		nuevoTesla.setMarca("Tesla");
		nuevoTesla.setMotor(nuevoMotorTesla);
		nuevoTesla.setRuedas(ruedasTesla);
		nuevoTesla.setGps(gpsTesla);
		return nuevoTesla;
	}

}
