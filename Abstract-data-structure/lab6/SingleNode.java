/**
Author: Hardev Singh
Student ID: 239690850
Lab 6
Question 1
Any and all work in this file is my own.
*/

public class SingleNode {
    protected String item;
    protected SingleNode next;

    // Constructor 1
    public SingleNode(String item) {
        this.item = item;
        this.next = null;
    }

    // Constructor 2
    public SingleNode(String item, SingleNode next) {
        this.item = item;
        this.next = next;
    }
}

