package com.jdbc.service;

import com.jdbc.dto.Student;

public interface IStudentService {
	
	public String saveStudent(String name,Integer age,String address);
	public Student getStudent(Integer id);
	public String updateStudent(Student student);
	public String deleteStudent(Integer id);

}
