package Inheritance_and_its_types_in_java;
class father{
	public void fatherName() {
		System.out.println("It is the Father class");
	}
}
class son extends father{
	
//	public void fatherName() {
//		System.out.println("It is the Father class");
//	}
	
}
public class Inheritance_1 {

	public static void main(String[] args) {
		son s=new son();
		s.fatherName();
		
	}

}
