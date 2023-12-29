/**
Author: Hardev Singh
Student ID: 239690850
Lab 6
Question 1
Any and all work in this file is my own.
*/

public class SingleLinkedList {
    private SingleNode head;

    public SingleLinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        SingleNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Method to add item in link list.
    public void add(String item, int i) throws ListException {
        int size = size();
        if (i < 0 || i > size) {
            throw new ListException("Index out of bounds");
        }

        if (i == 0) {
            head = new SingleNode(item, head);
        } else {
            SingleNode current = head;
            for (int j = 0; j < i - 1; j++) {
                current = current.next;
            }
            current.next = new SingleNode(item, current.next);
        }
    }

    // Method to remove item at given index.
    public String remove(int i) throws ListException {
        int size = size();
        if (i < 0 || i >= size) {
            throw new ListException("Index out of bounds");
        }

        String removedItem;
        if (i == 0) {
            removedItem = head.item;
            head = head.next;
        } else {
            SingleNode current = head;
            for (int j = 0; j < i - 1; j++) {
                current = current.next;
            }
            removedItem = current.next.item;
            current.next = current.next.next;
        }
        return removedItem;
    }

    // Empty the list.
    public void removeAll() {
        head = null;
    }

    // Method to get item at specific index.
    public String get(int i) throws ListException {
        int size = size();
        if (i < 0 || i >= size) {
            throw new ListException("Index out of bounds");
        }

        SingleNode current = head;
        for (int j = 0; j < i; j++) {
            current = current.next;
        }
        return current.item;
    }

    // Method to find the item in list.
    public int find(String item) {
        int index = 0;
        SingleNode current = head;
        while (current != null) {
            if (current.item.equals(item)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1; 
    }

    // toString method.
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        SingleNode current = head;
        while (current != null) {
            result.append(current.item);
            if (current.next != null) {
                result.append(" -> ");
            }
            current = current.next;
        }
        result.append(" -> null");
        return result.toString();
    }
}

