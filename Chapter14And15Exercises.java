import java.util.Scanner;

public class Chapter14And15Exercises {

	public static void main(String[] args) {
	// loopSoup();
	// seeingStars();
	seeingStars1();

	}
	
	private static void seeingStars1() {
		Scanner keyboard = new Scanner(System.in);
		int stars, i;
		char ans;
		
		System.out.println("Do you want to see a row of stars? Type 'y' or 'n'");
		ans = keyboard.findWithinHorizon(".", 0).charAt(0);
		
		while (ans == 'y') {
			System.out.println("How many stars do you want to see?");
			stars = keyboard.nextInt();
			
			i = 1;
			while (i <= stars) {
			System.out.print("*");
			i++;
			}
			System.out.println();
			System.out.println("---");
						
			System.out.println("Do you want to see a row of stars? Type 'y' or 'n'");
			ans = keyboard.findWithinHorizon(".", 0).charAt(0);
		}
		System.out.println("That was fun. We should do it again sometime!");
		keyboard.close();
	}
	
	//A new method below for a different program
	public static void loopSoup() {
		int i = 5;
		int j;
		 while (i>0) {
			 System.out.println(i);
			 i--;
			 
			 j=1;
			 while (j<=3) {
				 System.out.print(j);
				 j++;
			}
			System.out.println();
		}
		
		 
		
	}
	
	//A new method below for a different program
	private static void seeingStars() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many stars do you want to see?");
		int stars = keyboard.nextInt();
		int i = 1;
		while (i <= stars) {
			System.out.print("*");
			i++;
		}
		keyboard.close();
	}

}
