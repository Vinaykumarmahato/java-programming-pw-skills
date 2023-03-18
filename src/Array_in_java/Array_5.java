package Array_in_java;

public class Array_5 {

	public static void main(String[] args) {
		int arr[][][]= {{{45,84,45,24,24},{54,78,65,42,52},{45,98,45,24,12}}};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
