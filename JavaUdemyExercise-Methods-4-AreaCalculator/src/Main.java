/*
Write a method named Area with a parameter of type double named radius.
Method needs to return a double value that represents the area of a circle. 
If radius <0, return -1 (to rep an invalid value).

Write another overloaded methods with 2 parameters of type double, x and y, where they represent sides of a rectangle
*/
public class Main {
  
  public static double Area(double radius){
    if (radius<0){
      return -1;
    }
    //Return area of a circle
    else{
      double area = Math.PI * Math.pow(radius, 2); 
      return area;
    }
    
  }
  
  public static double Area(double x, double y){
    if (x<0 || y<0){
      return -1;
    }
    //Return area of a rectangle
    else {
      double area = x * y;
      return area;
    }
    
  }
  
  
  public static void main(String[] args) {
    //Print area of a circle
    System.out.println(Area(-1));
    System.out.println(Area(0));
    System.out.println(Area(1));
    //Print area of a rectangle
    System.out.println(Area(0,0));
    System.out.println(Area(-1,1));
    System.out.println(Area(1,-1));
    System.out.println(Area(-1,-1));
    System.out.println(Area(1,1));
  }
  
}