package methodoverloading_in_java;

class Student{
	
public int Add(int a, int b , int c) {
	int result=a+b+c;
	return result;
}
public int Add(int a, int b, int c, int d) {
	int result1=a+b+c+d;
	return result1;
}
}

public class method_overloading_1 
{
public static void main(String[] args) {
		Student s=new Student();
		 
		System.out.println(s.Add(4, 5, 3));
		System.out.println(s.Add(10, 20,30, 40));
		

	}

}
