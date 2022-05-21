package GettingStarted;
import java.util.*;

public class PrintDigitsFromStarting {

public static void main(String[] args) {
  // write your code here  

  Scanner sc = new Scanner(System.in);

  int n = sc.nextInt();

  int temp = n;
  int size = 0;

  while ( temp > 0 ) {
    size++;
    temp/= 10;
  }

  while ( size > 0 ) {
    
    System.out.println(n / (int)Math.pow(10, size-1));
    n = n % (int)Math.pow(10, size-1); 
    size--;

  }


 }
}