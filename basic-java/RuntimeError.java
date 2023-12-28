/*
  Program to illustrate the Runtime error.
 */
public class RuntimeError {
  public static void main(String[] args) { 
    // 
    String[] data = new String[5];
    data[5] = "More Data";
  }
}
