package FunctionsAndArrays;
import java.io.*;
import java.util.*;
public class SubsetOfArray {

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }

   int max = (int)Math.pow(2, arr.length);

   for (int i = 0; i < max; i++) {
      
      int temp = i;
      String str = "";
      for (int j = arr.length-1; j >= 0; j--) {
         
         int rem = temp % 2;
         temp/=2;

         if (rem == 0) {
            str = "-" + "\t" + str;
         } else {
            str = arr[j] + "\t" + str;            
         }
      }

      System.out.println(str);

   }

    
 }

}