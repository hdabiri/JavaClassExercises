import java.util.Scanner;

public class Chapter17Exercises {

	public static void main(String[] args) {

		//person1();
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
		System.out.println();
		keyboard.close();
	}
	
	public static void threePeople() {
		
		Person person01 = new Person();
		Person person02 = new Person();
		Person person03 = new Person();
		
		double bmi1, bmi2, bmi3;
		Scanner keyboard = new Scanner(System.in);
		
		// for Person 1
		System.out.println("Please enter the height of Person 1: ");
		person01.height = keyboard.nextDouble();
		System.out.println("Please enter the weight of Person 1: ");
		person01.weight = keyboard.nextDouble();
		
		bmi1 = person01.weight / (person01.height*person01.height);
		
		System.out.println("The Body Mass Index for Person 1 is: "+ bmi1);
		System.out.println("=========================");
		
		// For Person 2
		System.out.println("Please enter the height of Person 2: ");
		person02.height = keyboard.nextDouble();
		System.out.println("Please enter the weight of Person 2: ");
		person02.weight = keyboard.nextDouble();
		
		bmi2 = person02.weight / (person02.height*person02.height);
		
		System.out.println("The Body Mass Index for Person 2 is: "+ bmi2);
		System.out.println("=========================");
		
		// For Person 3
		System.out.println("Please enter the height of Person 3: ");
		person03.height = keyboard.nextDouble();
		System.out.println("Please enter the weight of Person 3: ");
		person03.weight = keyboard.nextDouble();
		
		bmi3 = person03.weight / (person03.height*person03.height);
		
		System.out.println("The Body Mass Index for Person 3 is: "+ bmi3);
		System.out.println("=========================");
		
		keyboard.close();
		
	}
}

