import java.util.Scanner;

public class Chapter7Exercises {

	public static void main(String[] args) {
		
	//	System.out.println("Hiring A Plumber");
	//	hiringAPlumber();
	//	System.out.println();
	//	System.out.println("Making Change");
	//	makingChange();
	//	System.out.println();
	//	System.out.println("How Tall Am I?");
	//	howTallAmI();
	//	System.out.println();
		System.out.println("How Many Anniversaries?");
		howManyAnniversaries();
				
	}

	
	// Hiring a Plumber
	public static void hiringAPlumber() {
		int baseCharge = 75;
		double extraHour = 125;
		double billDue = 0;
				
		Scanner hours = new Scanner(System.in);
		System.out.println("How many hours did the plumber work? ");
		double totalHours = hours.nextDouble();
		
		billDue = baseCharge + (totalHours * extraHour);
		
		System.out.println();
		System.out.println("The total amount you owe the plumber is $" + billDue + ". Pay up!!");
		
		hours.close();
	}
	
	//Making Change
	public static void makingChange() {
		double cost = 2.38;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("The Book cost $2.38");
		System.out.println("How much money did you pay? (tip: Type dollar amount, then a space, then cents amount)");
		int dollar = keyboard.nextInt();
		double cents = keyboard.nextDouble();
		
		double decimal = cents/100;
		double change = (dollar + decimal) - cost;
		
		System.out.println("You have a total of $"+change+" in change.");
		keyboard.close();
	}
	
	//How Tall Am I?
	public static void howTallAmI() {
		int standardFeet = 12;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("The program will measure your height in inches.");
		System.out.println("How tall are you? (Enter your height in this format: feet, then a space, inches)");
		int feet = keyboard.nextInt();
		int inches = keyboard.nextInt();
		
		int height = (feet * standardFeet) + inches;
		
		System.out.println("You entered "+feet+" feet and "+inches+" inches.");
		System.out.println();
		System.out.println("Therefore you are "+height+" inches tall!");
		
		keyboard.close();
	}
	
	//How Many Anniversaries?
	public static void howManyAnniversaries() {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("This program will calculate how many anniversaries you've had if you were married on February 29th (of a leap year)");
		System.out.println("How many years have you been married for? ");
		int years = keyboard.nextInt();
		
		int anniversary = years/4;
		
		System.out.println("You have had "+anniversary+" anniversaries in "+years+" years!");
		keyboard.close();
	}
}
