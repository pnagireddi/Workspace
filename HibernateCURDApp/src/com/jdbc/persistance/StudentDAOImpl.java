package com.jdbc.persistance;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jdbc.dto.Student;
import com.jdbc.util.JdbcUtil;

//repository
public class StudentDAOImpl implements IStudentDAO {
	
	 Session session = JdbcUtil.getSession();

	@Override
	public String saveStudent(String name, Integer age, String address) {
		
		
		 Transaction  transaction = session.beginTransaction();;
		 boolean flag=false;
		 String staus="";
		try {
			 
			 
			 
			if(transaction!=null) {
				
			Student student = new Student();
			student.setName(name);
			student.setAge(age);
			student.setAddress(address);
			
			session.save(student);
			flag=true;
			
			}	 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
			if (flag) {
				transaction.commit();
				staus="sucess";
			}
			else {
				transaction.rollback();
			}
			
		}
		
		return staus;
		
	}

	@Override
	public Student getStudent(Integer id) {
		
		Student student=session.get(Student.class, id);
		if (student != null) 
			return student;
		
		else 
			return null;
	}

	@Override
	public String updateStudent(Student student) {
		 
		String status="";
		boolean flag=false;
		Transaction transaction =session.beginTransaction();
		try {
			if (transaction  != null) {
			session.merge(student);
			flag=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (flag) {
				transaction.commit();
				status="sucess";
			}
			else {
				transaction.rollback();
			}
			
		}
		return status;
	}

	@Override
	public String deleteStudent(Integer id) {
		
		Transaction transaction=session.beginTransaction();
		String status="";
		boolean flag=false;
		
		try {
			 if (transaction != null) {
				 
				session.delete(id);
				flag=true;
			}
		
		} catch (Exception  e) {
			e.printStackTrace();
		}
		finally {
			if (flag) {
				transaction.commit();
				status="sucess";
			}
			else {
				transaction.rollback();
				status="not found";
			}
			
		}
		
		return status;
	}

}
