
public class Triangle extends GeometricObject {
  
  // Variables with default value 1.0
  private double side1 = 1.0;
  private double side2 = 1.0;
  private double side3 = 1.0;
  
  // Constructor.
  Triangle() throws IllegalTraingleException {
    this(0,0,0);
  }
  
  // Parameterized constructor.
  Triangle(double side1, double side2, double side3) throws IllegalTraingleException {
     if(!((side1 + side2 > side3) || (side1 + side3 > side2) || (side3 + side2 > side1))){
       // throws exception.
      throw new IllegalTraingleException("The triangle cannot be created.");
    }
    else{
    this.side1 = side1;
    this.side2 =side2;
    this.side3 = side3;
    }
  }

  // Setters and getters.
  public void setSide1(double side1){
    this.side1 = side1;
  }
  
  public void setSide2(double side2){
    this.side2 = side2;
  }
    
  public void setSide3(double side3){
    this.side3 = side3;
  }
  
  public double getSide1(){
    return side1;
  }
  
  public double getSide2(){
    return side2;
  }
    
  public double getSide3(){
    return side3;
  }
  
  // Calculating perimeter of triangle.
  public double getPerimeter(){
    return side1 + side2 + side3;
  }
  
  // Return a string description for the triangle.
  public String toString(){
   return ("The triangle " + super.toString() + "\n sides are :" +
     side1 + " " + side2 + " " + side3); 
  }
}
