package MultiThreading_In_Java;

public class Multithreading_priority_Thread {

	public static void main(String[] args) {
		System.out.println("main thread");
		System.out.println("Before Seting the name & priority");
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		
		
		System.out.println("After Seting the name & priority");

		Thread t1=new Thread();
		t1.setName("ADV Indian Coder");
		System.out.print(t1);
		
		Thread t2=new Thread();
		t2.setPriority(1);
		System.out.println(t2);
		
		
	}

}
