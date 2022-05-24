package FunctionsAndArrays;
import java.io.*;
import java.util.*;


public class SubArray {
public static void main(String[] args) throws Exception {
    // write your code here

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    // int start = 0;
    // int end = 0;

    // while ( start <= end ) {

    //     if (end > arr.length) {
    //         start++;
    //         end = start; 
    //     }
    //     for (int i = start; i < end; i++) {
    //         System.out.print(arr[i] + "\t");
    //     }
    //     System.out.println();
    //     end++;

    // }

    for (int start = 0; start < arr.length; start++) {
        
        for (int end = start; end < arr.length; end++) {
            
            for (int k = start; k <= end; k++) {
            System.out.print(arr[k] + "\t");
            }

        System.out.println();

        }

    }


 }

}