package arrays;

public class Launch9 {

	public static void main(String[] args) {
          Fan[] fan=new Fan[3];
          fan[0]=new Fan();
          fan[1]=new Fan();
          fan[2]=new Fan();
          fan[0].brand="Nagi";
          fan[0].cost=10000;
          fan[0].modelYear=2022;
          
          for(Fan elements:fan) {
        	  System.out.println(elements);
          }
	}

}
