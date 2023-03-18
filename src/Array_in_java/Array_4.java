package Array_in_java;

public class Array_4 {
	public static void main(String args[]) {
	
		int Array[][]=new int[4][3];
		Array[0][0]= 10;
		Array[0][1]= 20;
		Array[0][2]= 30;
	
		Array[1][0]= 50;
		Array[1][1]= 60;
		Array[1][2]= 70;
		
		Array[2][0]= 90;
		Array[2][1]= 65;
		Array[2][2]= 48;
		
		Array[3][0]=645 ;
		Array[3][1]= 32;
		Array[3][2]= 15;
		
		for(int i=0; i<Array.length;i++) {
			for(int j=0;j<Array[i].length;j++) {
				
				System.out.print(Array[i][j]+" ");
			}
			System.out.println();
		}

}
}