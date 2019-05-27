package org.protor.sandbox.eduardo.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test02 {

	public static void main(String[] args) {

		System.out.println(System.getenv("INPUTS_DIR"));
		// "C:\Users\PC10\github\java_examples_demarco\input"
		//String fileName = "cars.xml";
		//File carsFile = new File("input" + File.separator + fileName);
		if (args.length !=0) {
			String filePath = args[0];
			File carsFile = new File(filePath);
			//		
			//		if (!carsFile.exists()) {
			//			System.err.println("File " + carsFile.getAbsolutePath() + " not found. \n Terminating.");
			//			System.exit(1);
			//		} else
			//		
			// read file line-by-line


			try {
				FileReader fileReader = new FileReader(carsFile);
				System.out.println("Found file: " + carsFile.getAbsolutePath());
				System.out.println("---------------------");
				System.out.println("Reading file, line by line...");

				BufferedReader br = new BufferedReader(fileReader);
				String currentLine;
				int counter = 0;

				while ((currentLine = br.readLine()) != null) {
					System.out.println(++counter + ": " + currentLine);
				}
			} 
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				//			e.printStackTrace();
				System.err.println("An I/O problem occurred with file " + carsFile.getAbsolutePath() + "\n Terminating.");
				System.exit(1);
			}
		}
		else {
			System.err.println("You must run this program with arguments. \n Terminating.");
			System.exit(1);
		}
	}
}



