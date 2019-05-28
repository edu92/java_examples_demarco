package org.protor.sandbox.eduardo;

import java.io.File;

import org.w3c.dom.Node;

public abstract class AbstractTerrestrialVehicle extends AbstractVehicle {
	
	private EnumGroundContactType groundContactType = EnumGroundContactType.WHEELS;

	public EnumGroundContactType getGroundContactType() {
		return groundContactType;
	}

	public void setGroundContactType(EnumGroundContactType groundContactType) {
		this.groundContactType = groundContactType;
	}

	public AbstractTerrestrialVehicle(EnumEngineType engineType) {
		super(engineType);
		// TODO Auto-generated constructor stub
	}

	public AbstractTerrestrialVehicle(String name, EnumEngineType engineType) {
		super(name, engineType);
		// TODO Auto-generated constructor stub
	}

	public AbstractTerrestrialVehicle(File configFile) {
		super(configFile);
		// TODO Auto-generated constructor stub
	}

	public AbstractTerrestrialVehicle(String name, EnumEngineType engineType, double range, double endurance,
			int numMaxPassengers, double maxPayload) {
		super(name, engineType, range, endurance, numMaxPassengers, maxPayload);
		// TODO Auto-generated constructor stub
	}
	
	public AbstractTerrestrialVehicle(String name, EnumEngineType engineType, double range, double endurance,
			int numMaxPassengers, double maxPayload, EnumGroundContactType groundContactType) {
		super(name, engineType, range, endurance, numMaxPassengers, maxPayload);
		this.groundContactType = groundContactType;
		// TODO Auto-generated constructor stub
	}
	
	public AbstractTerrestrialVehicle(Node node) {
		super(node);
	}
	

}
