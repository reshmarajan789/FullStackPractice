package com.lti.training.bootApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lti.training.bootApp.entity.Student;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
	public class HomeRestController{
	
	@GetMapping("/student")
		public List<Student> getStudents(){
			List<Student> students = new ArrayList<Student>();
			
			students.add(new Student("First", "first@mail.com"));
			students.add(new Student("Second", "second@mail.com"));
			students.add(new Student("Third", "third@mail.com"));
			students.add(new Student("Fourth", "fourth@mail.com"));
			
			return students;

		
		
		
	}
	}




