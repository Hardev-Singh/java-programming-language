/**
Author: Hardev Singh
Student ID: 239690850
Lab 6
Question 1
Any and all work in this file is my own.
*/

public class TestList {
    public static void main(String[] args) {
        try {
            SingleLinkedList myList = new SingleLinkedList();

            // Inserting items into the list
            myList.add("Milk", 0);
            System.out.println(myList);

            myList.add("Eggs", 1);
            System.out.println(myList);

            myList.add("Celery", 1);
            System.out.println(myList);

            myList.add("Bananas", 2);
            System.out.println(myList);

            myList.add("Apples", 1);
            System.out.println(myList);

            myList.add("Oranges", 3);
            System.out.println(myList);

            myList.add("Cookies", 6);
            System.out.println(myList);

            myList.add("Steak", 4);
            System.out.println(myList);

            // Removing items from the list
            myList.remove(myList.find("Celery"));
            System.out.println(myList);

            myList.remove(myList.find("Oranges"));
            System.out.println(myList);
            
            myList.removeAll();
            System.out.println(myList);
            
        } catch (ListException e) {
        	System.err.println("ListException: " + e.getMessage());
            System.err.flush();
        }
    }
}

