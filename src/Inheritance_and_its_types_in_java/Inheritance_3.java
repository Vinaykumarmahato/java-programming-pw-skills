package Inheritance_and_its_types_in_java;

// Heirarchal Inheritance

class Aeroplane{
	public void TakeOff() {
		System.out.println("Aeroplane is Taking Off");
	}
	public void fly() {
		System.out.println("Aeroplane is flying medium hight");
	}
}
class cargoplane extends Aeroplane{
	
	// output: Aeroplane is Taking Off
	//Aeroplane is flying medium hight

}
class Passengerplane extends Aeroplane{
	//Aeroplane is Taking Off
	//Aeroplane is flying medium hight

	
}
class Fighterplane extends Aeroplane{
	//Aeroplane is Taking Off
	//Aeroplane is flying medium hight

	
}
public class Inheritance_3 {

	public static void main(String[] args) {
		Fighterplane fp=new Fighterplane();
		fp.TakeOff();
		fp.fly();

	}

}
