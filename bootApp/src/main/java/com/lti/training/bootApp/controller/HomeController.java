package com.lti.training.bootApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lti.training.bootApp.entity.Student;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(Model model) {
	
	 List<Student> students=new ArrayList<Student>();	
	students.add(new Student("Reshma","arreshmarajan@gmail.com"));
	students.add(new Student("Lopez","Lopez@gmail.com"));
	students.add(new Student("Twinkle","Twinkle@gmail.com"));
	students.add(new Student("Bipin","Bipin@gmail.com"));
	students.add(new Student("Laz","Laz@gmail.com"));
	model.addAttribute("students", students);
	return "index";
	}
	
	
	

}
