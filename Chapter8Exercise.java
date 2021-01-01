// I usually comment out the method calls in order to test one program at a time.

import java.util.Scanner;

public class Chapter8Exercise {

	public static void main(String[] args) {
		
		   temperature();	
		// nameCase();
				
		// String s = "box"; 
	    // stringPermutation(s, ""); 
		   
		   
	}
	
	static void temperature() {
		
		Scanner keyboard = new Scanner(System.in);
		double celsius, fahrenheit;
		System.out.print("Please enter the current temperature in Celsius: ");
		celsius = keyboard.nextDouble();
		
		fahrenheit = 9.0/5.0 * celsius + 32;
		System.out.println("The same temperature in Fahrenheit is "+fahrenheit+".");
		System.out.println();
		System.out.println("In this case, the expression (fahrenheit <= 69.8 + 0.01) is "+(fahrenheit <= 69.8 + 0.01));  // && fahrenheit >= 69.8 -0.01
		
		keyboard.close();
	}

		static void stringPermutation(String str, String ans) {
		
		// Java program to print all the permutations 
		// of the given string 
			
		      // If string is empty 
		        if (str.length() == 0) { 
		            System.out.print(ans + " "); 
		            return; 
		        } 
		  
		        for (int i = 0; i < str.length(); i++) { 
		  
		            // ith character of string 
		            char ch = str.charAt(i); 
		  
		            // Rest of the string after excluding  
		            // the ith character 
		            String ros = str.substring(0, i) +  
		                         str.substring(i + 1);//+str.substring(i + 1); 
		            
		            stringPermutation(ros, ans + ch);
		          //  System.out.println(ros);
		         } 
		} 
//=======================================================================================================================
		static void nameCase() {
			
			char c1, c2, c3, c4;
			
			Scanner name = new Scanner(System.in);
			System.out.print("Please enter a four letter name here: ");
			char n1 = name.findWithinHorizon(".", 0).charAt(0);
			char n2 = name.findWithinHorizon(".", 0).charAt(0);
			char n3 = name.findWithinHorizon(".", 0).charAt(0);
			char n4 = name.findWithinHorizon(".", 0).charAt(0);
			
			System.out.println();
			System.out.println("The name you entered is "+n1+n2+n3+n4+".");
			
			c1 = Character.toUpperCase(n1);
			c2 = Character.toLowerCase(n2);
			c3 = Character.toLowerCase(n3);
			c4 = Character.toLowerCase(n4);
			
			System.out.println();
			System.out.println("The correct punctuation of the name is "+c1+c2+c3+c4+".");
			
			System.out.println();
			System.out.println("The same name spelt backwords is "+(n4 = Character.toUpperCase(n4))+(n3 = Character.toLowerCase(n3))+(n2 = Character.toLowerCase(n2))+(n1 = Character.toLowerCase(n1))+".");
			
			name.close();
		}
		
}
