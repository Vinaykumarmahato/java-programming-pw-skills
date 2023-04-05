package Exception_Handling_in_java;


public class Multiple_catch_block_Exception_1 {

	public static void main(String[] args) {
		
		int number1=10;
		int number2=0;
		int Result=0;
		int array[]= {21,787,54,547,57};
		
		try {
			
			Result=number1/number2;
			
			System.out.println(array[5]);
			
			System.out.println("In Try Block");
		}
		
		catch(ArithmeticException e) {
			System.out.println("Zero Can't Devide By Ten");
		}
		
		catch(ArrayStoreException e) {
			
			System.out.println("Stay In Limits");
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		
		System.out.println(Result);
		System.out.println("Hey Dear Vinay kumar");
		
	}
	
}
		
		


