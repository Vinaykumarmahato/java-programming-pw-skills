package MultiThreading_In_Java;

public class Change_the_thread_name_and_Priority {

	public static void main(String[] args) {
		
		System.out.println("Before changing the name of Thread");
		String name=Thread.currentThread().getName();
		System.out.println(name);
		
		System.out.println("Before Changing the priority of Thread");
		int no=Thread.currentThread().getPriority();
		System.out.println(no);
		
		System.out.println("After Changing the name and priority");
		
		Thread t1=new Thread();
		t1.setName("Vinay Kumar");
		System.out.println(t1.getName());

		Thread t2=new Thread();
		t2.setPriority(3);
		System.out.println(t2.getPriority());
		
	}

}
