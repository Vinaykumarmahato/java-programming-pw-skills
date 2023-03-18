package Pangram_in_java;

public class pangram_1 {

	public static void main(String[] args) {
		boolean flag=false;
		/*All alphabets should be in a sentence or word then that is called pangram
		 * 
		 * 
		 * rules 
		 * 
		 * (1) Remove white Space
		 * (2) Convert Upper or Lower case
		 * (3) Convert to char Array
		 * (4) Create An empty Array
	    */
		
		String s1="THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
		
		s1=s1.replace(" ", "");
		char ch[]=s1.toCharArray();
		int arr[]=new int[26];
		
		for(int i=0;i<ch.length;i++) {
			
			arr[ch[i]-65]++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				System.out.println("It is not pangram");
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("It is Pangram");
		}
		
	}

}
