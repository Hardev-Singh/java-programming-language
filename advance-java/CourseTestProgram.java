/**
 * Auto Generated Java Class.
 */
public class CourseTestProgram {
  public static void main(String[] args) { 
    
    // Creating object of course class.
    Course course = new Course("COSC");
    
    // Adding students 
    course.addStudent("Jhon");
    course.addStudent("Michel");
    course.addStudent("Alex");
  
    // Removing student.
    course.dropStudent("Michel");
    
    // Displaying course name.
    System.out.println(course.getCourseName());
    
    // Displaying students in course.
    String students[] = course.getStudents();
    for(String student: students){
       System.out.print(student + ", ");
    }
  }
}
