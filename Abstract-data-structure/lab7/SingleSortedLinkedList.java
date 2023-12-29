/**
Author: Hardev Singh
Student ID: 239690850
Lab 7
Question 1
Any and all work in this file is my own.
*/

public class SingleSortedLinkedList {
    private SingleNode head;

    public SingleSortedLinkedList() {
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

    // Method to insert item sorted in ascending order in link list.
    public void insert(String item) throws LinkedListException {
        if (item == null) {
            throw new LinkedListException("Cannot insert null into the list.");
        }

        SingleNode newNode = new SingleNode(item);

        if (head == null || item.compareTo(head.item) <= 0) {
            newNode.next = head;
            head = newNode;
        } else {
            SingleNode current = head;
            while (current.next != null && item.compareTo(current.next.item) > 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Method to remove item at given index.
    public String remove(int i) throws LinkedListException {
        int size = size();
        if (i < 0 || i >= size) {
            throw new LinkedListException("Index out of bounds");
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
    public String get(int i) throws LinkedListException {
        int size = size();
        if (i < 0 || i >= size) {
            throw new LinkedListException("Index out of bounds");
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
        return -1; // Item not found
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

