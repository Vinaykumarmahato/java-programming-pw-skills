package project;

import java.util.Scanner;

// Make Shaping class abstract
abstract class Shaping {
    float area;

    // Make input and Computing methods abstract
    abstract public void input();
    abstract public void Computing();

    public void show_the_result() {
        System.out.println("The Area Is: " + area);
    }
}

// Make rectangle class extend Shaping
class rectangle extends Shaping {
    float length;
    float breadth;

    // Implement input method
    public void input() {
        System.out.println("Calculation of Rectangular App");
        Scanner vinay = new Scanner(System.in);
        System.out.println("Please Enter the length of the Rectangle");
        length = vinay.nextFloat();
        System.out.println("Please Enter the Breadth of the Rectangle");
        breadth = vinay.nextFloat();
    }

    // Implement Computing method
    public void Computing() {
        // Use length * breadth instead of length * length
        area = length * breadth;
    }
}

// Make Square class extend Shaping
class Square1 extends Shaping {
    float length;

    // Implement input method
    public void input() {
        System.out.println("Calculation of Square App");
        Scanner vinay = new Scanner(System.in);
        System.out.println("Please Enter the Length of the Square");
        length = vinay.nextFloat();
    }

    // Implement computing method with correct spelling
    public void Computing() {
        area = length * length;
    }
}

// Make circle class extend Shaping
class circle1 extends Shaping {
    float radius;

    // Implement input method
    public void input() {
        System.out.println("Calculation of Circle App");
        Scanner vinay = new Scanner(System.in);
        radius = vinay.nextFloat();
    }

    // Implement Computing method with correct spelling
    public void Computing() {
        area = 3.14f * radius * radius;
    }
}

// Create a separate class to handle the polymorphism
class geometry {
    public void poly(Shaping ref) {
        ref.input();
        ref.Computing();
        ref.show_the_result();
    }
}


public class project_5_but_as_a_java_developer {

	public static void main(String[] args) {
		
		rectangle rec=new rectangle();
		Square1 sq=new Square1();
		circle1 c=new circle1();
		geometry gk=new geometry();
		gk.poly(rec);
		gk.poly(sq);
		gk.poly(c);
	}

}

