package object_creation;


	

public class object_creation_1 {
	String name;
	int age;

	public static void main(String[] args) {
		// declare the variable
				// create the object
		object_creation_1 sk=new object_creation_1();
		sk.age=21;
		sk.name="vinay kumar";
		System.out.println(sk);
		System.out.println(sk.age);
		System.out.println(sk.name);
		object_creation_1  sk2=new object_creation_1();
		sk2.name="Anish kumar";
		sk2.age=19;	
		System.out.println(sk2.age);
		System.out.println(sk2.name);
		
	}

}
