/**
Author: Hardev Singh
Student ID: 239690850
Lab 9
Question 1
Any and all work in this file is my own.
*/

public class QueueTest {
	public static void main(String[] args) {
		try {
			Queue queueList = new Queue();

			// Inserting items into the queue.
			queueList.enqueue("Hardev");
			System.out.println(queueList);

			queueList.enqueue("Jhon");
			System.out.println(queueList);
			
			queueList.enqueue("Alen");
			System.out.println(queueList);
			
			queueList.enqueue("Max");
			System.out.println(queueList);
			
			queueList.enqueue("Ram");
			System.out.println(queueList);
			
			queueList.enqueue("Albert");
			System.out.println(queueList);
			
			queueList.enqueue("Emma");
			System.out.println(queueList);
			
			queueList.enqueue("Peter");
			System.out.println(queueList);
			
			queueList.enqueue("Simon");
			System.out.println(queueList);
			
			queueList.enqueue("Krick");
			System.out.println(queueList);

			// Removing items from the queue
			queueList.dequeue();
			System.out.println(queueList);

			queueList.dequeue();
			System.out.println(queueList);
		} 
		catch (QueueException e) {
			System.err.println("QueueException: " + e.getMessage());
			System.err.flush();
		}
	}

}
