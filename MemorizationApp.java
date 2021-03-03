import java.util.Scanner;

public class MemorizationApp {
		
			int totalAyah = 6236;
			int versesPerDay;
			int totalLines = 8815;
			int linesPerDay;
			String name;
	
	
	public MemorizationApp(String name, int linesPerDay) {
		super();
		this.name = name;
		this.linesPerDay = linesPerDay;
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter how many lines you want to memorize every day " +name+ " : ");
		String x = userInput.nextLine();
		linesPerDay = Integer.parseInt(x);

		int totalDays = (totalLines / linesPerDay);

		int years = totalDays / 365;
		int months = (totalDays % 365) / 30;
		int days = ((totalDays % 365) % 30);
		
		System.out.println("----------------------------------------");
		System.out.println( name+ ", it will take you " + totalDays + " days to memorize the Qur'an.");
		System.out.println("This will be " + years + " year(s), " + months + " month(s), and " + days + " day(s).");
		System.out.println("Get Started...and Baaraka Allah feek, " +name);
		
		userInput.close();
		
	}


	public MemorizationApp(int versesPerDay, String name) {
		super();
		this.versesPerDay = versesPerDay;
		this.name = name;
		
		Scanner userInput1 = new Scanner(System.in);
		System.out.print("Please enter how many ayahs you want to memorize every day " +name+" : ");
		String x = userInput1.nextLine();
		versesPerDay = Integer.parseInt(x);

		int totalDays = totalAyah / versesPerDay;

		int years = totalDays / 365;
		int months = (totalDays % 365) / 30;
		int days = ((totalDays % 365) % 30);
		
		System.out.println("----------------------------------------");
		System.out.println( name+ ", It will take you " + totalDays + " days to memorize the Qur'an.");
		System.out.println("This will be " + years + " year(s), " + months + " month(s), and " + days + " day(s).");
		System.out.println("Get Started...and Baaraka Allah feek, "+name+"." );

		userInput1.close();
	}
	
	

}
