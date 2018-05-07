/*
Create a method that counts how many prime numbers there are in a given range. 
If it is a prime number, print it out && increment a count of the number of prime numbers found 

Bonus: If that count is 3, exit the for loop 
*/

public class Main {
  
  public static boolean isPrime(int num){
    if (num < 0) {
    	return false;
    }
    if (num == 1){
    	return false;
    }
    //Faster algorithm
    for (int i=2; i <= (long) Math.sqrt(num); i++){
       if(num%i ==0){
         return false;
       }
     }
    /*for (int i=2; i <= num/2; i++){
      if(num%i ==0){
        return false;
      }
    }*/
    return true;
  }
  public static String countPrimes(int startingNumber, int endingNumber){
    int count = 0;
    //We will be printing out a string with all of the prime numbers from startingNumber to endingNumber. 
    //We will also be printing out the count - CALL IT primeNumbers
    String primeNumbers = "";
    for (int i=startingNumber; i <= endingNumber; i++){
    //If the count is 5, please exit. 
      if (count == 5){
        break;
      }
      //Algorithm for counting all of the primes
      if (isPrime(i)){
        count = count + 1;
        primeNumbers = primeNumbers + "Number " + i + " is a prime number. \n";
      }
    }
    String primeNumbersWithCount = primeNumbers + "\nThere are a total of " + count + " prime numbers from " + startingNumber + " to " + endingNumber;
    return primeNumbersWithCount;
  }
  public static void main(String[] args) {
    System.out.println(countPrimes(-9,23));
  }
}