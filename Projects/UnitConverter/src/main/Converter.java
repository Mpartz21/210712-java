package main;

import java.util.Scanner;

public class Converter {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int menuSelection = 0;
		boolean running = true;
		double unitsToConvert = 0.0;
		
		while(running) {
			System.out.println("Please select an option:\n"
					+ "1. Volume Conversions\n"
					+ "2.Distance Conversions\n"
					+ "4. Quit");
					
			
//			 System.out.println("Please select an option:\n"
//					 + "1. Cups to Teaspoons\n"
//					 + "2. Miles to Kilometers\n"
//					 + "3. Us Gallons to Imperial Gallons\n"
//					 + "4. Quit");
			 menuSelection = scanner.nextInt();
			 
			 switch(menuSelection) {
			 	case 1:
			 		printVolumeConversionMenu();
			 		menuSelection = scanner.nextInt();
			 		switch(menuSelection) {
			 		case 1:
			 			printInfoMenu();
			 			unitsToConvert = scanner.nextDouble();
			 			System.out.println(unitsToConvert +" Tablespoons is equal to " 
			 					+ tablespoonsToTeaspoons(unitsToConvert) + " Teaspoons\n \n \n" );
			 			break;
			 		case 2:
			 			printInfoMenu();
			 			unitsToConvert = scanner.nextDouble();
			 			System.out.println(unitsToConvert +" Teaspoons is equal to " 
			 					+ teaspoonsToCups(unitsToConvert) + " Cups\n \n \n" );
			 			break;
			 		case 4: 
				 		System.out.println("Quiting");
				 		running = false;
				 		break;
			 		default:
				 		System.out.println("Please pick another option\n \n \n");
			 		}
			 		break;
			 	case 2:
			 		printConversionMenu();
			 		menuSelection = scanner.nextInt();
			 		switch(menuSelection) {
			 			case 1:
			 				printInfoMenu();
			 				unitsToConvert = scanner.nextDouble();
				 			System.out.println(unitsToConvert +" Feet is equal to " 
				 					+ feetToMeters(unitsToConvert) + " Meters\n \n \n" );
			 				break;
			 			case 2:
			 				printInfoMenu();
			 				unitsToConvert = scanner.nextDouble();
				 			System.out.println(unitsToConvert +" Miles is equal to " 
				 					+ milesToKilometers(unitsToConvert) + " Kilometers\n \n \n" );
			 				break;
			 			case 4: 
					 		System.out.println("Quiting");
					 		running = false;
					 		break;
			 			default:
					 		System.out.println("Please pick another option\n \n \n");
			 		}
			 		break;
			 	case 4: 
			 		System.out.println("Quiting");
			 		running = false;
			 		break;
			 	default:
			 		System.out.println("Please pick another option\n \n \n");
			 }
		}
	}
	
	
	public static double teaspoonsToCups(double teaspoons) {
		return teaspoons * 0.0208333;
	}
	public static double tablespoonsToTeaspoons(double tablespoons) {
		return tablespoons * 3;
	} 
	public static double feetToMeters(double feet) {
		return feet / 3.281;
	}
	public static double milesToKilometers(double miles) {
		return miles * 1.60934;
	}
	
	public static void printVolumeConversionMenu() {
		System.out.println("Please select an option:\n"
				 + "1. Tablespoons to Teaspoons\n"
				 + "2. Teaspoons to Cups\n"
				 + "4. Quit");
	}
	
	public static void printConversionMenu() {
		System.out.println("Please select an option:\n"
				 + "1. Feet to Meters\n"
				 + "2. Miles to Kilometers\n"
				 + "4. Quit");
	}
	
	public static void printInfoMenu() {
		System.out.println("Please Enter how many units you would like to convert:");
	}
}
