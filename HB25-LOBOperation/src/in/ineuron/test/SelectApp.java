package in.ineuron.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.model.Jobseeker;
import in.ineuron.util.HibernateUtil;

public class SelectApp {

	public static void main(String[] args) throws Exception {

		Session session = null;
		Integer id=1;
	
		try {
			session = HibernateUtil.getSession();

			if (session != null) {
				
				Jobseeker jobseeker = session.get(Jobseeker.class, id);
				
				System.out.println("Joob Seeker Id::"+jobseeker.getjId());
				System.out.println("Joob Seeker Name::"+jobseeker.getjName());
				System.out.println("Joob Seeker Address::"+jobseeker.getjAdd());
				
				try(FileOutputStream fos=new FileOutputStream("./store/Nagi.jpg");
						FileWriter fw=new FileWriter("./store/abc.txt")){
					fos.write(jobseeker.getjPhoto());
					fw.write(jobseeker.getjResume());
					System.out.println("Jobseeker photo and resume stored at path ./store");
				}
				
					
			}
			else {
				System.out.println("record is not avialable for given id"+id);
			}

			
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}

}
