package FunctionsAndArrays;

import java.util.*;
  
  public class DecimalToAnyBase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here

       int rem = 0;
       int count = 0;
       int ans = 0;
       while ( n > 0 ) {
           rem = n % b;
           n = n / b;
           ans += rem * Math.pow(10, count);
           count++;
       }
       return ans;
   }
  }