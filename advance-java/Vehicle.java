
import java.util.Date;

// Abstract superclass
abstract class Vehicle {
    private String color;
    private Date dateMade;

    public Vehicle(String color, Date dateMade) {
        this.color = color;
        this.dateMade = dateMade;
    }

    public String getColor() {
        return color;
    }

    public Date getDateMade() {
        return dateMade;
    }

    public abstract void steer();
}