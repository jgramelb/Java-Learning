/*
Write a method that takes a year between 1 and 9999, Calculates if it is a leap year or not. 
If it is a leap year, return true. Otherwise return false.

A leap year is defined if the year is divisible by 4 but not by 100 OR if it is divisible by 400
*/

public class Main {
    
 public static boolean isLeapYear(int year){
     
    //Parameter year >= 1 or year <= 9999
    //If not in our range
    if (year < 1 || year > 9999){
        return false;
    }
    
    //Calculate leap year ~ 
    if ( (year % 4==0 && year%100!=0) || year % 400==0){
        return true;
    } 
    
    //In all other clases, return false
    else{
        return false;
    }
    
}
 
  public static void main(String[] args){
      System.out.println(isLeapYear(23));
      System.out.println(isLeapYear(2008));
      System.out.println(isLeapYear(0));
      System.out.println(isLeapYear(10000));
  }
  
    
}