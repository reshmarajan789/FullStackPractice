package com.lti.training.styleComparison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeRepository {
	
	
	public static List<Employee> getEmployeedetails(){
		  List<Employee>emply=new ArrayList<Employee>();
		emply.add(new Employee(1,"Reshma",5,13,"Team lead",Arrays.asList("Scrum master","TeamLead","PPT Admin")));
		emply.add(new Employee(2,"Sini",2,12,"Senior software engineer",Arrays.asList("TeamLead")));
		emply.add(new Employee(3,"Ram",3,11,"associate engineer",Arrays.asList("PPT team")));
		emply.add(new Employee(4,"Lilly",3,13,"Team lead",Arrays.asList("Scrum master","TeamLead")));
		emply.add(new Employee(5,"LOpez",1,11,"associate engineer",Arrays.asList("Devloper","TeamLead","PPT Team")));
		return emply;
		
	
		
	}
	
	

}
