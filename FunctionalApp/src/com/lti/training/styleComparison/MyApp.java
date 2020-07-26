package com.lti.training.styleComparison;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;



public class MyApp {
	
	static Consumer<Employee> display=emp->System.out.println(emp.getName());
	

	
	static Predicate<Employee> filterOnCredit=emp->emp.getCredit_score()>2;
	static Predicate<Employee> filterOnCareer_level=MyApp ::filterEmployeeOnCareer;
			static Consumer<Employee> DisplayRoles=emp->System.out.println(emp.getRoles());
			
			static boolean filterEmployeeOnCareer(Employee employee)
			{
				if(employee.getCareer_level()>11)
					return true;
				return false;
				
			}
	
	
public static void dipslayNames()


{
	EmployeeRepository.getEmployeedetails().forEach(display);
	}
	
	
/*
 * public static void displayNamesAndActivitiesOfAllBasedOnGrade() {
 * 
 * EmployeeRepository.getEmployeedetails().forEach(emp -> {
 * if(filterOnCredit.and(MyApp :: filterEmployeeOnCareer).test(emp)) {
 * displayName.andThen(DisplayRoles).accept(emp); } });

				
	} */	
	
	
	
	
	//1.Basic coding to to Display the hardcoded Employee values.
	
	public static void main(String[] args) {
		
		/*1.
		 * Employee emp1= new Employee(1,"Reshma",5,"software engineer"); Employee emp2=
		 * new Employee(2,"Reshini",5,"software engineer"); Employee emp3= new
		 * Employee(3,"Reshu",5,"software engineer"); Employee emp4= new
		 * Employee(4,"Reshnu",5,"software engineer"); Employee emp5= new
		 * Employee(5,"Reshy",5,"software engineer");
		 
		
	Employee emp=new Employee();
	System.out.println("Employee_ID is :" +emp1.getId());
	System.out.println("Employee_Name is :"+emp1.getName());
	System.out.println("Employee_credit score is :"+emp1.getCredit_score());
	System.out.println("Employee_Designation is :"+emp1.getDesignation());
	
	}1.*/

	//displayNamesAndActivitiesOfAllBasedOnGrade();
		dipslayNames();
		





	}

}


