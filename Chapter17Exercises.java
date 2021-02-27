import java.util.Scanner;

public class Chapter17Exercises {

	public static void main(String[] args) {

		person1();
		threePeople();
	}

	public static void person1() {
		
		Person hidi = new Person();
		double bmi;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the height: ");
		hidi.height = keyboard.nextDouble();
		System.out.println("Please enter the weight: ");
		hidi.weight = keyboard.nextDouble();
		
		bmi = hidi.weight / (hidi.height*hidi.height);
		
		System.out.println("The Body Mass Index is: "+ bmi);
		
		keyboard.close();
	}
	
	public static void threePeople() {
		
		Person person01 = new Person();
		double bmi;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the height: ");
		person01.height = keyboard.nextDouble();
		System.out.println("Please enter the weight: ");
		person01.weight = keyboard.nextDouble();
		
		bmi = person01.weight / (person01.height*person01.height);
		
		System.out.println("The Body Mass Index is: "+ bmi);
		
		keyboard.close();
		
	}
}

