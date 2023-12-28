/**
Author: Hardev Singh
Student ID: 239690850
Lab 1
Question 1
Any and all work in this file is my own.
*/

public class Course {
	private static final int MAX_ENROLLED_STUDENTS = 5;
    private String courseCode;
    private String courseName;
    private Instructor instructor;
    private Student[] students;
    private int enrollment;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.students = new Student[MAX_ENROLLED_STUDENTS];
        this.enrollment = 0;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    // Method for enrolling students to course.
    public void enroll(Student student) {
        if (enrollment < MAX_ENROLLED_STUDENTS) {
            students[enrollment] = student;
            enrollment++;
        } else {
            System.out.println("Cannot enroll more students. The course is full.");
        }
    }

    // Method to unenroll the students from the course.
    public void unenroll(Student student) {
        boolean found = false;
        for (int i = 0; i < enrollment; i++) {
            if (students[i].equals(student)) {
                // Remove the student and shift remaining students to the left
                for (int j = i; j < enrollment - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[enrollment - 1] = null;
                enrollment--;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found in the course.");
        }
    }

    // Assign Grade to the student.
    public void assignGrade(Student student, double grade) {
        student.setAverage((student.getAverage() + grade) / 2);
    }

    @Override
    public String toString() {
        return "Course[code=" + courseCode + ", name=" + courseName +
               ", instructor=" + instructor.getName() +
               ", enrolled=" + enrollment + "]";
    }

}
