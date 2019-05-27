package org.protor.sandbox.eduardo;

import java.io.File;

public abstract class AbstractMarineVehicle extends AbstractVehicle {

	public AbstractMarineVehicle(EnumEngineType engineType) {
		super(engineType);
		
	}

	public AbstractMarineVehicle(String name, EnumEngineType engineType) {
		super(name, engineType);
		
	}

	public AbstractMarineVehicle(File configFile) {
		super(configFile);
		// TODO Auto-generated constructor stub
	}

	public AbstractMarineVehicle(String name, EnumEngineType engineType, double range, double endurance,
			int numMaxPassengers, double maxPayload) {
		super(name, engineType, range, endurance, numMaxPassengers, maxPayload);
		// TODO Auto-generated constructor stub
	}

}
