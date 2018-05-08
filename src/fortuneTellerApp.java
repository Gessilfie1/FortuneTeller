
import java.util.Scanner;

public class fortuneTellerApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//ask user for first name.
		System.out.println("What is your first name?");
		String firstName = input.nextLine();
		System.out.println("Hello," + firstName);
		
		//ask user for last name.
		System.out.println("What is your last name?");
		String lastName = input.nextLine();
		System.out.println("Thank you " + firstName + " " + lastName);
		
		//Ask user for age ensuring it is entered as an integer.
		int number = 0;
		boolean isNumberAge;		
	
		do {
			System.out.println("How old are you?");
			if (input.hasNextInt()) {
				number = input.nextInt();
				isNumberAge = true;
			}else {
				System.out.println("Please enter an integer for Age");
				isNumberAge = false;
				input.next();
				
							} 
		} while (!(isNumberAge));
		
		//Ask user for birth month as an integer. Ensure user enters an integer
		int month = 0;
		boolean isBirthMonth;
		
		do {
			System.out.println("What is your birth month as a number?");
			if (input.hasNextInt()) {
				month = input.nextInt();
				isBirthMonth = true;
			}else {
				System.out.println("Sorry cannot accept...");
				isBirthMonth = false;
				input.next();
				
							} 
		} while (!(isBirthMonth));
		
		input.nextLine();
		
		//ask user for favorite ROYGBIV color
		
		System.out.println("What is your favorite ROYGBIV color? \n "
				+ "If you don't know what ROYGBIV is type \"HELP\" to get a list of ROYGBIV colors");
		
				String favColor = input.nextLine();
				//should i use .equals instead of .contains method??
				if (favColor.toLowerCase().contains("help")) {
					
					System.out.println("RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET \n"
							+ "Select one of the colors listed.");
									}
				
				input.nextLine();
				
				int siblings = 0;
				boolean isNumberOfSiblings;		
			
				do {
					System.out.println("How many siblings do you have?");
					if (input.hasNextInt()) {
						siblings = input.nextInt();
						isNumberOfSiblings = true;
					}else {
						System.out.println("Please enter a numeric value for siblings");
						isNumberOfSiblings = false;
						input.next();
						
									} 
				} while (!(isNumberOfSiblings));
				
				//PART 2 (RETIREMENT YEARS)
				
				//user age is even number
								
				if (number % 2 == 0) {
					System.out.println("You will retire in 20 years");					
				}
				//user age is odd number
				else {
					System.out.println("You will retire in 40 years");
				}
			
				
				
				
				
		
	
		
		

		
		
		
		
		
		
	
		
		
		
		

	}

}
