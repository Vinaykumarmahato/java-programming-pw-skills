package Array_in_java;
class cal{
	public int Add(int nums[]) {
		int result=0;
		for(int n : nums) {
			result=result+n;
		}
		return result;
	}
}
public class Anonymous_Array_in_java {

	public static void main(String[] args) {
		/*Anonymous Array is the Array in which we no need to
		 * write the variable name . and one main thing anonymous
		 * Array can be use Only one time 
		 */
		cal v=new cal();
		int nums[]= {4,5,6,7};
		int result=v.Add(nums);
		System.out.println(result);
	}

}
