package com.jdbc.service;

import com.jdbc.dto.Student;
import com.jdbc.persistance.IStudentDAO;
import com.studentDAOFactory.StudentDAOFactoy;


//service
public class StudentServiceImpl implements IStudentService {
	
	

	@Override
	public String saveStudent(String name, Integer age, String address) {
		IStudentDAO studentDAO = StudentDAOFactoy.getStudentDAO();
		return studentDAO.saveStudent(name, age, address);
	}

	@Override
	public Student getStudent(Integer id) {
		IStudentDAO studentDAO = StudentDAOFactoy.getStudentDAO();
		return studentDAO.getStudent(id);
	}

	@Override
	public String updateStudent(Student student) {
		IStudentDAO studentDAO = StudentDAOFactoy.getStudentDAO();
		return studentDAO.updateStudent(student);
	}

	@Override
	public String deleteStudent(Integer id) {
		IStudentDAO studentDAO = StudentDAOFactoy.getStudentDAO();
		return studentDAO.deleteStudent(id);
	}

}
