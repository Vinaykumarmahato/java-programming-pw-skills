package Exception_Handling_in_java;
class demo{
	public void A() throws Exception {
		
		b();
		
	}
	public void b() throws Exception{
		int num1=8;
		int num2=0;
		int Result=num1/num2;
		System.out.println(Result);		
	}	
}

public class Ducking_The_Exception_Through {

	public static void main(String[] args) {
		demo vinay=new demo();
		try {
			vinay.A();
		}
		catch(Exception e) {
			System.out.println("Error..."+e);
		}
	}
}









