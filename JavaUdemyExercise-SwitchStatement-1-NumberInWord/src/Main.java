/*
Write a method called printNumberInWord
This method should have one parameter called number which a whole number (type int).
This method should print the entire word for the number given, for numbers 0 to 9. Otherwise, print "other" for all other values. 
*/


public class Main {
  public static void printNumberInWord(int number){
    int switchNumber = number; 
    
    switch(switchNumber){
      case 0:
        System.out.println("ZERO");
        break;
      case 1:
        System.out.println("ONE");
        break;
      case 2:
        System.out.println("TWO");
        break;
      case 3:
        System.out.println("THREE");
        break;
      case 4:
        System.out.println("FOUR");
        break;
      case 5:
        System.out.println("FIVE");
        break;
      case 6:
        System.out.println("SIX");
        break;
      case 7:
        System.out.println("SEVEN");
        break;
      case 8:
        System.out.println("EIGHT");
        break;
      case 9:
        System.out.println("NINE");
        break;  
      default:
        System.out.println("OTHER");
        break;
    }
  }
  
  public static void main(String[] args) {
    System.out.println("SWITCH SOLUTION: ");
    printNumberInWord(-1);
    printNumberInWord(3);
    printNumberInWord(10);
  }
}