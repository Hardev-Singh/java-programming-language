/**
Author: Hardev Singh
Student ID: 239690850
Lab 9
Question 1
Any and all work in this file is my own.
*/

public class Queue {
	private SingleNode head;

    public Queue() {
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

    // Method to add item in queue.
    public void enqueue(String item) throws QueueException {
        if (isEmpty()) {
            head = new SingleNode(item, head);
        } else {
            SingleNode current = head;
            for (int j = 0; j < size()-1; j++) {
                current = current.next;
            }
            current.next = new SingleNode(item, current.next);
        }
    }

    // Method to remove item at front of queue.
    public String dequeue() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("List is empty");
        }
        String removedItem;
        removedItem = head.item;
        head = head.next;
        return removedItem;
    }

    // Empty the queue.
    public void dequeueAll() {
        head = null;
    }

    // Method to get item at front of queue.
    public String peek() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("null");
        }
        SingleNode current = head;
        return current.item;
    }

    // toString method.
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        SingleNode current = head;
        while (current != null) {
            result.append(current.item);
            if (current.next != null) {
                result.append(" , ");
            }
            current = current.next;
        }
        return result.toString();
    }
	
	
	
	


}
