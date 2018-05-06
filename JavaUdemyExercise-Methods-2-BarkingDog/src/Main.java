/*
We have a dog that likes to bark. We need to wake up if the dog is barking at night.

Range of hours is from 0-23.
If the dog is barking before 8:00 or after 22:00, you need to wake up. (Return true)
Otherwise, you don't need to wake up. (Return false)
*/
public class Main{
 
 public static boolean bark(boolean barking, int hourOfDay){
     
    //If hour of day is less than 0 or greater than 23, return false
    if (hourOfDay < 0 || hourOfDay > 23){
        return false;
    }
    //If dog barking before 8:00 or after 22:00, return true
    if ( barking == true && (hourOfDay < 8 || hourOfDay > 22)){
        return true;
    } 
    
    //In all other classes, return false
    else{
        return false;
    }
  }
  public static void main(String[] args){
      System.out.println(bark(true,1));
      System.out.println(bark(true,-1));
      System.out.println(bark(false,-1));
      System.out.println(bark(false,8));
      System.out.println(bark(true,23));
  }
  
}