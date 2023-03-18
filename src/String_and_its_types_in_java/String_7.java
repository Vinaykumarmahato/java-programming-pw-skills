package String_and_its_types_in_java;

public class String_7 {

	public static void main(String[] args) {
		String s1="shahu"+" "+"vinu";
		String s2="vinu"+" "+"shahun is my life";
		String s3="shahu vinu";
		System.out.println(s1);
		System.out.println(s2);// here s1 s2 s3 will be store in SCP 
		System.out.println(s3);
		String s4=s1+" "+s2;
		System.out.println(s4);// this will be store out of SCP because we are Concatenating the value but
								// in s1 s2 s3 we  are just adding the String that's why s4 will be out of CSP.
		
	
	}

}
