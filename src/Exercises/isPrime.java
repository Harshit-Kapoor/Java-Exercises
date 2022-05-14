import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      // write ur code here
  
      int t = scn.nextInt();

      for (int i = 0; i < t; i++) {

        int n = scn.nextInt();
        
        isPrime(n);
      }
   }

  public static void isPrime(int n){

    boolean b = false;

    for (int i = 2; i <= n/2; i++) {
      if (n % i == 0) {
        b = true;
        break;
      } 
    }

    if (b) {
      System.out.println("not prime");
    } else {
      System.out.println("prime");
    }
  }
}