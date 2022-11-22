package polymorphisam;

/* By using parent reference to child class object is called 
 * as loose coupling or up casting or runtime polymorphisam
 * 
 * */
class Plane {
	public void fly() {
		System.out.println("plane will fly");
	}
	public void takeOff() {
		System.out.println("Plane will take off");
	}
	public void landing() {
		System.out.println("Plane will land");
	}
}
class Cargoplane extends Plane{
	
	// override method 
	public void fly() {
		System.out.println("cargo plane fly little low height");
	}
	
}
class PassingerPlane extends Plane{
	
	//override method
	public void fly() {
		System.out.println("Passenger plane fly little high height");
	}
}


public class LanuchLooscouping {
	
	public static void main(String[] args) {
		Plane cargoplane = new Cargoplane();
		Plane passingerPlane = new PassingerPlane();
		
		cargoplane.fly();
		
		//Inherited methods.
		cargoplane.landing();
		//Inherited methods.
		cargoplane.takeOff();
		
		passingerPlane.fly();
		
		//Inherited methods.
		passingerPlane.takeOff();
		//Inherited methods.
		passingerPlane.landing();
	}

}
