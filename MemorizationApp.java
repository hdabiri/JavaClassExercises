import java.util.Scanner;

public class MemorizationApp {
		
		static final int totalAyah = 6236;
		static final int totalLines = 8815;	
					 int versesPerDay;
					 int linesPerDay;
					 String name;
		static Scanner keyboard = new Scanner(System.in);
	
	public MemorizationApp(String name, int linesPerDay) {
		
		this.name = name;
		this.linesPerDay = linesPerDay;
		
		System.out.print("Please enter how many LINES you want to memorize every day " +name+ " : ");
		String x = keyboard.nextLine();
		linesPerDay = Integer.parseInt(x);

		int totalDays = (totalLines / linesPerDay);

		int years = totalDays / 365;
		int months = (totalDays % 365) / 30;
		int days = ((totalDays % 365) % 30);
		
		System.out.println("----------------------------------------");
		System.out.println( name+ ", it will take you " + totalDays + " days to memorize the Qur'an.");
		System.out.println("This will be " + years + " year(s), " + months + " month(s), and " + days + " day(s).");
		System.out.println("Get Started...and Baaraka Allah feek, " +name);
		
		//keyboard.close();
		
		
		
	}


	@Override
	public String toString() {
		return  name;
	}


	public MemorizationApp(int versesPerDay, String name) {
		
		this.versesPerDay = versesPerDay;
		this.name = name;
		
		System.out.print("Please enter how many AYAHS you want to memorize every day " +name+" : ");
		String x = keyboard.nextLine();
		versesPerDay = Integer.parseInt(x);

		int totalDays = totalAyah / versesPerDay;

		int years = totalDays / 365;
		int months = (totalDays % 365) / 30;
		int days = ((totalDays % 365) % 30);
		
		System.out.println("----------------------------------------");
		System.out.println( name+ ", It will take you " + totalDays + " days to memorize the Qur'an.");
		System.out.println("This will be " + years + " year(s), " + months + " month(s), and " + days + " day(s).");
		System.out.println("Get Started...and Baaraka Allah feek, "+name+"." );

		//keyboard.close();
	}
	
	

}