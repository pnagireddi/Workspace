package polymorphisam;

/* In this Example we will see how we can achieve run time polymorphisam that means one method can do many 
 * operations . means by using one method we can invoke all child class methods */

class Plane1 {
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
class Cargoplane1 extends Plane1{
	
	// override method 
	public void fly() {
		System.out.println("cargo plane fly little low height");
	}
	
}
class PassingerPlane1 extends Plane1{
	
	//override method
	public void fly() {
		System.out.println("Passenger plane fly little high height");
	}
}

class Airport {
	
	// here using one method we can call all child class methods of plane .this is the way to achieve
	//  run time polymorphisam.
	public void permit(Plane1 plane) {
		plane.fly();
		plane.takeOff();
		plane.landing();
	}
}

public class LanuchPloymarphisam {

	public static void main(String[] args) {
		Plane1 cargoplane = new Cargoplane1();
		Plane1 passingerPlane = new PassingerPlane1();
		
		Airport airport=new Airport();
		airport.permit(cargoplane);
		airport.permit(passingerPlane);
	}

}
