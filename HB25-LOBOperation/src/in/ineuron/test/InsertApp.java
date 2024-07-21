package in.ineuron.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.model.Jobseeker;
import in.ineuron.util.HibernateUtil;

public class InsertApp {

	public static void main(String[] args) throws Exception {

		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		byte[] photo=null;
		char[] resume=null;
		Integer id=null;
		
		//logic for copying the image data to byte[]
				try (FileInputStream fis = new FileInputStream("C:\\Images\\Nagi.JPG")) {
					photo = new byte[fis.available()];
					fis.read(photo);
				}
		
				//logic for copying the resume(TXT) data to char[]
		try {
			
			File file = new File("C:\\Test\\Demo\\abc.txt");
			try( FileReader reader = new FileReader(file)){
				    resume=new char[(int) file.length()];
				    reader.read(resume);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		try {
			session = HibernateUtil.getSession();

			if (session != null)
				transaction = session.beginTransaction();

			if (transaction != null) {
				Jobseeker seeker = new Jobseeker();
				seeker.setjName("Nagireddy Pandhiri");
				seeker.setjAdd("Hyderabad");
				seeker.setjPhoto(photo);
				seeker.setjResume(resume);
				
				id  =(Integer) session.save(seeker);
				
				flag = true;
			}

		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				transaction.commit();
				System.out.println("Object updated to database...."+id);
			} else {
				transaction.rollback();
				System.out.println("Object not updated to database...");
			}

			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}

}
