package reversing_of_String_in_java;

public class reverse_5 {

	public static void main(String[] args) {
		String s1="vinay kumar"; // ramuk yaniv
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
	}

}
