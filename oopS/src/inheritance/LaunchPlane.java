package inheritance;

class Plane {
	public void fly() {
		System.out.println("Plane will fly");
	}
	public void takeOff() {
		System.out.println("plane will takeoff");
	}
	public void landing() {
		System.out.println("plane will land");
	}
}
class CargoPlane extends Plane{
	
	// Overridden method
	public void fly() {
		System.out.println("cargo plane will fly low height");
	}
	//Specific method
	public void carryGoods() {
		System.out.println("cargo plane will carry goods");
	}
	
}
class PassengerPlane extends Plane{
	// Overridden method
	public void fly() {
		System.out.println("passenger plane fly high height");
	}
	//Specific method
	public void carryPassengers() {
		System.out.println("passenger palne carry passengers");
	}
	
}

public class LaunchPlane {
	public static void main(String[] args) {
		CargoPlane cargo=new CargoPlane();
		//Inherited method
		cargo.takeOff();
		//Overridden method
		cargo.fly();
		//specific method
		cargo.carryGoods();
		//Inherited method
		cargo.landing();
		
		PassengerPlane PassengerPlane=new PassengerPlane();
		//Inherited method
		PassengerPlane.takeOff();
		//Overridden method
		PassengerPlane.fly();
		//specific method
		PassengerPlane.carryPassengers();
		//Inherited method
		PassengerPlane.landing();
		
		
	}

}
