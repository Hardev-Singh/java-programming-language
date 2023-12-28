public class Square extends GeometricObject implements Colorable {
 private double side;

 // constructor defining side 0.
 public Square() {
   this(0.0);
 }

 // constructor defining side value.
 public Square(double side) {
  this.side = side;
 }

 // set new side value.
 public void setSide(double side) {
  this.side = side;
 }

 // get side value.
 public double getSide() {
  return side;
 }

 // get area of circle.
 @Override
 public double getArea() {
  return Math.pow(side, 2);
 }

 // interface method implement.
 @Override
 public String howToColor() {
  return "Color all four sides";
 }
}