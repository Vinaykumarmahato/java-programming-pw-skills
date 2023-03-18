package Enhance_for_loop_in_java;

public class Enhance_2 {

	public static void main(String[] args) {
		int nums[][]= {{45,45,75,45},
						{45,25,41,74},
						{24,65,74,35},
						{52,35,30,10}};
		
		for(int a[]:nums) {
			for(int b:a) {
				System.out.print(b+" ");
			}
			System.out.println();
			
		}

}
}
