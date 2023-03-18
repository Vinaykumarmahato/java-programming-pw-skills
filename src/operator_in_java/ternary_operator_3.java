package operator_in_java;

public class ternary_operator_3 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		int result=(a<b)? (a<c ? a:b):(b<c ? b:c);
		System.out.println(result);
	}

}
