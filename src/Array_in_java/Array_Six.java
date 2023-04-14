package Array_in_java;


public class Array_Six {

	public static void main(String[] args) {
		
		int array[][]=new int[3][3];
		array[0][0]=45;
		array[0][1]=45;
		array[0][2]=45;
		array[1][0]=45;
		array[1][1]=45;
		array[1][2]=45;
		array[2][0]=45;
		array[2][1]=45;
		array[2][2]=45;
		
		for(int i=0;i<array.length;i++) {
			
			for(int j=0;j<array[i].length;j++) {
				
				System.out.print(" "+array[i][j]+" ");
			}
			
			System.out.println();
		}


		

	}

}
