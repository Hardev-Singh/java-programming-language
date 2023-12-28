
public class Course implements Cloneable {
  private String courseName;
  private String[] students = new String[100];
  private int numberOfStudents;
    
  public Course(String courseName) {
    this.courseName = courseName;
  }
  
  // Method to insert students.
  public void addStudent(String student) {
    if(students.length <= numberOfStudents){
      String[] temp = new String[numberOfStudents * 2];
      System.arraycopy(students, 0, temp, 0, numberOfStudents );
      students = temp;
    }
    students[numberOfStudents] = student;
    numberOfStudents++;
  }
  
  // Method to get students.
  public String[] getStudents() {
     String[] temp = new String[numberOfStudents];
      System.arraycopy(students, 0, temp, 0, numberOfStudents );
    return temp;
  }

  // To get number of students.
  public int getNumberOfStudents() {
    return numberOfStudents;
  }  

  // To get course name.
  public String getCourseName() {
    return courseName;
  }  
  
  // Method to remove one student.
  public void dropStudent(String student) {
    for(int i=0; i < numberOfStudents; i++){
      if(students[i].equals(student) && i == numberOfStudents -1 ){
         students[i] = "null";
         numberOfStudents -= 1;
      }
      else if(students[i].equals(student)){
        for(int j=i; j < numberOfStudents-1; j++){
          students[j] = students[j+1];
          numberOfStudents -= 1;  
        }
        break;
      }
    }
  }
  
  // Method to remove all students.
  public void clear() {
    for(int i=0; i < numberOfStudents; i++){
      students[i] = "null";
    }
    numberOfStudents = 0; 
  }
 
  // Clone method
 @Override
 public Course clone() throws CloneNotSupportedException {
  Course courseClone = (Course)super.clone();
  // Deep copy on students
  courseClone.students = students.clone();
  return courseClone;
 }
}
