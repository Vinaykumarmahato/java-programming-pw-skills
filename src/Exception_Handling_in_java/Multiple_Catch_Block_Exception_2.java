package Exception_Handling_in_java;

public class Multiple_Catch_Block_Exception_2 {

	public static void main(String[] args) {
		int number1=10;
		int number2=0;
		int Result=0;
		int array[]= {21,787,54,547,57};
		
		try {
			System.out.println(array[10]);
			
			Result = number1 / number2;
		}
		
		catch(Exception e) {
			
			System.out.println("Exception Resolving ");
		}
		
		System.out.println(Result);
		System.out.println("All Resolved ");
	}

}
