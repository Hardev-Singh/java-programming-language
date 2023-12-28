/**
Author: Hardev Singh
Student ID: 239690850
Lab 1
Question 1
Any and all work in this file is my own.
*/

import java.util.Objects;

public class Person {
	private int id;
	private String name;
	
	Person(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// override equals method.
	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return id == person.id && Objects.equals(name, person.name);
    }
	
	// Print method to print person on console.
    public void printPerson(Person person) {
        System.out.println( "Person[id=" + person.id + ", name=" + person.name + "]");
    }

}
