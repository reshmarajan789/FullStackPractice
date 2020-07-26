package com.lti.training.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Application {
	
	
//to extract the name and activities of all students in repository whose grade>2 and gpa>3.5 using Map.
	//Used all 3 predefined functional interface(consumer,predicate and function)
	//there is no Bisupplier
	static BiConsumer<Student,Student>displayNames=(s,s1)->System.out.println(s.getName());
	static BiConsumer<Student,Student>displayActivities=(stud,stud1)->System.out.println(stud.getActivities());
	static BiPredicate<Student,Student>filterOnGrade=(stud,stud1)->stud.getGrade()>2;
	static BiPredicate<Student,Student>filterOnGpa=(stud,stud1)->stud.getGpa()>=3.5;
	static BiFunction<Student, Student, Boolean> applyOnStudent=(s,s1)->s.getName().equals("Lopez");
	
	 
	public static Boolean StudentApplier()
	{
		return true;
			
		}
	
	 public static void displayNameAlone() {
	 StudentRepository.getStudentDetails().forEach(displayNames);
			 
	 }
	 
	 
	 static boolean  displayBasedOnGpa(Student stud) {
		 if(stud.getGpa()>=3.5)	 
			 		return true;
		 			return false;
				  
	 }
	 
	 public static void displayNamesAndActivitiesOfAllBasedOnGrade() {
		 
		 StudentRepository.getStudentDetails().forEach((stud,stud1)->{
			 if(filterOnGrade.and(filterOnGpa).test(stud,stud1)) {
				 displayNames.andThen(displayActivities).accept(stud,stud1);
				}
			 
		 });
		 
	 }
	 

	public static void main(String[] args) {{
			
		displayNameAlone();
		displayNamesAndActivitiesOfAllBasedOnGrade();
		StudentApplier();
	}
		
		
	}

}
