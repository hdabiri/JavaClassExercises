import java.util.Scanner;

/*
 * This program is to calculate how long it will take to memorize the entire Qur'an based on number of lines per day.
 * There are 8,815 lines in the Noble Qur'an.
 * Depending on how many lines per day the participant enters in the program, 
 * it will calculate how many days it will take to complete the entire Qur'an.
 * 
 * I will have to create multiple variables to store several components of the code.
 * Variables such as Years, Months, days, and total number of lines. 
 * I also need to collect the data from the user about how many lines they plan to memorize per day.
 * This will be done using the Scanner method to collect input from the user. 
 * 
 * Assumptions:
 * In this code I have assumed that a month is 30 days long and that a year is 365 days. 
 * It does not account for leap years and days that are shorter or longer than 30
 * This is important to make the program easier to code at this stage of my learning process. 
 * I have also excluded the lines of the Quran that are surah headers and Bismillah.
 * These normally amount to 227 lines. (114*2 = 228. subtracting 1 line for the absence of bismillah for surat Taubah = 227)
 * I manually counted the lines for suratul Faatihaha and the first page of Suratul Baqarah because they are not full pages.
 * 
 * 
 * */
public class HowLongtoMemorize_Lines {

	public static void main(String[] args) {
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

		System.out.println("........................................");
		System.out.println("\nIt will take you " + totalDays + " days to memorize the Qur'an.");
		System.out.println("This will be " + years + " year(s), " + months + " month(s), and " + days + " day(s).");
		System.out.println("Get Started...and Baaraka Allah feek");
		
		userInput.close();
	}

}
