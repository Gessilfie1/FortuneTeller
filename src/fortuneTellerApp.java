
import java.util.Scanner;

public class fortuneTellerApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// ask user for first name.
		System.out.println("What is your first name?");
		String firstName = input.nextLine();
		System.out.println("Hello," + firstName);

		// ask user for last name.
		System.out.println("What is your last name?");
		String lastName = input.nextLine();
		System.out.println("Thank you " + firstName + " " + lastName);

		// Ask user for age ensuring it is entered as an integer.
		int number = 0;
		boolean isNumberAge;

		do {
			System.out.println("How old are you?");
			if (input.hasNextInt()) {
				number = input.nextInt();
				isNumberAge = true;
			} else {
				System.out.println("Please enter an integer for Age");
				isNumberAge = false;
				input.next();

			}
		} while (!(isNumberAge));

		// Ask user for birth month as an integer. Ensure user enters an integer
		int month = 0;
		boolean isBirthMonth;

		do {
			System.out.println("What is your birth month as a number?");
			if (input.hasNextInt()) {
				month = input.nextInt();
				isBirthMonth = true;
			} else {
				System.out.println("Sorry cannot accept...");
				isBirthMonth = false;
				input.next();

			}
		} while (!(isBirthMonth));

		input.nextLine();

		// ask user for favorite ROYGBIV color

		System.out.println("What is your favorite ROYGBIV color? \n "
				+ "If you don't know what ROYGBIV is type \"HELP\" to get a list of ROYGBIV colors");

		String favColor = input.nextLine();
		// use .contains method and .toLowerCase method to accept user input regardless of Case.
		
		if (favColor.toLowerCase().contains("help")) {

			System.out.println(
					"RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET \n" + "Select one of the colors listed.");
		}

		int siblings = 0;
		boolean isNumberOfSiblings;

		do {
			System.out.println("How many siblings do you have?");
			if (input.hasNextInt()) {
				siblings = input.nextInt();
				isNumberOfSiblings = true;
			} else {
				System.out.println("Please enter a numeric value for siblings");
				isNumberOfSiblings = false;
				input.next();
			}
		} while (!(isNumberOfSiblings));

		// PART 2 (RETIREMENT YEARS)

		// user age is even number

		if (number % 2 == 0) {
			System.out.println(firstName + " " + lastName + " will retire in 20 years with ");
		}
		// user age is odd number
		else {
			System.out.println(firstName + " " + lastName + " will retire in 40 years with ");
		}

		// BANK BALANCE

		if ((month <= 4) && (month >= 1)) {
			System.out.println("$3,500,000 in the bank, ");
		} else if ((month <= 8) && (month >= 5)) {
			System.out.println("$250,000 in the bank, ");
		} else if ((month <= 12) && (month >= 9)) {
			System.out.println("$112.00 in the bank, ");
		} else {
			System.out.println("$0.00 in the bank, ");
		}

		// VACATION HOME LOCATION

		if (siblings == 0) {
			System.out.println("a vacation home in Dubai UAE");

		} else if (siblings == 1) {
			System.out.println("a vacation home in Perth Australia, ");
		} else if (siblings == 2) {
			System.out.println("a vacation home in Punta Cana FL, ");
		} else if (siblings == 3) {
			System.out.println("a vacation home in Los Angeles CA, ");
		} else if (siblings > 3) {
			System.out.println("a vacation home in Dublin Ireland, ");
		} else {
			System.out.println("a vacation home in Antarctica ");
		}

		// MODE OF TRANSPORTATION
		switch (favColor.toLowerCase()) {

		case "red":
			System.out.println("and travel by Private Jet.");
			break;
		case "orange":
			System.out.println("and travel by Hot Air Balloon.");
			break;
		case "yellow":
			System.out.println("and travel by Jeep Wrangler.");
			break;
		case "green":
			System.out.println("and travel by Tesla.");
			break;
		case "blue":
			System.out.println("and travel by Toyota Highlander.");
			break;
		case "indigo":
			System.out.println("and travel by uber XL.");
			break;
		case "violet":
			System.out.println("and travel by unicycle.");
			break;

		default:
			System.out.println("and travel by walking!");

		}
		
		input.close();

	}

}
