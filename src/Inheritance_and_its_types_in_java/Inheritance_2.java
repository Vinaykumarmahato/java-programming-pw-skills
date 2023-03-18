package Inheritance_and_its_types_in_java;
/*  Type of Inheritance in java 
 *  There are Following type of inheritance in java 
 *   
 *   (1) Single level
 *   (2) multi level
 *   (3) Heirarchal Inheritance
 *   (4) Multiple Inheritance */

// Single level Inheritance

class vijay_mahto{
	public void vijayInfo() {
		System.out.println("Vijay mahato is the father of vinay kumar");
	}
}
class vinay extends vijay_mahto{
	public void vinayInfo() {
		System.out.println("Vinay kumar is the son of Mr. vijay mahto0");
	}
}
public class Inheritance_2 {

	public static void main(String[] args) {
		vijay_mahto  v= new vijay_mahto();
		v.vijayInfo();
		vinay v1=new vinay();
			v1.vinayInfo();
			v1.vijayInfo();
		
		
	}

}
