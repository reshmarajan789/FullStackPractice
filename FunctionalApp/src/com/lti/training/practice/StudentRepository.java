package com.lti.training.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StudentRepository {
	
	public static Map<Student, Student> getStudentDetails(){

	Map<Student, Student> mp=new HashMap<Student,Student>();
	
	Student stud1=new Student("Reshma", 2, 3.6, "Male", Arrays.asList("Swimming", "Basketball"));
	Student stud2=new Student("Meena", 2, 3.8, "Female", Arrays.asList("Swimming", "Basketball", "Gymnastics"));
	Student stud3=new Student("Lopez", 3, 4.0, "Male", Arrays.asList("Cricket", "Basketball"));
	Student stud4=new Student("Zenna", 3, 3.9, "Female", Arrays.asList("Vollyball", "Basketball"));
	Student stud5=new Student("Kite", 4, 3.3, "Male", Arrays.asList("Soccor", "Basketball"));
	Student stud6=new Student("Zinn", 4, 3.5, "Female", Arrays.asList("Swimming", "Basketball"));

	
	mp.put(stud1,stud1);
	mp.put(stud2,stud2);
	mp.put(stud3,stud3);
	mp.put(stud4,stud4);
	mp.put(stud5,stud5);
	mp.put(stud6,stud6);
	return mp;
	
	
}
}