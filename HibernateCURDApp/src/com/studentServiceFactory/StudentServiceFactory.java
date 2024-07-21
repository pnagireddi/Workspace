package com.studentServiceFactory;

import com.jdbc.service.IStudentService;
import com.jdbc.service.StudentServiceImpl;

public class StudentServiceFactory {
	
	//to avoid object creation we create private constructor
	private StudentServiceFactory() {
		
	}
	
	//to get object of IstudentService
	public static IStudentService getStudentService() {
		
		IStudentService  studentService=null;
		//Singleton approach
		if( studentService==null) {
			studentService=new StudentServiceImpl();
		}
		return studentService;
		
	}

}
