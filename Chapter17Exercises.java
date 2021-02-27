import java.util.Scanner;

public class Chapter17Exercises {

	public static void main(String[] args) {

		Person hidi = new Person();
		double bmi;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the height: ");
		hidi.height = keyboard.nextDouble();
		System.out.println("Please enter the weight: ");
		hidi.weight = keyboard.nextDouble();
		
		bmi = hidi.weight / (hidi.height*hidi.height);
		
		System.out.println("The Body Mass Index is: "+ bmi);
		
		
	}

}
