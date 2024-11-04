package all;

public class Test {

	public static void main(String[] args) {
          Gemetrics gemetric=new Gemetrics();
          Rectangle rectangle=new Rectangle();
          Circle circle=new Circle();
          Squre squre=new Squre();
          gemetric.permit(rectangle);
          gemetric.permit(squre);
          gemetric.permit(circle);
	}

}
