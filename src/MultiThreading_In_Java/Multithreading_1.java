package MultiThreading_In_Java;

public class Multithreading_1 {

	public static void main(String[] args) {
		System.out.println("Main Thread");
		String name=Thread.currentThread().getName();
		System.out.println(name);
	}

}
