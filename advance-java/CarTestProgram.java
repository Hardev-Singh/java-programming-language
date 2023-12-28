// Test program
import java.util.Date;
public class CarTestProgram {
    public static void main(String[] args) {
      
        // Car objects.
        Car car1 = new Car("Red", new Date(), "Model A", 120);
        Car car2 = new Car("Blue", new Date(), "Model A", 150);
        
        // Steer method calling.
        car1.steer();
        
        // Displaying 
        System.out.println("How to drive car 1? " + car1.howToDrive());
        System.out.println("Are car1 and car2 equal? " + car1.equals(car2));

        int comparison = car1.compareTo(car2);
        if (comparison < 0) {
            System.out.println("Car 1 is slower than Car 2.");
        } else if (comparison > 0) {
            System.out.println("Car 1 is faster than Car 2.");
        } else {
            System.out.println("Car 1 and Car 2 have the same speed.");
        }
    }
}