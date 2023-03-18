package Type_of_Method_Inherited_Overridding_Specialized;
// Inherited method

class Aeroplane{
	public void TakeOff() {
		System.out.println("Aeroplane is taking off");
	}
	public void Fly() {
		System.out.println("Aeroplane is flying");
	}
}
class Cargoplane extends Aeroplane{
	
}
class passengerplane extends Aeroplane{
	
}
public class method_1 {

	public static void main(String[] args) {
		
		Cargoplane cp=new Cargoplane();
		cp.TakeOff();
		cp.Fly();
		
		passengerplane pp=new passengerplane();
		pp.TakeOff();
		pp.Fly();

	}

}
