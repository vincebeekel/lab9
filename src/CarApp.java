import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Prompt the user for how many cars they want to enter
		System.out.println("How many cars would you like to enter?");
		// get user input and store in variable
		int numOfCars;
		String make;
		String model;
		int year;
		double price;

		numOfCars = Validator.getInt(scan, "Please Enter an Integer");

		ArrayList<Car> carLot = new ArrayList<Car>();

		// use a for loop to take input from the user
		// prompt for make, model, year, and price
		// get input from "Scanner"

		for (int i = 0; i < numOfCars; i++) {
			make = Validator.getString(scan, "Enter the Make for car " + (i+1));

			model = Validator.getString(scan, "Enter the Model for car " + (i+1));

			year = Validator.getInt(scan, "Enter the Year for car " + (i+1));

			price = Validator.getDouble(scan, "Enter the Price for car " + (i+1));

			carLot.add(new Car(make, model, year, price));
		}

		// print out a table of the cars at the end

		for (int i = 0; i < carLot.size(); i++) {
			System.out.println("Car " + (i+1) + ": ");
			System.out.println("Make: " + carLot.get(i).getMake() + "\tModel: " + carLot.get(i).getModel()
					+ "\tYear: " + carLot.get(i).getYear() + "\tPrice: $" + carLot.get(i).getPrice());

		}

	}

}
