import java.io.File;
import java.io.FileNotFoundException;
//import java.io.PrintStream;
import java.util.Scanner;


public class Chapter16Exercises {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("Hello Chapter 16!");
		
		// arrayInit();
		// pickAnElement();		
		// displayAllElement();
		// displaySomeElements();
		// generatingSquares();
		// findOneVancany();
		// totalGuests();
		// parallelArrays();
		decipheringWords();
				
		
	}

	public static void decipheringWords() {
		char[] cipher = {'s','f', 'k', 'l', 'd', 'o', 'h', 'z', 'm', 'b',
                't', 'a', 'n', 'g', 'u', 'v', 'i', 'q', 'x', 'w', 'y', 'c',
                'j', 'r', 'p', 'e' };
        char[] plain =  { 'e', 'q', 's', 'f', 'i', 'n', 'h', 'u', 'r', 'k',
                'g', 'z', 'c', 'y', 'x', 'l', 'm', 'd', 'w', 'a', 'b', 't',
                'p', 'j', 'v', 'o' };
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type a word or string of letters to see another! ");
        char input = keyboard.findWithinHorizon(".", 0).charAt(0);
		
        while (input !=' ') {
	        int index = 0;
			
			while (index < 26 && cipher[index] != input) {
				index ++;
			}
        	if(index < 26) {
					System.out.println("Your corresponding letter(s) or word is: "+ plain[index]);
			}
        	input = keyboard.findWithinHorizon(".", 0).charAt(0);
		}
		 keyboard.close();
		
	}
	
	
	

	public static void parallelArrays() {
		
		char[] cipher = {'s','f', 'k', 'l', 'd', 'o', 'h', 'z', 'm', 'b',
                't', 'a', 'n', 'g', 'u', 'v', 'i', 'q', 'x', 'w', 'y', 'c',
                'j', 'r', 'p', 'e' };
        char[] plain =  { 'e', 'q', 's', 'f', 'i', 'n', 'h', 'u', 'r', 'k',
                'g', 'z', 'c', 'y', 'x', 'l', 'm', 'd', 'w', 'a', 'b', 't',
                'p', 'j', 'v', 'o' };
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type a letter to see another! ");
        char input = keyboard.findWithinHorizon(".", 0).charAt(0);
		int index = 0;
		
		while (index < 26 && cipher[index] != input) {
			index ++;
		}
        	if(index < 26) {
					System.out.println("Your corresponding letter is: "+ plain[index]);
				}
		 keyboard.close();
		 
//		do {
//			if(index < 26) {
//				System.out.println("Here is your corresponding letter "+ plain[index]);
//			}
//		} while (index < 26 && cipher[index] != input){
//			index++;
//		}
        
	}

	public static void totalGuests() throws FileNotFoundException {
		 Scanner diskScanner = new Scanner(new File("occupancy"));
	        int guestsIn[];
	        guestsIn = new int[10];
	        int totalNumGuests = 0;

	        for (int roomNum = 0; roomNum < 10; roomNum++) {
	            guestsIn[roomNum] = diskScanner.nextInt();
	        }

	        for (int roomNum = 0; roomNum < 10; roomNum++) {
	            totalNumGuests += guestsIn[roomNum];
	        }

	        System.out.print("There are " +totalNumGuests+ " guests in the hotel");
	               
	        diskScanner.close();
	    }
		
		


	public static void findOneVancany() throws FileNotFoundException {
		
//		PrintStream diskWriter = new PrintStream("occupancy");
//		diskWriter.println("This is the occupancy document");
//		diskWriter.println();
		
		Scanner diskScanner = new Scanner(new File("occupancy"));
		
		int guestsIn[] = new int[10];
		for (int roomNum = 0; roomNum < 10; roomNum++) {
			guestsIn[roomNum] = diskScanner.nextInt();
		}
		int roomNum = 0;
		while (roomNum < 10 && guestsIn[roomNum] != 0) {
				roomNum++;
		}
			//if (roomNum > 5 && roomNum< 10) { //This line of code didn't work. I was trying to print the second vacant room.
		if (roomNum < 10) {	
		System.out.println("Room "+roomNum+ " is the first vacant room.");
				
		} else {
			System.out.println("Unfortunately, there is no vacancy!");
		}
		

		//diskWriter.close();
		diskScanner.close();
	
	}


	public static void generatingSquares() {
		int squares[]= new int[50];
		 for (int i = 0; i < 50; i++) {
			 squares[i] = i*i;
			// System.out.println(squares[i]); //this line will print all the results.
		 }
		 System.out.println(squares[0]);
		 System.out.println(squares[1]);
		 System.out.println(squares[2]);
		 System.out.println(squares[49]);
		
	}

	public static void displaySomeElements() {
		int amounts[] = {19,21,16,14,99,86,31,19,0,101};
		
		//for(int i = 0; i<10 && i%2 !=1; i++) this expression only printed the first answer and nothing else. not sure why.
		for (int i = 0; i < 10; i+=2) {
		System.out.println("The position "+ i +" value is "+ amounts[i]);
		}		
	}

	public static void displayAllElement() {
		int amounts[] = {19,21,16,14,99,86,31,19,0,101};
		for (int i = 0; i < 10; i++) {
		System.out.println("The position "+ i +" value is "+ amounts[i]);
		}
	
	}

	public static void pickAnElement() {
		int amounts[]= {19,21,16,14,99,86,31,19,0,101};
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an index number (0-9) and I'll show you it's content. ");
		int input = keyboard.nextInt();
		System.out.println(amounts[input]);
		
		keyboard.close();
		
	}

	public static void arrayInit() {
		int[] myArray = {9,21,35,16,21,7}; //This is the only way it will work.
		// int[] myArray;
		//	myArray = {9,21,35,16,21,7}; //This will not work because it must be initialized in the same line 
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray[5]);
		System.out.println(myArray[6]);
	}

}
