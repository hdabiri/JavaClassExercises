import java.util.Scanner;

public class MemorizationAppCoded {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int z = 0;
		int y = 0;
		MemorizationApp hidi = new MemorizationApp(z, "Hidayah");
		System.out.println("=========================================");
		System.out.println();
		
		Scanner userInput1 = new Scanner(System.in);
		System.out.print("Please enter how many ayahs you want to memorize every day : ");
		String x = userInput1.nextLine();
		
		MemorizationApp hidi2 = new MemorizationApp("Hidayah2", y);
		
		userInput1.close();
		
		
		//		I noticed that when i try to run both in the same run, it gives errors as follows: 
		//		'Exception in thread "main"' in the output of the first object, and 
		//		'java.util.NoSuchElementException: No line found
		//		at java.base/java.util.Scanner.nextLine(Scanner.java:1651)
		//		at MemorizationApp.<init>(MemorizationApp.java:19)
		//		at MemorizationAppCoded.main(MemorizationAppCoded.java:13)' instead of the output of the second object.
		//		Individually however, they both run perfectly.
	}

}
