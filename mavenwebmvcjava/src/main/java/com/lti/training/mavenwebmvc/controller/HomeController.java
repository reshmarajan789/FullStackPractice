package com.lti.training.mavenwebmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lti.training.mavenwebmvc.entity.Student;


@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	public String home() {
		return "index";
		}
	
	@GetMapping("/student")
	public String studentData(Model model){
{
	Student student=new Student("Reshma","arreshmarajan@gamil.com");
	model.addAttribute("student",student) ;
	return "Student-view";	
	}

	}
	
	/*
	 * @GetMapping("/student") public ModelAndView studentData() { // logic to
	 * process request Student student = new Student("First", "first@mailcom");
	 * ModelAndView mv = new ModelAndView("student-view"); mv.addObject("student",
	 * student); // return view page name back return mv; }
	 */
}
