/*
Create a method called getDurationString that has two parameters: minutes and seconds

Validate minutes >=0; Validate seconds >=0 and <=59
If not, return invalid value

IF parameters valid, calculate how many hours, minutes, seconds equal the minutes and seconds passed to this method. 
Return in string format "XXh YYm ZZs"

Create second method same name, with only one parameter: seconds
Validate seconds >=0; If not, return invalid value
If valid, calculate how many minutes are in the seconds value and then call the other overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly

BONUS: For the input of 61 minutes, output should be "01h 01m 00s"

*/

import java.text.DecimalFormat;

class Main {
  
  public static String getDurationString(int minutes, int seconds){
    if ((minutes < 0) || (seconds< 0 ||seconds>59)){
      return "Invalid Value";
    }
    else{
      //Calculate hours with the minutes given
      int XXhr = (int) (minutes / 60);
      //Calculate remaining minutes
      int YYmin = minutes % 60;
      //Calculate seconds
      int ZZsec = seconds;
      
      
      //Print format "XXh YYm ZZs"
      //String calculateTime = XXhr + "hr " + YYmin + "m " + ZZsec + "s";
      return String.format("%02dh %02dm %02ds", XXhr,YYmin,ZZsec);
    }
    
  }
  
   public static String getDurationString(int seconds){
    if (seconds < 0){
      return "Invalid Value";
    }
    else{
      //Calculate minutes with the seconds given
      int YYmin = (int)(seconds / 60);
      //Calculate remaining seconds
      int ZZsec = seconds % 60;
      
      //Return method (print format "XXh YYm ZZs")
      return getDurationString(YYmin, ZZsec);
    }
    
  }
  public static void main(String[] args) {
    //Test the method taking in both minutes and seconds
    System.out.println(getDurationString(59,0));
    System.out.println(getDurationString(1000,34));
    System.out.println(getDurationString(-12,30));
    System.out.println(getDurationString(-12,60));
    System.out.println(getDurationString(59,-1));
    System.out.println(getDurationString(59,60));
    //Test the method only taking in the seconds
    System.out.println(getDurationString(40));
    System.out.println(getDurationString(401141));
    System.out.println(getDurationString(-1));
    //Test the method taking in both minutes and seconds with 01h 01m 01s format!
    System.out.println(getDurationString(-1,4));
    System.out.println(getDurationString(61,4));
    System.out.println(getDurationString(2,4));
    
  }
}