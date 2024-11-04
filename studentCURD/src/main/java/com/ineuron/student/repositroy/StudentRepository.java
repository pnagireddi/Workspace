package com.ineuron.student.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ineuron.student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	

}
