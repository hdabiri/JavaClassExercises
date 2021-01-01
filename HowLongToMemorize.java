import java.util.Scanner;

/*
 * This program is to calculate how long it will take to memorize the entire Qur'an
 * There are 6,236 verses in the Noble Qur'an.
 * Depending on how many verses per day the participant enters in the program, 
 * it will calculate how many days it will take to complete the entire Qur'an.
 * 
 * I will have to create multiple variables to store several components of the code.
 * Variables such as Years, Months, days, and total number of verses. 
 * I also need to collect the data from the user about how many verses they plan to memorize per day.
 * This will be done using the Scanner method to collect input from the user. 
 * 
 * Assumptions:
 * In this code I have assumed that a month is 30 days long and that a year is 365 days. 
 * This is important to make the program easier to code at this stage of my learning process. 
 * I
 * have also not included the Bismillah verses in the total count of verses. 
 * Adding the Bismillah will bring the total verses count to 6,350.
 * Bismillah is standard with every surah except Surat Taubah, so there is no need to count it.
 * 
 * */
public class HowLongToMemorize {

	public static void main(String[] args) {
		
		System.out.println("=================================================================="
				+ "\nHow Long To Memorize Based on Number of Ayahs"+"\n______________________________________________________\n");

		howLongToMemorize();
		
		System.out.println("\n\n=================================================================="
				+ "\nHow Long To Memorize Based on Number of Lines"+"\n______________________________________________________\n");
		
		howLongToMemorize_Lines();
		
	}
		
		public static void howLongToMemorize() {
		int totalAyah = 6236;
		int versesPerDay = 0;

		Scanner userInput1 = new Scanner(System.in);
		System.out.print("Please enter how many ayahs you want to memorize every day: ");
		String x = userInput1.nextLine();
		versesPerDay = Integer.parseInt(x);

		int totalDays = totalAyah / versesPerDay;

		int years = totalDays / 365;
		int months = (totalDays % 365) / 30;
		int days = ((totalDays % 365) % 30);
		
		System.out.println("----------------------------------------");
		System.out.println("........................................");
		System.out.println("\nIt will take you " + totalDays + " days to memorize the Qur'an.");
		System.out.println("This will be " + years + " year(s), " + months + " month(s), and " + days + " day(s).");
		System.out.println("Get Started...and Baaraka Allah feek");

		//userInput1.close();
	}

		public static void howLongToMemorize_Lines() {
			
			int totalLines = 8815;
			int linesPerDay = 0;

			Scanner userInput = new Scanner(System.in);
			System.out.print("Please enter how many lines you want to memorize every day: ");
			String x = userInput.nextLine();
			linesPerDay = Integer.parseInt(x);

			int totalDays = totalLines / linesPerDay;

			int years = totalDays / 365;
			int months = (totalDays % 365) / 30;
			int days = ((totalDays % 365) % 30);
			
			System.out.println("----------------------------------------");
			System.out.println("........................................");
			System.out.println("\nIt will take you " + totalDays + " days to memorize the Qur'an.");
			System.out.println("This will be " + years + " year(s), " + months + " month(s), and " + days + " day(s).");
			System.out.println("Get Started...and Baaraka Allah feek");
			
			userInput.close();
		}
}
