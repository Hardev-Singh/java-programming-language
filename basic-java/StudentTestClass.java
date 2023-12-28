/**
 * Auto Generated Java Class.
 */
public class StudentTestClass {
  public static void main(String[] args) {
    // Student class object creation.
    Student student = new Student("jhon", "smith", 1001);
    
    // Calling enroll method of student class.
    student.enroll("Math");
    student.enroll("English");
    student.enroll("History");
    student.enroll("Science");
    student.enroll("Art");
    
    // Calling unenroll method of student class.
    student.unEnroll("History");
  }  
}


class Student{
  private int studentNumber;
  private String major;
  private String firstName;
  private String lastName;
  private int credits = 0;
  private java.util.Date dateCreated;
  private String[] courses = new String[5];
  
  // student class constructor.
  public Student(String firstName, String lastName, int studentNumber){
    this.firstName = firstName;
    this.lastName = lastName;
    this.studentNumber = studentNumber;
    this.dateCreated = new java.util.Date();
  }
  
  // Method to enroll the student in courses.
  public void enroll(String course){
     for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = course;
                System.out.println(firstName + " " + lastName + " has been enrolled in " + course);
                return;
            }
        }
        System.out.println(firstName + " " + lastName + " cannot enroll in more courses.");   
  }
  
  // Method to unenroll the student from courses.
   public void unEnroll(String course){
      for (int i = 0; i < courses.length; i++) {
            if (courses[i] != null && courses[i].equals(course)) {
                courses[i] = null;
                System.out.println(firstName + " " + lastName + " has been unenrolled from " + course);
                return;
            }
        }
        System.out.println(firstName + " " + lastName + " is not enrolled in " + course);   
  }
}