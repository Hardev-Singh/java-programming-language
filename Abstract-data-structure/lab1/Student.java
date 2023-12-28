/**
Author: Hardev Singh
Student ID: 239690850
Lab 1
Question 1
Any and all work in this file is my own.
*/

public class Student extends Person {

	private double average = 0.0;

    public Student(int id, String name) {
        super(id, name);
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
    	// String.format is used to display all field and double value upto 2 decimal point.
    	return String.format("Student[id=%d, name=%s, GPA=%.2f%%]", getId(), getName(), average);
    }
}
