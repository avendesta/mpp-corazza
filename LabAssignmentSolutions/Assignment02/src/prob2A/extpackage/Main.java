package prob2A.extpackage;

import prob2A.GradeReport;
import prob2A.Student;

public class Main {

	public static void main(String[] args) {
		// From Student
		Student s1 = new Student("Paul");
		GradeReport g1 = s1.getGradeReport();
		System.out.println("Student name: " + s1.getName());
		System.out.println("GradeReport owned by: " + g1.getStudent().getName());
		
//		The following causes compiler error, because GradeReport can only be created through student
//		GradeReport g2 = new GradeReport(new Student("Paul"));  
	}

}
