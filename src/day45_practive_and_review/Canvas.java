package day45_practive_and_review;

import java.util.*;

public class Canvas {

	public static void main(String[] args) {
		Course course1 = new Course();
		course1.setName("Java Programming");

		List<String> Javateachers = new ArrayList<>();
		Javateachers.add("Vasyl");
		Javateachers.add("Murodil");
		Javateachers.add("Muhtar");
		Javateachers.add("Marufjon");

		course1.setTeachers(Javateachers);
		System.out.println(course1.toString());
		
		List<String> studentsBatch11 = new ArrayList<>();
		studentsBatch11.add("Dina");
		studentsBatch11.add("Olim");
		studentsBatch11.add("Samir");
		studentsBatch11.add("Ivan");
		studentsBatch11.add("Sung");
		
		course1.setStudents(studentsBatch11);
		System.out.println(course1.toString());
		
		//if i want to add one teacher and student
		
		course1.addStudent("Kate");
		course1.addTeacher("Maria");
		if(course1.getTeachers().contains("Maria")) {
		System.out.println("Maria is a teacher");
		}else {
			System.out.println("Maria is not a teacher");
		}
		
		if(course1.getStudents().contains("Kate")){
			System.out.println("Kate is a student");
		}
		
		
		course1.removeTeacher("Murodil");
		course1.removeStudent("Olim");
		
		if(!course1.getStudents().contains("Olim")) {
			System.out.println("Student Olim has been removed from the list");
		}else {
			System.out.println("You havent removed Olim from the class yet");
		}
		
		if(!course1.getTeachers().contains("Murodil")) {
			System.out.println("Murodil has been removed successfully");
		}else {
			System.out.println("Murodil is still a teacher");
			
		}
	}
}
