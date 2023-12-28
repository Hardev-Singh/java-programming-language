/**
Author: Hardev Singh
Student ID: 239690850
Lab 1
Question 1
Any and all work in this file is my own.
*/

public class Instructor extends Person{

	private String department;

    public Instructor(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Instructor[id=" + getId() + ", name=" + getName() + ", department=" + department + "]";
    }
}
