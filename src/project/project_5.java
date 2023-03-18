package project;
import java.util.*;
class rectangular{
	float length;
	float breadth;
	float area;
	public void input() {
		System.out.println("Calculation of Rectangular App");
		Scanner vinay =new Scanner(System.in);
		System.out.println("Please Enter the length of the Rectangle");
		length =vinay.nextFloat();
		System.out.println("Please Enter the Breadth of the Rectangle");
		breadth=vinay.nextFloat();
	}
	public void Computing() {
		area=length*length;
	}
	public void show_the_result() {
		System.out.println("Area Of The Rectangle is :"+area);
	}
}
class Square{
	float length;
	float area;
	public void input() {
		System.out.println("Calculation of Square App");
		Scanner vinay=new Scanner(System.in);
		System.out.println("Please Enter the Length of the Square");
		length=vinay.nextFloat();
	}
	public void computing() {
		area =length*length;
	}
	public void show_the_result() {
		System.out.println("Area of Square is :"+area);
	}
}
class circle{
	float radius;
	float area;
	public void input() {
		System.out.println("Calculation of Circle App");
		Scanner vinay=new Scanner(System.in);
		radius=vinay.nextFloat();
	}
	public void computing() {
		
		area=3.14f*radius*radius;
	}
	public void show_the_result() {
		System.out.println("Area of the Circle is :"+area);
	}
}
public class project_5 {

	public static void main(String[] args) {
		rectangular ADV_Indian_Coder=new rectangular();
		ADV_Indian_Coder.input();
		ADV_Indian_Coder.Computing();
		ADV_Indian_Coder.show_the_result();
		
		Square ADV=new Square();
		ADV.input();
		ADV.computing();
		ADV.show_the_result();
		
		circle c=new circle();
		c.input();
		c.computing();
		c.show_the_result();
	}

}
