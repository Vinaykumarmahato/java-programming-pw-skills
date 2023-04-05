package Exception_Handling_in_java;
import java.util.*;
public class Finally_Block_in_Exception {

	public static void main(String[] args) {
		
		int number=0;
	
		System.out.println("Enter the number");
		
		Scanner scan=new Scanner(System.in);
		
	try {
		number=scan.nextInt();
		scan.close();
	}
	catch(InputMismatchException e) {
		System.out.println("Enter a Number");
	}
	finally {
		scan.close();
		System.out.println("Resource Closed");

	}
	
		System.out.println(number);
		
   }	
		
}






