package Encapsulation_in_java;
class Student{
	
	
	private String Name;
	private int Age;
	
	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getName() {
		
		return Name;
	}
	
	public void show() {
		System.out.println(Name+" "+Age);
	}
}
public class Encapsulation_3 {
	public static void main(String args[]) {

	
		//Student s=new Student();
		Student s1=new Student();

		s1.setAge(21);
		//s.setName("vinay kumar");
		int std1Age=s1.getAge();
		//String std1Name=s.getName();
		//System.out.println(std1Name);
		System.out.println(std1Age);
		
		
		
	}

}
