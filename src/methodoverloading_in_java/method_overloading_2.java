package methodoverloading_in_java;
class test{
	public int show(int a) {
		int result1=a;
		return result1;
	}
	public int show(int a, int b) {
		int result2=a+b;
		return result2;
	}
	
	public float show(float a, float b,  float c) {
		float result3=a+b+c;
		return result3;
	}
}
public class method_overloading_2 {

	public static void main(String[] args) {
		test t=new test();
		
		System.out.println(t.show(20));
		System.out.println(t.show(45, 20));
		System.out.println(t.show(45, 56, 30));
	}

}
