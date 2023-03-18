package methodoverloading_in_java;
class cal{
	public void show(byte n) {
		
		System.out.println("byte "+n);
	}
	public void show( short n) {
		
		System.out.println("short "+n);
	}
	public void show( char n) {
	
	System.out.println("char "+n);
}
	public void show( int n) {
	
	System.out.println("int "+n);
}
	public void show( double n) {
	
	System.out.println("double "+n);
}
}
public class method_overloading_4 {

	public static void main(String[] args) {
		cal v=new cal();
		v.show(2);
		v.show(54.15255);
		
		// automatic promotion in overloading

	}

}
