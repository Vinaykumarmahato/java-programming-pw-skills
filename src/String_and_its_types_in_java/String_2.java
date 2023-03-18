package String_and_its_types_in_java;

public class String_2 {

	public static void main(String[] args) {
		// there are two way of creating the String in java 
		String s1="vinay kumar";
		String s2="vinay kumar";
		
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true
		
		String s3=new String("ADV indian coder");
		String s4=new String("ADV indian coder");
		System.out.println(s3==s4);// false
		System.out.println(s3.equals(s4)); // true
		s3.concat("Vinay kumar mahto");
		System.out.println(s3);
		
		

	}

}
