package in.ineuron.test;

import in.ineuron.dao.ITransferDao;
import in.ineuron.dao.TranferDaoImpl;
import in.ineuron.util.MysqlHibernateUtil;
import in.ineuron.util.OracleHibernateUtil;

public class InsertCopyData {

	public static void main(String[] args) {
		
		ITransferDao daoImpl = new TranferDaoImpl();
		System.out.println( daoImpl.transferById(10));
		
		OracleHibernateUtil.closeSessionFactory();
		MysqlHibernateUtil.closeSessionFactory();
		
	}

	

}
