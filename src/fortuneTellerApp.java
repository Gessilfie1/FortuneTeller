import java.util.Scanner;

public class fortuneTellerApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your first name?");
	
		String firstName = input.nextLine();
		
		System.out.println("Hello," + firstName);
		
		
		System.out.println("What is your last name?");
		
		
		String lastName = input.nextLine();
		System.out.println("Thank you " + firstName + " " + lastName);
		
			
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
		
		System.out.println("What is your birth month?");
		int userMonth = input.nextInt();
		

		
		
		
		
		
		
	
		
		
		
		

	}

}
