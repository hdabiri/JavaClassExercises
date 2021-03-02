
public class Country {

	double debt;
	double gdp;
	
		//Constructor
		public Country (double debt, double gdp) {
		super();
		this.debt = debt;
		this.gdp = gdp;
		
		double ratio = debt/gdp;
		System.out.println("The debt-to-GDP ratio for " +this+ "is: " + ratio);
		
		if (ratio <= 0.8) {
			System.out.println("This is an acceptable ratio. Yaay!!");
			System.out.println();
		} else {
			System.out.println("This is not an acceptable ratio. :( ");
			System.out.println();
		}
		}
}
