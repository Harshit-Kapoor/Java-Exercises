package FunctionsAndArrays;
import java.util.*;

public class AnyToAnyBase {

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int sourceBase = scn.nextInt();
    int destBase= scn.nextInt();
    int ans = convert(n, sourceBase, destBase);
    System.out.println(ans);
 }   

public static int convert(int n, int sourceBase, int destBase){
  int dec = anyBaseToDecimal(n, sourceBase);
  int dest = descimaltoanybase(dec, destBase);
  return dest;
}

public static int anyBaseToDecimal(int n, int sourceBase){

  int rem = 0;
  int count = 0;
  int ans = 0;
  while ( n > 0 ) {
     rem = n % 10;
     n = n / 10;
     ans += rem * Math.pow(sourceBase, count);
     count++;
    }
   return ans;
}

  public static int descimaltoanybase(int n, int destBase){

  int count=0;
  int ans = 0;
  while ( n > 0 ) {
    int rem = n % destBase;
    n = n / destBase;
    ans += rem * Math.pow(10, count);
    count++; 
  }
  return ans;
}
}