import java.util.Scanner;


public class Chapter9Exercises {

	public static void main(String[] args) {
		
	//ifStatementsExamples();
	//whatKindOfNumber();
	trafficLight();
}

	public static void ifStatementsExamples() {
		
	System.out.println("Do you want to see a smiley face? Type 'yes' for yes and 'no' for no.");
	Scanner keyboard = new Scanner(System.in);
	String ans = keyboard.nextLine();
	String yes = "yes";
	
//	System.out.println(ans);
//	System.out.println(yes);
	System.out.println();

	if (ans.equals(yes)) {
		System.out.println(":-)");
	}
		else if (ans.equals("no")) {
			System.out.println(":-(");
		} else if (ans.equals("?")) {
			System.out.println(":-|");
		}
	
	keyboard.close();	
	}
	
	public static void whatKindOfNumber() {
		System.out.println("Please enter a number: ");
		Scanner keyboard = new Scanner(System.in);
		int num = keyboard.nextInt();
		
		if(num > 0) {
			System.out.println("This is a positive number!");
			
		}else if(num < 0) {
			System.out.println("This is a negative number!");
			
		}else {
			System.out.println("This number is zero!");
		}
		keyboard.close();
	}
	public static void trafficLight() {
		System.out.println("This program will determine if it is safe to cross the intersection.");
		System.out.println(" Please answer the following questions by typing 'yes' or 'no'.");
		System.out.println("====================================================");
		System.out.println();
		System.out.println("Are you approaching a green light? ");
		Scanner keyboard = new Scanner(System.in);
		String response = keyboard.next();
		
		if(response.equals("yes")) {
			System.out.println("Is it safe to proceed through the intersection?");
			String safe = keyboard.next();
			
			if(safe.equals("yes")) {
				System.out.println("GO!");
				
			}else {
				System.out.println("STOP!");
			}
		}else {
			System.out.println("Is a police officer directing you?");
			String police = keyboard.next();
			
			if(police.equals("yes")) {
				System.out.println("GO!");
			}else {
				System.out.println("STOP!");
			}
		}
		keyboard.close();
		
		
	}
}