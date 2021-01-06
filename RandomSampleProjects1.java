import java.util.Scanner;

public class RandomSampleProjects1 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("This program will print the multiplication table (up to 10) for the number you enter");
		System.out.println("Enter a number here: ");
		int num = keyboard.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			int result = num * i;
			System.out.println(num + " * " +i+ " = " +result);
		}

		keyboard.close();
	}

}
