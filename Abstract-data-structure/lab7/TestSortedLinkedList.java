/**
Author: Hardev Singh
Student ID: 239690850
Lab 7
Question 1
Any and all work in this file is my own.
*/

public class TestSortedLinkedList {
    public static void main(String[] args) {
        try {
            SingleSortedLinkedList myList = new SingleSortedLinkedList();

            // Inserting names into the list.
            myList.insert("Alice");
            System.out.println(myList);

            myList.insert("Bob");
            System.out.println(myList);

            myList.insert("Charlie");
            System.out.println(myList);

            myList.insert("David");
            System.out.println(myList);

            myList.insert("Ram");
            System.out.println(myList);

            myList.insert("William");
            System.out.println(myList);

            myList.insert("Grace");
            System.out.println(myList);

            myList.insert("Henry");
            System.out.println(myList);

            myList.insert("Ana");
            System.out.println(myList);

            myList.insert("Jack");
            System.out.println(myList);

            // Removing names from the list.
            myList.remove(2);
            System.out.println(myList);

            myList.remove(4);
            System.out.println(myList);

            myList.remove(7);
            System.out.println(myList);

        } catch (LinkedListException e) {
        	System.err.println("LinkedListException: " + e.getMessage());
            System.err.flush();
        }
    }
}

