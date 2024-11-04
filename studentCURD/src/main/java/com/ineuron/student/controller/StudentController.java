package com.ineuron.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ineuron.student.entity.Student;
import com.ineuron.student.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/save")
	public String insertStudents(@RequestBody List<Student> students) {
		return service.saveStudents(students);
	}
    
	@GetMapping("/findAll")
    public List<Student> getStudents(){
    	return service.getAll();
    }
}
