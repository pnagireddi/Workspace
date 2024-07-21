package com.jdbc.controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.jdbc.dto.Student;
import com.jdbc.service.IStudentService;
import com.jdbc.util.JdbcUtil;
import com.studentServiceFactory.StudentServiceFactory;

//controller
public class TestApp {
   
	
	static {
		JdbcUtil.startUp();
	}

	public static void main(String[] args) throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println(" 1 . CREATE");
			System.out.println(" 2 . READ");
			System.out.println(" 3 . UPDATE");
			System.out.println(" 4 . DELETE");
			System.out.println(" 5 . EXIT");
			
			System.out.println("PLEASE SELECT OPTION [1/2/3/4]: ");
			String option = br.readLine();
			switch (option) {
			case "1": insertOperation();
				     break;
			case "2": selectOperation();
		             break;	
			case "3": updateOperation();
		              break;
			case "4": DeleteOperation();
		              break;
			case "5":System.out.println("************** THANKS FOR USING THIS APPLICATION *****************");
			          System.exit(0);
			          break;
			default: System.out.println("INVALID OPTION PLEASE TRY AGAIN..");
				     break;
			}
			
			
			
			
		}
        
	}
    
	
	public static void insertOperation() {
		IStudentService  studentService= StudentServiceFactory.getStudentService();
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER STUDENT NAME ::");
		String name = scanner.next();
		
		System.out.println("ENTER STUDENT AGE ::");
		Integer age = scanner.nextInt();
		
		System.out.println("ENTER STUDENT ADDRESS ::");
		String address = scanner.next();
		
		String msg = studentService.saveStudent(name, age, address);
		
		if(msg.equalsIgnoreCase("sucess")) {
			System.out.println("RECORD INSERTED SUCESSFULLY...");
		}
		else {
			System.out.println("RECORD NOT INSERTED...");
		}
		
	}
	
	public static void selectOperation() {
		IStudentService  studentService= StudentServiceFactory.getStudentService();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("ENTER STUDENT ID ::");
		Integer id = scanner.nextInt();
		
		Student student = studentService.getStudent(id);
		
		if(student != null) {
			System.out.println(student);
			System.out.println("ID\tNAME\tAGE\tADDRESS");
			System.out.println(student.getId()+"\t"+student.getName()+"\t"+student.getAge()+"\t"+student.getAddress());
			
		}
		else {
			System.out.println("RECORD IS NOT FOUND FOR GIVEN ID::"+id);
		}
		
		
	}
	
	public static  void DeleteOperation() {
		
		IStudentService  studentService= StudentServiceFactory.getStudentService();
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER STUDENT ID TO DELETE :");
		Integer id = scanner.nextInt();
		
		String msg = studentService.deleteStudent(id);
		
		if(msg.equalsIgnoreCase("sucess")) {
			System.out.println("RECORD DELETED SUCESSFULLY..");
		}
		else if(msg.equalsIgnoreCase("not found")) {
			System.out.println("RECORD WAS NOT FOUND FOR GIVEN ID:"+id);
		}
		else {
			System.out.println("Record delition faild");
		}
		
		
		
	}
	
	public static void updateOperation() throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE STUDENT ID FOR UPDATION:");
		String id = br.readLine();
		IStudentService  studentService= StudentServiceFactory.getStudentService();
		Student student = studentService.getStudent(Integer.parseInt(id));
		
		Student newStudent=new Student();
		System.out.println("STUDENT OLD ID:"+student.getId());
		newStudent.setId(student.getId());
		System.out.println("STUDENT OLD NAME : "+student.getName()+" ENTER NEW NAME ::");
		String newName = br.readLine();
		if(newName.equals("")||newName=="") {
			newStudent.setName(student.getName());
		}
		else {
			newStudent.setName(newName);
		}
		
		System.out.println("STUDENT OLD AGE: "+student.getAge()+" ENTER NEW AGE ::");
		String newAge = br.readLine();
		if(newAge.equals("")||newAge=="") {
			newStudent.setAge(student.getAge());
		}
		else {
			newStudent.setAge(Integer.parseInt(newAge));
		}
		
		System.out.println("STUDENT OLD ADDRESS :: "+student.getName()+" ENTER NEW ADDRESS ::");
		String newAddress = br.readLine();
		if(newAddress.equals("")||newAddress=="") {
			newStudent.setAddress(student.getAddress());
		}
		else {
			newStudent.setAddress(newAddress);
		}
		
		System.out.println(newStudent);
		
		String status = studentService.updateStudent(newStudent);
		
		if(status.equalsIgnoreCase("sucess")) {
			System.out.println("RECORD UPDATED SUCESSFULLY...");
		}
		else {
			System.out.println("RECORD UPDATION IS FAILD..");
		}
		
	}
}
