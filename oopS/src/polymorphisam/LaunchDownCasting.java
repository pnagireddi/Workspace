package polymorphisam;

/* for call the child specific methods by using parent references 
 * Temporally we can convert parent reference to child reference this type
 * of conversion is called down casting*/

class Plane2 {
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
class Cargoplane2 extends Plane2{
	
	// override method 
	public void fly() {
		System.out.println("cargo plane fly little low height");
	}
	
	//Specific method
	public void carry() {
		System.out.println("cargo plane carry goods");
	}
	
}
class PassingerPlane2 extends Plane2{
	
	//override method
	public void fly() {
		System.out.println("Passenger plane fly little high height");
	}
	
	//Specific method
		public void carry() {
			System.out.println("Passinger plane carry passingers");
		}
		
}

public class LaunchDownCasting {

	public static void main(String[] args) {
       Plane2 carrgo=new Cargoplane2();
       Plane2 passinger =new PassingerPlane2();
       
       
       /* for call the child specific methods by using parent references 
        * Temporally we can convert parent reference to child reference this type
        * of conversion is called down casting*/
       ((Cargoplane2) carrgo).carry();
       
       ((PassingerPlane2) passinger).carry();  
	}

}
