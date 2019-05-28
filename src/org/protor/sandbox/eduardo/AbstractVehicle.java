package org.protor.sandbox.eduardo;

import java.io.File;

import org.w3c.dom.Node;

public abstract class AbstractVehicle {
	
	protected String name = "";
	protected EnumEngineType engineType = EnumEngineType.NONE;
	protected double range = 0.0; //km
	protected double endurance = 0.0; //hours
	protected int numMaxPassengers = 0;
	protected double maxPayload = 0.0; //kg
	
	protected File configFile;
	protected Node node;
	
	// Costruttori
	public AbstractVehicle(File configFile) {
		this.configFile = configFile;
		this.loadFromFile(configFile);
	}
	protected abstract void loadFromFile(File configFile);
	
	public AbstractVehicle(Node node) {
		this.node = node;
		this.loadFromNode(this.node);
	}
	protected abstract void loadFromNode(Node node);
	
	
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
