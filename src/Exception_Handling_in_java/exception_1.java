package Exception_Handling_in_java;

public class exception_1 {


	public static void main(String[] args) {
		
		int num1=10;
		int num2=0;
		int result=0;
		try {
			
			result=num1/num2;
		}
		
		catch(Exception e) {
			System.out.println("Can't devide :"+e);
		}
		System.out.println(result);

	}
	

}
