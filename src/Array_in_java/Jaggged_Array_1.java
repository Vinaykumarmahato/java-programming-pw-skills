package Array_in_java;

public class Jaggged_Array_1 {

	public static void main(String[] args) {
		int arr[][][]= {{{12,45,78,98},
				{12,65,32},
					
				{45,78,95,42,45,65},
			{41,32,42}}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0; k<arr[i][j].length;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
