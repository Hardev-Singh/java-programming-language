
import java.util.Date;
class Car extends Vehicle implements Drivable, Comparable<Car> {
    private String model;
    private int speed;

    // Constructor
    public Car(String color, Date dateMade, String model, int speed) {
        super(color, dateMade);
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void steer() {
        System.out.println("Turn steering wheel.");
    }

    @Override
    public String howToDrive() {
        return "Step on gas pedal.";
    }

    // Comparing speed of cars.
    @Override
    public int compareTo(Car otherCar) {
        return Integer.compare(this.speed, otherCar.speed);
    }

    // Checking model of cars are equal or not.
    @Override
    public boolean equals(Object obj) {
        Car otherCar = (Car) obj;
        return model.equals(otherCar.model);
    }
}
