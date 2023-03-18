package Final_Key_Word_in_java;
class Animal{
	
	final int age =21;
	final public void AnimalInfo() {
		System.out.println("Animal is Sleeping");
		// age=30 ; it will not excute due to final key word
		System.out.println(age);
	}
}
class Animal_child extends Animal{

	/*            public void AnimalInfo() {
		it can't be overwrite here due to final key word
	           }
	*/
}
public class final_1 {

	public static void main(String[] args) {
		Animal_child a=new Animal_child();
		a.AnimalInfo();

	}

}
