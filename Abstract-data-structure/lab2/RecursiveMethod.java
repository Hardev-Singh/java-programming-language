/**
Author: Hardev Singh
Student ID: 239690850
Lab 2
Question 1
Any and all work in this file is my own.
*/


/*public static void downToZeroByThree(int value) {
If(value != 1) {
System.out.println(value);
downToZeroByThree(value - 3);
}
}*/

/*
(a) What happens when the statement downToZeroByThree(10) is executed? Provide the output.
 Ans: The value of 10 is decremented by 3 until it is equal to 1. The output is 10 7 4. 	 
*/

/*
(b) What happens when the statement downToZeroByThree(6) is executed? Provide the output.
 Ans: The value of 6 is decremented by 3 until it is equal to 1 but it never be equal to one. So, the output 
   is 6 3 1 -3 -6 ..... until stack is full.	 
*/

/*
(c) How can the problem be broken into multiple subproblems of the same type?
  Ans: The problem can be broken into multiple subproblems of the same type 
  by reducing the input value by 3 in each recursive call.
 */

/*
(d) How does each recursive call diminish the size of the problem?
 Ans: Each recursive call diminishes the size of the problem by subtracting 3 from the input value, 
 making the input value closer to the base case, which is 1.				
*/

/*
(e) What instance of the problem space can serve as the base case?
 Ans: The base case for this problem is when the value parameter becomes 1.
*/	

/*
(f) Will this solution always reach the base case? If not, explain why.
 Ans: No, the solution will not reach the base case because the value sometimes will not be 1 while decrementing by 3.	
*/		

/*
(g) What change can be made to make the solution correct?
 Ans: To make the solution correct, add a base case check for values less than 1 to handle invalid input.		
*/	

/*
 * (h) A recursive method is cleaner when it is in the format: 
 * public static void recursiveMethod(int parameter) { 
 * if(baseCase) return; 
 * else {
 * recursiveWork; } } 
  
 * Rewrite the downToZeroByThree method in the format provided.
 */


public class RecursiveMethod {
	public static void downToZeroByThree(int value) {
	    if (value <= 1) {
	    } else {
	        System.out.println(value);
	        downToZeroByThree(value - 3);
	    }
	}

	 public static void main(String[] args) {
		 downToZeroByThree(6);
	 }
}
