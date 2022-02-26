package FunctionsAndArrays;
import java.util.*;

public class AnyBaseToDecimal {

	public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    int d = getValueIndecimal(n, b);
    System.out.println(d);
 }

 public static int getValueIndecimal(int n, int b){
    // write your code here

    int count = 0;
    int rem = 0;
    int ans = 0;
    while ( n > 0 ) {
       rem = n % 10;
       n = n / 10;
       ans += rem * Math.pow(b, count);
       count++;
    }

    return ans;

 }
}