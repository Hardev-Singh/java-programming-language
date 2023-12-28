/**
 * Auto Generated Java Class.
 */
public class Assignment4_Q3 {
  public static void main(String[] args) throws CloneNotSupportedException { 
    
    // Creating object of course class.
    Course course = new Course("COSC");
    
    // Adding students 
    course.addStudent("Jhon");
    course.addStudent("Michel");
    course.addStudent("Alex");
    
    // Clone course
    Course courseClone = course.clone();
    
    // Adding student to course clone.
    courseClone.addStudent("William");
  
    // Removing student.
    course.dropStudent("Michel");
    
    // Displaying course name.
    System.out.println(course.getCourseName());
    
    // Displaying students in course.
    System.out.println("The course students;");
    String students[] = course.getStudents();
    for(String student: students){
       System.out.print(student + " ");
    }
    
    // Displaying students in course clone.
    System.out.println("\nThe course clone students;");
    students = courseClone.getStudents();
    for(String student: students){
       System.out.print(student + " ");
    }
  }
}
