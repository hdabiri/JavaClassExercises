import java.util.Scanner;

public class Chapter11and12Exercises {

	public static void main(String[] args) {
		
//		daysOfTheWeek();  // I always comment out the other methods to test them one at a time.
//		timeToEat();
		tinyCalculator();
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
}
