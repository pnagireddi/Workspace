package in.ineuron.test;

import in.ineuron.dao.IPremiumpolicyDao;
import in.ineuron.dao.PremiumPolicyDaoImpl;

public class InsertApp {
	
	public static void main(String[] args) {
		
		IPremiumpolicyDao	dao=new PremiumPolicyDaoImpl();
		String result = dao.policyCopy(16);
		System.out.println(result);
		
	}

}
