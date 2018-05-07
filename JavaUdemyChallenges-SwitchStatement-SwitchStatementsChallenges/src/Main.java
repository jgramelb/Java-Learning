/*
Create a new switch statement using char instead of int 
Create a new char variable
Create a switch statement testing for A,B,C,D, or E 
Display a message if any of these are found and then break
Add a default which displays a message saying not found
*/


public class Main {
  public static void main(String[] args) {
    char switchChar = 'e';
    
    switch(Character.toUpperCase(switchChar)){
      case 'A': case 'B': case 'C': case 'D': case 'E':
        System.out.println(Character.toUpperCase(switchChar) + " Found");
        break;

      default:
        System.out.println(Character.toUpperCase(switchChar) + " Not Found");
        break;
    }
  }
}