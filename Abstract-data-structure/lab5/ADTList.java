/**
Author: Hardev Singh
Student ID: 239690850
Lab 5
Question 1
Any and all work in this file is my own.
*/

public class ADTList {
    private String[] array;
    private int size;

    public ADTList(int spaces) throws ListException {
        if (spaces <= 0) {
            throw new ListException("Invalid spaces. Must be a positive number.");
        }
        array = new String[spaces];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void add(String item, int i) throws ListException {
        if (i < 0 || i > size) {
            throw new ListException("Invalid index for add operation.");
        }
        if (size == array.length) {
            throw new ListException("List is full. Cannot add more items.");
        }
        for (int j = size; j > i; j--) {
            array[j] = array[j - 1];
        }
        array[i] = item;
        size++;
    }

    public String remove(int i) throws ListException {
        if (i < 0 || i >= size) {
            throw new ListException("Invalid index for remove operation.");
        }
        String removedItem = array[i];
        for (int j = i; j < size - 1; j++) {
            array[j] = array[j + 1];
        }
        size--;
        return removedItem;
    }

    // Method to empty list.
    public void removeAll() {
        size = 0;
    }

    // Method to get item at specific index.
    public String get(int i) throws ListException {
        if (i < 0 || i >= size) {
            throw new ListException("Invalid index for get operation.");
        }
        return array[i];
    }

    // Method to find item in list.
    public int find(String item) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    // toString Method using string builder.
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append(array[i]);
            if (i < size - 1) {
                result.append(", ");
            }
        }
        return result.toString();
    }
}


