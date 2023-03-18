package Encapsulation_in_java;
class Student{
	String name;
	int age;
	public void show() {
		System.out.println(name+" "+age);
	}
}
public class Encapsulation_1 {

	public static void main(String[] args) {
		Student s=new Student();
		s.name="vinay";
		s.age=21;
		s.show();

	}

}
