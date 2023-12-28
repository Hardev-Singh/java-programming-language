
class MyRectangle2D {
  
  private double x;
  private double y;
  private double width;
  private double height;
  
  // Constructor
  public MyRectangle2D(){
    this(0,0,1,1);
  }
  
  // Parameterized constructor
  public MyRectangle2D(double x, double y, double width, double height){
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }
  
  // Getters and Setters
  public void setX(double x){
    this.x = x;
  }
  
   public void setY(double y){
    this.y = y;
  }
   
    public void setWidth(double width){
    this.width = width;
  }
    
     public void setHeight(double height){
    this.height = height;
  }
     
    public double getX(){
    return x;
  }
  
    public double getY(){
    return y;
  }
   
    public double getWidth(){
    return width;
  }
    
    public double getHeight(){
    return height;
  }
     
    // Method to get area of rectangle.
     public double getArea(){
       return (width * height);
   }
     
    // Method to get parameter of rectangle.
     public double getPerimeter(){
       return 2 * (width + height);
   }
    
     // Method to check whether point is in rectangle or not.
    public boolean contains(double x, double y){
      return ((this.x < x && x < this.x + width) && (this.y < y && y < this.y + height)); 
   }
   
   // Method to check whether rectangle is inside this rectangle. 
   public boolean contains(MyRectangle2D r){
    return ((this.x <= r.getX() && (r.getX() + r.getWidth()) <= (this.x + width)) && 
           (this.y <= r.getY() && (r.getY() + r.getHeight()) <= (this.y + height))); 
   }
     
   // Method to check whether rectangle overlaps this rectangle.
   public boolean overlaps(MyRectangle2D r){
     return !contains(r) && ((this.x <= r.getX() && r.getX() <= (this.x + width)) && 
             ((this.y <= r.getY() && (r.getY() <= (this.y + height))) ||
            (this.y <= (r.getY() + r.getHeight()) && ((r.getY() + r.getHeight()) <= (this.y + height))))) ||
            ((this.x <= r.getX() + r.getWidth() && r.getX() + r.getWidth() <= (this.x + width)) && 
            ((this.y <= (r.getY() + r.getHeight()) && ((r.getY() + r.getHeight()) <= (this.y + height))) || 
            (this.y <= (r.getY() + r.getHeight()) && ((r.getY() + r.getHeight()) <= (this.y + height)))));
   }
}

  

 
 




 