package FunctionsAndArrays;
import java.util.*;

public class AnyBaseAddition {

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getSum(b, n1, n2);
    System.out.println(d);
 }

 public static int getSum(int b, int n1, int n2){

     int num1 = convertToDec(n1, b);
     int num2 = convertToDec(n2, b); 
     return convertToBase(num1+num2, b);
 }

 private static int convertToBase(int num, int b) {
	 
     int ans = 0;
     int rem = 0;
     int count = 0;

     while(num > 0){
         rem = num % b;
         num = num / b;
         ans += rem * Math.pow(10, count);
         count++;
     }
     return ans;

}

public static int convertToDec(int num, int base) {

     int ans = 0;
     int rem = 0;
     int count = 0;

     while(num > 0){
         rem = num % 10;
         num = num / 10;
         ans += rem * Math.pow(base, count);
         count++;
     }
     return ans;
 } 


}