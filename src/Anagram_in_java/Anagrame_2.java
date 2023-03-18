package Anagram_in_java;

import java.util.Arrays;

public class Anagrame_2 {

	public static void main(String[] args) {
		String str1="keep";
		String str2="peek";
		str1=str1.toUpperCase();
		str2=str2.toUpperCase();
		
		char []arr1=str1.toCharArray();
		char []arr2=str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			
			System.out.println("It is an Anagrame");
		}
		else {
			System.out.println("It is not an anagrame");
		}
	}

}
