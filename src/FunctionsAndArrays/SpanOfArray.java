package FunctionsAndArrays;

import java.io.*;
import java.util.*;

public class SpanOfArray {

public static void main(String[] args) throws Exception {
    // write your code here

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();        
    }

    int max = Integer.MIN_VALUE;

    for (int j = 0; j < n; j++) {
        if (arr[j] > max) {
            max = arr[j];
        }
    }

    int min = Integer.MAX_VALUE;

    for (int k = 0; k < n; k++) {
        if (arr[k] < min) {
            min = arr[k];
        }
    }

    System.out.println(max - min);    

 }

}