package org.protor.sandbox.eduardo.test;

import java.io.File;
import java.util.List;

import org.protor.sandbox.eduardo.Car;
import org.protor.sandbox.eduardo.VehicleUtils;

public class Test05 {

	public static void main(String[] args) {


		// "C:\Users\PC10\github\java_examples_demarco\input"
		//String fileName = "cars.xml";
		//File carsFile = new File("input" + File.separator + fileName);
		if (args.length !=0) {
			String filePath = args[0];
			File carsFile = new File(filePath);
			List<Car> cars = VehicleUtils.loadListOfCars(carsFile);
			
			if (cars.isEmpty()) {
				System.out.println("No cars were found");
			}
			else System.out.println("Found " + cars.size() + " cars.");
		} else {
			System.out.println("This program must be used with arguments! \nTerminating.");
			System.exit(1);
		}
		
		
	}
}