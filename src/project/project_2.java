package project;
import java.util.*;
class Application{
	int principal_Amount;
	float Time_Duration;
	float rate_of_Interest;
	float simple_Interest;
	
	void input() {
		Scanner vinay=new Scanner(System.in);
		
		System.out.println("Please ! mention the Required Amount");
		principal_Amount=vinay.nextInt();
		
		System.out.println("Please ! mention Time Duration");
		Time_Duration=vinay.nextFloat();
		
		rate_of_Interest=805f;
	}
	void compute() {
		simple_Interest = (principal_Amount * rate_of_Interest * Time_Duration) / 100f;
	}
	
	void display() {
		System.out.println("Simple Interest Is :"+simple_Interest);
	}
}


public class project_2 {

	public static void main(String[] args) {
		Application f1=new Application();
		f1.input();
		f1.compute();
		f1.display();
		Application f2=new Application();
		f2.input();
		f2.compute();
		f2.display();

		
	}

}
