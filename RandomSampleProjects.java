import java.util.Scanner;

public class RandomSampleProjects {

	public static void main(String[] args) {

		System.out.println("This program will compute two numbers and display the result");
		System.out.println("=============================================================");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int fnumber = keyboard.nextInt();
		System.out.println("Enter the second number: ");
		int snumber = keyboard.nextInt();
		
		int result = fnumber * snumber;
		System.out.println("The result of "+fnumber+" * "+snumber+" is "+result);
		
		System.out.println(fnumber+ " + " +snumber +" = "+ (fnumber+snumber));
		System.out.println(fnumber+ " - " +snumber +" = "+ (fnumber-snumber));
		System.out.println(fnumber+ " / " +snumber +" = "+ (fnumber/snumber));
		System.out.println(fnumber+ " mod " +snumber +" = "+ (fnumber%snumber));
		System.out.println(fnumber+ " * " +snumber +" = "+ (fnumber*snumber));

		
		keyboard.close();
		
	}

}
