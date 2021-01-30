import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Chapter13Exercises {

	public static void main(String[] args) throws FileNotFoundException {
		Random myRandom = new Random();
		PrintStream diskWriter = new PrintStream("chapter13Data.txt");
		
		int x = 1;
		while (x <= 10) { 
			diskWriter.println(myRandom.nextInt());
			x++;
		}
		
		diskWriter.close();
		
		Scanner diskReader = new Scanner(new File("chapter13Data.txt"));
		
		x = 1;
		while (x <=10) {
			System.out.println(diskReader.nextInt());
			x++;
		}
		diskReader.close();
	
	}
}
