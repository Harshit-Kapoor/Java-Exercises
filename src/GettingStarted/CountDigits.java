package GettingStarted;

import java.util.*;

public class CountDigits{

public static void main(String[] args) {
  // write your code here  

  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();

  int count = 0;

  while ( n > 0 ) {
    count++;   
    n = n / 10;
  }

  System.out.println(count);

 }
}