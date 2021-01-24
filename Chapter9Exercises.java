import java.util.Random;
import java.util.Scanner;


public class Chapter9Exercises {

	public static void main(String[] args) {
		
	//	ifStatementsExamples();
	//	whatKindOfNumber();
	//	trafficLight();
	//	guessingGame();
		convertingLengths();
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
	public static void guessingGame() {
		
		System.out.println("This program will test your guess against a randomly generated number");
		System.out.println("Take a guess between 1 and 10, and enter your guess here -> ");
		Scanner keyboard = new Scanner(System.in);
		Random myRandom = new Random();
		int genRandom, guessNum;
		genRandom = myRandom.nextInt(10) + 1;
		guessNum = keyboard.nextInt();
		
		if (genRandom == guessNum) {
			System.out.println("You win!");
		} else {
			System.out.println("You lose!");
		}
		keyboard.close();
		
	}
	
	public static void convertingLengths() {
		
		System.out.println("This program will read your input (in meters) and convert it to centimeters or millimeters");
		System.out.println("Please enter a measurement in whole number, then space, then 'c' for centimeter, or 'm' for millimeter.");
		 Scanner keyboard = new Scanner(System.in);
		 int measure, result;
		 char changeTo, space;
		 
		 measure = keyboard.nextInt();
		 space = keyboard.findWithinHorizon(".", 0).charAt(0);
		 changeTo = keyboard.findWithinHorizon(".", 0).charAt(0);
		 
		 if (changeTo == 'c') {
			result = measure * 100;
			System.out.println("Your measurement in centimeters is"+space + result + ".");
			
		} else if (changeTo == 'm'){
			result = measure * 1000;
			System.out.println("Your measurement in millimeters is"+space+ result+ ".");
		} else {
			System.out.println("Please verify you followed the instructions above correctly.");
		}
		 keyboard.close();
			
		
	}
}