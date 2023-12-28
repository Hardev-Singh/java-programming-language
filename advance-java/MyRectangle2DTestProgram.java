public class MyRectangle2DTestProgram{
   public static void main(String[] args) { 
    
     // class object 
     MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
     
     // Displaying area and perimeter of rectangle.
     System.out.println("Area of rectangle is: " + r1.getArea());
     System.out.println("Perimeter of rectangle is: " + r1.getPerimeter());
     
     // Displaying the results.
     System.out.println("Is points is inside this rectangle : " + r1.contains(3, 4));
     System.out.println("Is rectangle inside this rectangle : " + r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
     System.out.println("Is rectangle overlaps this rectangle : " + r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
   }
}