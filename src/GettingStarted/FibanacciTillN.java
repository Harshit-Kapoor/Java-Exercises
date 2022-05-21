package GettingStarted;

import java.util.*;

public class FibanacciTillN{

public static void main(String[] args) {
    // write your code here

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int a = 0;
    int b = 1;

    System.out.println(a);
    System.out.println(b);

    for(int i=0; i<n-2; i++){
      int sum = a + b;
      System.out.println(sum); 
      a = b;
      b = sum;
    }


 }
}