package org.protor.sandbox.eduardo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.protor.filesio.utils.XMLUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class VehicleUtils {

	public static List<Car> loadListOfCars(File xmlFile) {

		/*verifica che il file xml esiste
		//cerca //cars/car nodi --> nodelist
		 * crea una lista vuota List<Car>
		 * crea un ciclo per i nodi
		 * costruisci un oggetto di tipo car dai nodi
		 * aggiungi l'oggetto ad una lista
		 * return lista
		 * 
		 * 
		 */

		List<Car> cars = new ArrayList<>();

		if (!xmlFile.exists()) {
			System.err.println("File " + xmlFile.getAbsolutePath() + " not found.");
			return cars;
		}
		System.out.println("Found file: " + xmlFile.getAbsolutePath());
		System.out.println("---- Now reading XML content ...");

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;		

		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);

			System.out.println("File XML parsed.");

			doc.getDocumentElement().normalize();

			NodeList nodeList = doc.getElementsByTagName("car");


			for (int iNode = 0; iNode < nodeList.getLength(); iNode++) {
				Node node = nodeList.item(iNode);
				
				Car car = new Car(node);
				System.out.println(car);
				cars.add(car);

			}


		} catch (ParserConfigurationException e) {
			return cars;
			
		} catch (SAXException e) {
			return cars;

		} catch (IOException e) {
			return cars;
		}

		return cars;

	}
}
