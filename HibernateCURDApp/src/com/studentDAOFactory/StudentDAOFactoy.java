package com.studentDAOFactory;

import com.jdbc.persistance.IStudentDAO;
import com.jdbc.persistance.StudentDAOImpl;

public class StudentDAOFactoy {
	
	//to avoid object creation we create private constructor
	private StudentDAOFactoy() {
		
	}
	
	//to get the object of IstudentDAO object
	public static IStudentDAO getStudentDAO() {
		IStudentDAO studentDAO=null;
		
		//Singleton approach 
		if(studentDAO==null) {
			studentDAO=new StudentDAOImpl();
		}
		return studentDAO;
	}

}
