package reversing_of_String_in_java;

public class reverse_4 {

	public static void main(String[] args) {
		String name1="Vinay Kumar"; // kumar vinay
		String name2="";
		
		String Arr[]=name1.split(" ");
		
		for(int i=Arr.length-1;i>=0;i--) {
			
			name2=name2+Arr[i]+" ";
		}
		System.out.println("After reversing : "+name1);
		System.out.println("Before reversing : "+name2);
	}		
	

}
