import java.util.Scanner;


public class Chapter14And15Exercises {

	enum Game {
		rock, paper, scissors, shoe
	}
	public static void main(String[] args) {
	// loopSoup();
	// seeingStars();
	// seeingStars1();
	// repeatName();
	// currencyConversion();
	// sampleDoWhile();
	// enumExample();
	enumExample1();
	
	
	}
	public static void enumExample1() {
		
		for (Game leftReel : Game.values()) {
			for (Game middleReel : Game.values()) {
				System.out.println(leftReel + " " + middleReel);
				}
		}
}
	
	
	
		public static void enumExample() {
		
			for (Game leftReel : Game.values()) {
				for (Game middleReel : Game.values()) {
					for (Game rightReel : Game.values()) {
						System.out.println(leftReel + " " + middleReel + " "+ rightReel);
					}
				}
			}
	}


		public static void sampleDoWhile() {
			 Scanner keyboard = new Scanner(System.in);
		        int num;
		        char reply;

		        do {
		            System.out.print("Enter a number: ");
		            num = keyboard.nextInt();
		            System.out.println(num + "\tDo you want to continue? y or n");
		            
		            reply = keyboard.findWithinHorizon(".", 0).charAt(0);
		            System.out.println();
		        } while (reply != 'n');

		        System.out.println("There you go!");
		        
		        keyboard.close();
		
	}


		public static void currencyConversion() {
		
		double naira, rate = 500;
		
		System.out.println("Dollar\tNaira");
		for (int i = 1; i <= 10; i++) {
			naira = i * rate;
			System.out.println(i + "\t" + naira);
			System.out.println();
		}
		
	}


		public static void repeatName() {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			int howMany, i;
			String usersName;
			
			System.out.println("Please enter your name and how many times you want it repeated");
			
			usersName = input.next();
			howMany = input.nextInt();
			System.out.println();
			
			for (i = 0; i < howMany; i++) {
				System.out.println(usersName);
								
			}
			input.close();
			
	}





	//A new method below for a different program
		public static void seeingStars1() {
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
		public static void seeingStars() {
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
	
	
	
	

}
