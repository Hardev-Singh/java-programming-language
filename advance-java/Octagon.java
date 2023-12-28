public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
 
 private double side;

 //Construct a Octagon of a side 0.
 public Octagon() {
   this(0.0);
 }

 //Construct a Octagon of a specified side
 public Octagon(double side) {
  this.side = side;
 }

 // Set new side value
 public void setSide(double side) {
  this.side = side;
 }

 // Return side value
 public double getSide() {
  return side;
 }

 // Return the area of Octagon.
 public double getArea() {
  return (2 + 4 / Math.sqrt(2)) * side * side;
 }

 // Return the perimeter of Octagon.
 public double getPerimeter() {
  return 8 * side;
 }

 // Implement compareTo method.
 @Override 
 public int compareTo(Octagon o) {
  if (getArea() > o.getArea())
   return 1;
  else if (getArea() < o.getArea())
   return -1;
  else
   return 0;
 }

 // Override the protected clone in method.
 @Override 
 public Object clone() throws CloneNotSupportedException {
  return super.clone();
 }
}