
import java.util.Random;
import java.util.Scanner;


public class Chapter11and12Exercises {

	public static void main(String[] args) {
		// I always comment out the other methods to test them one at a time.
		
//		daysOfTheWeek();  
//		timeToEat();
//		tinyCalculator();
//		randomConditionalExercise();
//		livingLarge();
//		areWeThereYet();
//		tallyUp();
		twoInARow();
	}

	public static void daysOfTheWeek() {
		System.out.println("This program will determine what day of the week it is.");
		System.out.println("Enter a number from 1-7 to determine what day it is");
		Scanner keyboard = new Scanner(System.in);
		int dayNumber = keyboard.nextInt();
		
		switch (dayNumber) {
		case 1: {
				System.out.println("Sunday");
				break;
		}
		case 2: {
			System.out.println("Monday");
			break;
		}
		case 3: {
			System.out.println("Tuesday");
			break;
		}
		case 4: {
			System.out.println("Wednesday");
			break;
		}
		case 5: {
			System.out.println("Thursday");
			break;
		}
		case 6:{
			System.out.println("Friday");
			break;
		}
		case 7: {
			System.out.println("Saturday");
			break;
		}
		default:
			System.out.println("Unexpected value: " + dayNumber);
		}
		keyboard.close();
		
	}
	
	public static void timeToEat() {
		System.out.println("This program will inform you about mealtimes,");
		System.out.println("based on the time you enter. Time is measured in 24 hour format.");
		System.out.println("For times in the PM, please enter 13 for 1pm, 14 for 2pm .. and so on");
		System.out.println("========================================================");
		
		System.out.println("What time is it now? ");
		Scanner keyboard = new Scanner(System.in);
		int time = keyboard.nextInt();
		
		switch (time) {
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("Breakfast is served!");
			break;
			
		case 11:
		case 12:
		case 13:
			System.out.println("Time for lunch!");
			break;
		case 17:
		case 18:
		case 19:
		case 20:
			System.out.println("It's Dinner time!");
			break;

		default:
			System.out.println("Sorry, you'll have to wait, or go get a healthy snack.");
			break;
		}
		keyboard.close();
	}
	
	public static void tinyCalculator() {
		System.out.println("This program will compute simple arithmetic operations for you.");
		System.out.println("Enter your first number: ");
		Scanner keyboard = new Scanner(System.in);
		double num1 = keyboard.nextDouble();
		System.out.println("Enter your second number: ");
		double num2 = keyboard.nextDouble();
		System.out.println("Enter your arithmetic operation ( +, -, *, / ) ");
		char operator = keyboard.next().charAt(0);
						
		switch (operator) {
		case '+':
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case '-':
	        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	        break;

		case '*':
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case '/':
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			break;

		default:
			System.out.println("Please make sure you entered the bigger number first. "
					+ "Or ensure your operators are one of the 4 above.");
			break;
		}
		keyboard.close();
	}
	
	public static void randomConditionalExercise() {
		
		//Random randomNum = new Random();
		Random randomNum = new Random();
		System.out.println("Please enter a random integer between 0 and 9: ");
		Scanner keyboard = new Scanner(System.in);
		int num1 = keyboard.nextInt();
		int genRandom = randomNum.nextInt(10) + 1;
	
		if (genRandom == num1) {
			System.out.println("You win!");
		}else {
			System.out.println("You Lose!");
		}
		keyboard.close();
	}
	
	public static void livingLarge() {
		
		Scanner keyboard = new Scanner(System.in);
		int number;
		
		number = keyboard.nextInt();
		while (number <= 100) {
			number=keyboard.nextInt();
		}
		keyboard.close();
	}
	
	public static void areWeThereYet() {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please respond to the question with 'Y' or 'y' if we are there.");
		System.out.println("Or respond with 'N' or 'n' if we are not there yet.");
		char response = keyboard.findWithinHorizon(".", 0).charAt(0);
		
		while (response != 'y' && response != 'Y') { //I used || here and it continued to loop.
			System.out.println("Are we there yet?");
			response = keyboard.findWithinHorizon(".", 0).charAt(0);
		}
		System.out.println("Finally! We have arrived. Whew!");
		keyboard.close();
	}
	
	public static void tallyUp() {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter any number and this program will add them all up for you");
		System.out.println("If you enter a negative number, the total will be displayed without the negative number");
		int input, total = 0;
		input = keyboard.nextInt();
		
		while (input >= 0) {
			System.out.println("You entered " + input);
			total += input;
			input = keyboard.nextInt();
		}
		System.out.println( "You total is " +total+ ".");
		keyboard.close();
	}
	
	public static void twoInARow() {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter any positive number.");
		System.out.println("The program will stop if you enter the same number twice back to back.");
		int input1, input2;
		input1 = keyboard.nextInt();
		input2 = keyboard.nextInt();
		
		while (input1 != input2) {
			
			input1 = input2;
			input2 = keyboard.nextInt();
		}
		System.out.println( "Yaay!");
		keyboard.close();
	}
}
