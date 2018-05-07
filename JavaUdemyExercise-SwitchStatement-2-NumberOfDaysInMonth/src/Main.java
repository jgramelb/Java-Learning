/*
Use method isLeapYear from the LeapYearCalculator for this program. 
Write another method getDaysInMonth with two parameters month and year. Both of type int.
If parameter months <1 or >12, return -1
If parameter year < 1 or > 9999, return -1

This methodneeds to return the number of days in the month. Be careful about leap years!


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
    
    //In all other classes, return false
    else{
        return false;
    }
    
}
  public static int getDaysInMonth(int month, int year){
    
    //Parameter month >=1 or month <= 9999
    if ( month < 1 || month > 9999){
        return -1;
    }  
    //Parameter year >= 1 or year <= 9999
    if (year < 1 || year > 9999){
        return -1;
    }
    else{
      switch(month){
      case 1:
        return 31;
      case 2:
        if (isLeapYear(year) == true){
        return 29;
        }
        if (isLeapYear(year) == false){
        return 28;
        }
        else{
          break;
        }
      case 3:
        return 31;
      case 4:
        return 30;
      case 5:
        return 31;
      case 6:
        return 30;
      case 7:
        return 31;
      case 8:
        return 31;
      case 9:
        return 30;
      case 10:
        return 31;
      case 11:
        return 30;
      case 12:
        return 31;
      default:
        return -1;
    }
    }
    
    return 0;
    
}
  public static void main(String[] args) {
      System.out.println(getDaysInMonth(12,2008));
      System.out.println(getDaysInMonth(2,2008));
      System.out.println(getDaysInMonth(2,2010));
      System.out.println(getDaysInMonth(22,2020));
      System.out.println(getDaysInMonth(22,99999));
      System.out.println(getDaysInMonth(2,299990));
  }
  
}   