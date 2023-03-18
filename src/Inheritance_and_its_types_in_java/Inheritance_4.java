package Inheritance_and_its_types_in_java;

// Multilevel Inheritance


class Demo1{
	public void demoinfo() {
		System.out.println("First class");
	}
}
class Demo2 extends Demo1{
	public void demo2info() {
		System.out.println("Second class");
	}
}
class Demo3 extends Demo2 {
	public void demo3info() {
		System.out.println("3Rd class");
	}
}
public class Inheritance_4 {

	public static void main(String[] args) {
		//Demo2 vinay1=new Demo2();
		//vinay1.demo2info();
		//vinay1.demoinfo();
		Demo3 vinay2=new Demo3();
		vinay2.demo2info();
		vinay2.demo3info();
		vinay2.demoinfo();
		
	}

}
