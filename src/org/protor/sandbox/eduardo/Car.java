package org.protor.sandbox.eduardo;

import java.io.File;
import java.util.List;

import org.protor.filesio.utils.XMLUtils;
import org.w3c.dom.Node;

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
	public Car(Node node) {
		super(node);
	}


	@Override
	protected void loadFromFile(File configFile) {
		// TODO Auto-generated method stub
		System.out.println(" [Car] Reading data from file:" + configFile.getAbsolutePath());

	}

	@Override
	protected void loadFromNode(Node node) {

		if (node.getNodeType() == Node.ELEMENT_NODE) {
			this.name = XMLUtils.getXMLPropertyByPath(node, "//name/text()");

			List<String> passengersValuesList = XMLUtils.getXMLAttributesByPath(node, "//passengers", "value");

			if (passengersValuesList.size()>0) {
				try {
					this.numMaxPassengers = Integer.parseInt(passengersValuesList.get(0));
				} catch (NumberFormatException e) {
					//e.printStackTrace();
					System.err.println("[Car.loadFromNode]");
					System.err.println("Car \"" + this.name + "\" incorrect passenger number.");
					System.err.println("Keeping default values.");
				}
			} else System.err.println("Default values.");

			List<String> rangeValuesList = XMLUtils.getXMLAttributesByPath(node, "//range_km", "value");

			if (rangeValuesList.size()>0) {
				try {
					this.range = Double.parseDouble(rangeValuesList.get(0));
				} catch (NumberFormatException e) {
					//e.printStackTrace();
					System.err.println("[Car.loadFromNode]");
					System.err.println("Car \"" + this.name + "\" incorrect range_km number.");
					System.err.println("Keeping default values.");
				}
			} else System.err.println("Default values.");

			List<String> enduranceValuesList = XMLUtils.getXMLAttributesByPath(node, "//endurance_hr", "value");

			if (enduranceValuesList.size()>0) {
				try {
					this.endurance = Double.parseDouble(enduranceValuesList.get(0));
				} catch (NumberFormatException e) {
					//e.printStackTrace();
					System.err.println("[Car.loadFromNode]");
					System.err.println("Car \"" + this.name + "\" incorrect endurance number.");
					System.err.println("Keeping default values.");
				}
			} else System.err.println("Default values.");

			List<String> payloadValuesList = XMLUtils.getXMLAttributesByPath(node, "//payload_kg", "value");

			if (payloadValuesList.size()>0) {
				try {
					this.maxPayload = Double.parseDouble(payloadValuesList.get(0));
				} catch (NumberFormatException e) {
					//e.printStackTrace();
					System.err.println("[Car.loadFromNode]");
					System.err.println("Car \"" + this.name + "\" incorrect payload kg.");
					System.err.println("Keeping default values.");
				}
			} else System.err.println("Default values.");

			List<String> engineTypeValuesList = XMLUtils.getXMLAttributesByPath(node, "//engine_type", "value");
			if (engineTypeValuesList.size()>0) {
				String engineTypeString = engineTypeValuesList.get(0).toUpperCase();

				switch(engineTypeString) {
				case "THERMICAL" : engineType = EnumEngineType.THERMICAL;
				break;
				case "HYBRID" : engineType = EnumEngineType.HYBRID;
				break;
				case "ELECTRIC" : engineType = EnumEngineType.ELECTRIC;
				break;
				case "NONE" : engineType = EnumEngineType.NONE;
				break;
				}
			} else System.err.println("Default values.");

		} else {
			System.err.println("Node is not ELEMENT_NODE.");
			System.err.println("Keeping default values.");
		}
	}



}
