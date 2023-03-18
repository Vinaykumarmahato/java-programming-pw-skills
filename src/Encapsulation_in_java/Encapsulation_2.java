package Encapsulation_in_java;
class vinay{
	private int EmpId;
	
	public void SetEmpId(int Id) {
		EmpId=Id;
		
	}
	public int getEmpId() {
		return EmpId;
	}
}
public class Encapsulation_2 {
	public static void main(String args[]) {
	vinay v=new vinay();
	v.SetEmpId(100);
	System.out.println(v.getEmpId());
}
}
