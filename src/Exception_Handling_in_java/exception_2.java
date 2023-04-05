package Exception_Handling_in_java;

public class exception_2 {

	public static void main(String[] args) {
		
		int num1=6;
		int num2=2;
		int result=0;
		
		try {
			result=num1/num2;
			System.out.println("In try Block");
		}
		catch(ArithmeticException obj) {
			
			System.out.println("Can't Devide ");
		}
		System.out.println(result);

	}

}
