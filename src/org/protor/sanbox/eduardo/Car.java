package org.protor.sanbox.eduardo;

import java.io.File;

public class Car extends AbstractTerrestrialVehicle {

	public Car(EnumEngineType engineType) {
		super(engineType);
		// TODO Auto-generated constructor stub
	}

	public Car(File configFile) {
		super(configFile);
		// TODO Auto-generated constructor stub
	}

	public Car(String name, EnumEngineType engineType, double range, double endurance, int numMaxPassengers,
			double maxPayload, EnumGroundContactType groundContactType) {
		super(name, engineType, range, endurance, numMaxPassengers, maxPayload, groundContactType);
		// TODO Auto-generated constructor stub
	}

	public Car(String name, EnumEngineType engineType, double range, double endurance, int numMaxPassengers,
			double maxPayload) {
		super(name, engineType, range, endurance, numMaxPassengers, maxPayload);
		// TODO Auto-generated constructor stub
	}

	public Car(String name, EnumEngineType engineType) {
		super(name, engineType);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean loadFromFile(File configFile) {
		// TODO Auto-generated method stub
		System.out.println(" [Car] Reading data from file:" + configFile.getAbsolutePath());
		return false;
	}

}
