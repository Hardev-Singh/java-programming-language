/**
Author: Hardev Singh
Student ID: 239690850
Lab 1
Question 1
Any and all work in this file is my own.
*/


public class TestClass {
    public static void main(String[] args) {
    	
        // Create array of student object of size 7.
    	Student[ ] studentObjects = new Student[7];
    	
    	// (a) Create 7 students
    	studentObjects[0] = new Student(1, "Hardev");
    	studentObjects[1] = new Student(2, "jhon");
    	studentObjects[2] = new Student(3, "Allen");
    	studentObjects[3] = new Student(4, "David");
    	studentObjects[4] = new Student(5, "Emma");
    	studentObjects[5] = new Student(6, "Ram");
    	studentObjects[6] = new Student(7, "Frank");

        // Print each student to console.
    	for(Student students : studentObjects) {
    		System.out.println(students.toString());
    	}

        // (b) Set student averages
    	for(Student students : studentObjects) {
    		students.setAverage(Math.random() * 101);
    	}

        // Print students after setting averages
    	System.out.println("\nStudents after setting averages:");
        for(Student students : studentObjects) {
    		System.out.println(students.toString());
    	}

        // (c) Create an instructor
        Instructor instructor = new Instructor(101, "Jamie Remstone,", "Computer Science");
        System.out.println("\n"+instructor.toString());

        // (d) Create two courses
        Course course1 = new Course("COSC123", "Java Programming");
        Course course2 = new Course("MATH101", "Calculus");

        // (e) Assign instructor to courses
        course1.setInstructor(instructor);
        course2.setInstructor(instructor);

        // Print courses after assigning instructor
        System.out.println("\nCourses after assigning instructor:");
        System.out.println(course1.toString());
        System.out.println(course2.toString());

        // (f) Enroll students in courses
        for(int i=0; i<5; i++) {
        	course1.enroll(studentObjects[i]);
        }
        course2.enroll(studentObjects[5]);
        course2.enroll(studentObjects[6]);

        // Print courses after enrolling students
        System.out.println("\nCourses after enrolling students:");
        System.out.println(course1.toString());
        System.out.println(course2.toString());

        // (g) Assign grades to students
        for(int i=0; i<5; i++) {
        	course1.assignGrade(studentObjects[i], 85);
        }
        course2.assignGrade(studentObjects[5], 95);
        course2.assignGrade(studentObjects[6], 89);

        // Print students after assigning grades
        System.out.println("\nStudents after assigning grades:");
        for(Student students : studentObjects) {
    		System.out.println(students.toString());
    	}
		
        // (h) Unenroll students from the first course
        course1.unenroll(studentObjects[2]);
        course1.unenroll(studentObjects[4]);

        // Print the first course after unenrolling students
        System.out.println("\nCourse 1 after unenrolling students:");
        System.out.println(course1.toString());
    }
}
