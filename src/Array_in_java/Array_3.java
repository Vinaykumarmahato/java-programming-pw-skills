package Array_in_java;

public class Array_3 {

	public static void main(String[] args) {
		int Arr[][]=new int[3][3];
		Arr[0][0]=65;
		Arr[0][1]=20;
		Arr[0][2]=30;
		Arr[1][0]=65;
		Arr[1][1]=64;
		Arr[1][2]=84;
		Arr[2][0]=54;
		Arr[2][1]=45;
		Arr[2][2]=100;
		
		for(int i=0;i<Arr.length;i++) {
			for(int j=0;j<Arr[i].length;j++) {
				
				System.out.print(Arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
