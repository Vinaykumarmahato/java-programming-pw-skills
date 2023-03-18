package operator_in_java;

public class Logical_operator_1 {

	public static void main(String[] args) {
		/*there are three type of logical operator in java
		 * 
		 * (1) AND && condition only true then result will be true
		 * 
		 * (2) OR  || Even one condition true then result will be true
		 * 
		 * (3) NOT  !  true value will be false and false value will be true
		 * 
		 */
		
		int a=10;
		int b=20;
		int c=30;
		System.out.println(a<b && b<c && c>a && b>a); // true
		System.out.println(a<=b || b>c || a!=b || c<a); // true
		System.out.println(!true); // false
		System.out.println(!false);// true
	}

}
