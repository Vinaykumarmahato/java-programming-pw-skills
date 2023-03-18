package conditional_statement_in_java;

public class conditional_3 {

	//  find the greatest value
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		if(a>b && a>c) {	
			System.out.println("A is greater");
		}
		else if(b>a && b>c) {
			System.out.println("B is greater");
		}
		else if(c>a && c>b) {
			System.out.println("c is greater");
		}
	}

}
