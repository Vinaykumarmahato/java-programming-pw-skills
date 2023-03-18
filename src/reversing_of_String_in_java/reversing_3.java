package reversing_of_String_in_java;

public class reversing_3 {

	public static void main(String[] args) {
		String s1="pw skills";
		String s2="";
		String array[]=s1.split(" ");
		
		for(int i=array.length-1;i>=0;i--) {
			
			s2=s2+array[i]+" ";
			
		}
		System.out.println("After reversing: "+s1);
		System.out.println("Bebfore reversing: "+s2);
	
	}

}
