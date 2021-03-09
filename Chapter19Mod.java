import java.util.Random;

public class Chapter19Mod {

	public static void main(String[] args) {
		 Random myRandom = new Random();
	        Chapter19ModClass anAccount;
	        double profitRate;

	        for (int i = 0; i < 3; i++) {
	            anAccount = new Chapter19ModClass();

	            anAccount.fillData();

	            anAccount.display();

	            profitRate = myRandom.nextInt(5);
	            anAccount.addProfit(profitRate);

	            anAccount.display();
	            System.out.println();

	        }
	}
}