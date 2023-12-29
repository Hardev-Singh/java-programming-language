/**
Author: Hardev Singh
Student ID: 239690850
Lab 5
Question 1
Any and all work in this file is my own.
*/

public class TestADTList {
    public static void main(String[] args) {
        try {
            // (2) Create a new list and insert items
            ADTList list = new ADTList(8);
            insertAndPrint(list, "Milk");
            insertAndPrint(list, "Eggs");
            insertAndPrint(list, "Celery");
            insertAndPrint(list, "Bananas");
            insertAndPrint(list, "Apples");
            insertAndPrint(list, "Oranges");
            insertAndPrint(list, "Cookies");
            insertAndPrint(list, "Steak");

            // (3) Remove items from the list
            removeAndPrint(list, "Celery");
            removeAndPrint(list, "Oranges");

            // (4) Swap two items in the list
            swap(list, 1, 3);

            // (5) Catch exceptions
        } catch (ListException e) {
            System.err.println("Error: " + e.getMessage());
            System.err.flush();
        }
    }

    // Method to add item and then print list.
    public static void insertAndPrint(ADTList list, String item) throws ListException {
        list.add(item, list.size());
        System.out.println("List after insertion: " + list);
    }

    // Method to remove item and print list.
    public static void removeAndPrint(ADTList list, String item) throws ListException {
        int index = list.find(item);
        if (index != -1) {
            list.remove(index);
            System.out.println("List after removing " + item + ": " + list);
        } else {
            System.out.println(item + " not found in the list.");
        }
    }

    // Method to swap elements in list.
    public static void swap(ADTList list, int i, int j) throws ListException {
        if(i < 0 && i>= list.size() && j< 0 && j>= list.size() ) {
        	throw new ListException("Invalid index for get operation."); 
        }
        System.out.println("List before swap: " + list);
        int largeIndex = j, smallIndex = i;
        if(i > j) {
        	largeIndex = i;
        	smallIndex = j;    
        }
        String temp = list.remove(largeIndex);
        list.add(list.remove(smallIndex), largeIndex-1);  
        list.add(temp, smallIndex);
 
        System.out.println("List after swap: " + list);    
    }
}

