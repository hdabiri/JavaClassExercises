
public class Person {

	double weight;
	double height;
		
	//Generated Constructor
	public Person(double weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
			
		double bmi = weight / (height*height);
		
		System.out.println("The Body Mass Index is: "+ bmi);
		System.out.println();
	}
	
	public Person() {
		
	}


	
}