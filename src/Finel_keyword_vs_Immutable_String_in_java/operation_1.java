package Finel_keyword_vs_Immutable_String_in_java;

public class operation_1 {

	public static void main(String[] args) {
		 int a=10;
		 a=29;
		System.out.println(a); // this is a general term
		
		// but when we talk about final keyword then the we can't change the value of final integer data type.
		
		final int vinay=10;
	//	vinay=20; it wont allow.
		
		String name=new String("vinay kumar");
		System.out.println(name); // vinay kumar.
		name=name.concat(" "+"Shahu is my life");// vinay kumar shahu is my life.
		System.out.println(name);
		
		final StringBuffer s=new StringBuffer("ADV indian coder");
		s.append(" "+"vinay kumar");
		System.out.println(s);
		
		//StringBuffer s=new StringBuffer("shahu is my life");
		//System.out.println(s);
		
		
	}

}
