package Type_of_Method_Inherited_Overridding_Specialized;
// Overridding method


class Aeroplane1{
	
	public void TakeOff() {
		System.out.println("Aeroplane is taking off");
	}
	public void Fly() {
		System.out.println("Aeroplane is flying");
	}
}
class Cargoplane1 extends Aeroplane1{
	public void TakeOff() {
		System.out.println("Cargoplane is taking off");
	}
	public void Fly() {
		System.out.println("Cargoplane is flying");
	}
}
class passengerplane1 extends Aeroplane1{
	public void TakeOff() {
		System.out.println("PassengerPlane is taking off");
	}
	public void Fly() {
		System.out.println("Pasengerplane is flying");
	}
	public void Fighterplane() {
		System.out.print("It fly in the sky");
		/*This type of method called as Specialized method
		 * in java which will not have parent class */
	}
}

public class method_2 {
	public static void main(String args[]) {
		Cargoplane1 cp=new Cargoplane1();
		cp.TakeOff();
		cp.Fly();
		
		passengerplane1 pp=new passengerplane1();
		pp.TakeOff();
		pp.Fly();
		
		Aeroplane1 ap=new Aeroplane1();
		ap.TakeOff();
		ap.Fly();
	}

}
