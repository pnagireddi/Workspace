package com.ineuron.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ineuron.student.entity.Student;
import com.ineuron.student.repositroy.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	public String saveStudents(List<Student> students) {
		List<Student> saveAll = repo.saveAll(students);
		if(saveAll.size()!=0) {
			return "sucess";
		}
		return "not inserted";
	}
	
	public List<Student> getAll(){
		return repo.findAll();
	}

}
