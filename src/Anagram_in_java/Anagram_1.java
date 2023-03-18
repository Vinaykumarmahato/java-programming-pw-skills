package Anagram_in_java;

import java.util.Arrays;

public class Anagram_1 {

	public static void main(String[] args) {
		/*let we have Any word if with the help of same word we can create a new word that is called Anagram
		 * for Example :- keep  peek ,  school master  the classroom
		 * Rules 
		 * 
		 * (1) REMOE THE SPACE
		 * (2) CONVERT INTO LOWER OR UPPER CASE
		 * (3) CONVERT TO AN ARRAY
		 * (4) SORT
		 * (5) COMPARE BOTH ANAGRAME*/
		String s1="School Master";
		String s2="The Classroom";
		
		s1=s1.replace(" ", "");
		s2=s2.replace(" ", "");
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char []arr1=s1.toCharArray();
		char []arr2=s2.toCharArray();
		
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
