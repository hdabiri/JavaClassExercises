/*
 * The Source of these problems is the website w3resource.com
 * The specific link is "https://www.w3resource.com/java-exercises/basic/index.php"
 */



public class RandomSampleProjects2 {

	public static void main(String[] args) {
		
	//question9();
	question10();
	
	
	}
	public static void question9() {
		double x=25.5,y=3.5,z=40.5,m=4.5;
		double result = ((x*y-y*y)/(z-m));
		System.out.println(result);

	}

	public static void question10() {
		double x=4.0,y=1.0,z; //z is the variable for the result
		int a=1,b=3,c=5,d=7,e=9,f=11;
		z=x*(a-(y/b)+(y/c)-(y/d)+(y/e)-(y/f));
		System.out.println(z);
	}
}
