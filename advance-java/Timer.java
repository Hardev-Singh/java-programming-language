public class Timer {
  
  private int hours;
  private int minutes;
  private int seconds;
  
  // Default Constructor.
  public Timer(){
    this(0, 0, 0);
  }
  
  // Parameterized Constructor
  public Timer(int hours, int minutes, int seconds){
    this.hours = ((hours < 0 || hours > 24 )? 0: hours);
   this.minutes = ((minutes < 0 || minutes > 60 )? 0: minutes);
   this.seconds = ((seconds < 0 || seconds > 60 )? 0: seconds);
  }
  
  // Getters and Setters
  public void setHours(int hours){
    this.hours =  ((hours < 0 || hours > 24 )? 0: hours);
  }
  
  public void setMinutes(int minutes){
    this.minutes = ((minutes < 0 || minutes > 60 )? 0: minutes);
  }
  
  public void setSeconds(int seconds){
    this.seconds = ((seconds < 0 || seconds > 60 )? 0: seconds);
  }
  
  public int getHours(){
    return hours;
  }
  
  public int getMinutes(){
    return minutes;
  }
  
  public int getSeconds(){
    return seconds;
  }  
}

