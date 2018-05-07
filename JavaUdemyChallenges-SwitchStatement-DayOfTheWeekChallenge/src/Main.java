/*
Write a method with the name printDayOfTheWeek, one parameter of type int called day 
Method should not return any value
Using a switch statement print Sunday, Monday,..., Saturday if the int parameter day is 0,1,...,6 respectively
Otherwise, print invalid day
--

Write a second solution using if then else, instead of switch
*/


public class Main {
  public static void printDayOfTheWeek(int day){
    int switchValueDay = day;
    
    switch(switchValueDay){
      case 0:
        System.out.println("Sunday");
        break;
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      default:
        System.out.println("Invalid Day");
        break;
    }
  }
  public static void ifElsePrintDayOfTheWeek(int day){
    if (day == 0){
      System.out.println("Sunday");
    }
    else if (day == 1){
      System.out.println("Monday");
    }
    else if (day == 2){
      System.out.println("Tuesday");
    }
    else if (day == 3){
      System.out.println("Wednesday");
    }
    else if (day == 4){
      System.out.println("Thursday");
    }
    else if (day == 5){
      System.out.println("Friday");
    }
    else if (day == 6){
      System.out.println("Saturday");
    }
    else{
      System.out.println("Invalid Day");
    }  

    
  }
  public static void main(String[] args) {
    System.out.println("SWITCH SOLUTION: ");
    printDayOfTheWeek(-1);
    printDayOfTheWeek(2);
    printDayOfTheWeek(3);
    printDayOfTheWeek(8);
    System.out.println("IF ELSE SOLUTION: ");
    ifElsePrintDayOfTheWeek(-1);
    ifElsePrintDayOfTheWeek(2);
    ifElsePrintDayOfTheWeek(8);
  }
}