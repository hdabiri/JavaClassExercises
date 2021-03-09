import static java.lang.System.out;

import java.text.NumberFormat;
import java.util.Random;

public class Chapter19ModClass {

	 String lastName;
	    int id;
	    double balance;
	    
	    void fillData() {
	    	
	    	Random myRandom = new Random();
	    	lastName = "" +
	                (char) (myRandom.nextInt(26) + 'A') +
	                (char) (myRandom.nextInt(26) + 'a') +
	                (char) (myRandom.nextInt(26) + 'a');
	        id = myRandom.nextInt(10000);
	        balance = myRandom.nextInt(10000);
	    }

	    void addProfit(double rate) {
	        out.print("Adding ");
	        out.print(rate);
	        out.println(" percent profit...");

	        balance += balance * (rate / 100.0);
	    }

	    void display() {
	        NumberFormat currency = NumberFormat.getCurrencyInstance();

	        out.print("The account with last name ");
	        out.print(lastName);
	        out.print(" and ID number ");
	        out.print(id);
	        out.print(" has balance ");
	        out.println(currency.format(balance));
	    }
}
