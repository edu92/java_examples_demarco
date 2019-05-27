package org.protor.sandbox.eduardo;

import java.io.File;

public abstract class AbstractVehicle {
	
	private String name = "";
	private EnumEngineType engineType = EnumEngineType.NONE;
	private double range = 0.0; //km
	private double endurance = 0.0; //hours
	private int numMaxPassengers = 0;
	private double maxPayload = 0.0; //kg
	
	private File configFile;
	
	public AbstractVehicle(File configFile) {
		this.configFile = configFile;
		this.loadFromFile(configFile);
	}
	protected abstract boolean loadFromFile(File configFile);
	
	public AbstractVehicle(EnumEngineType engineType) {
		this.engineType = engineType;
	}
	public AbstractVehicle(String name, EnumEngineType engineType) {
		this.name = name;
		this.engineType = engineType;
	}

	/**
	 * 
	 * @param name Name of Vehicle
	 * @param engineType 
	 * @param range
	 * @param endurance
	 * @param numMaxPassengers
	 * @param maxPayload
	 */
	
	public AbstractVehicle(String name, EnumEngineType engineType, double range, double endurance, int numMaxPassengers,
			double maxPayload) {
		super();
		this.name = name;
		this.engineType = engineType;
		this.range = range;
		this.endurance = endurance;
		this.numMaxPassengers = numMaxPassengers;
		this.maxPayload = maxPayload;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public EnumEngineType getType() {
		return engineType;
	}
	public void setType(EnumEngineType engineType) {
		this.engineType = engineType;
	}
	public EnumEngineType getEngineType() {
		return engineType;
	}
	public void setEngineType(EnumEngineType engineType) {
		this.engineType = engineType;
	}


}
