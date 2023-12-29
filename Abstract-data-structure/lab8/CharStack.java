/**
Author: Hardev Singh
Student ID: 239690850
Lab 8
Question 1
Any and all work in this file is my own.
*/

class CharStack {
    private char[] stackArray;
    private int top;

    public CharStack(int size) throws StackException {
        if (size <= 0) {
            throw new StackException("Stack size must be greater than zero");
        }
        stackArray = new char[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(char item) throws StackException {
        if (top == stackArray.length - 1) {
            throw new StackException("Stack is full");
        }
        stackArray[++top] = item;
    }

    public char pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty");
        }
        return stackArray[top--];
    }

    public void popAll() {
        top = -1;
    }

    public char peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty");
        }
        return stackArray[top];
    }
}
