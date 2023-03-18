package Palindrome_in_java;

public class palindrome_1 {

	public static void main(String[] args) {
		/*what is palindrome ?
		 * It is the process of reversing of the string but 
		 * in plindrome we check After reversing the string both 
		 * String is Equal or not , If String will be equal then it will called 
		 * as palindrome. 
		 * 
		 * Example:-  mama reverse mama
		 * 			madam  reverse madam
		 * 
		 * 
		 */
		String s1="MADAM";
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--) {
			
			s2=s2+s1.charAt(i);
		}
		if(s1.equals(s2)) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("it is not palindrome");
		}
		

	}

}
