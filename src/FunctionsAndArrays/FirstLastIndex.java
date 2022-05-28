package FunctionsAndArrays;

import java.io.*;
import java.util.*;

import java.io.*;
import java.util.*;

public class FirstLastIndex{

public static void main(String[] args) throws Exception {
    // write your code here

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    int d = sc.nextInt();

    int low = 0;
    int high = n-1;
    int fi = -1;
    int li = -1;

    while ( low <= high ) {
        
        int mid = (low+high)/2;

        if (arr[mid] == d) {
            fi = mid;
            high = mid-1;
        } else if (arr[mid] < d){
            low  = mid+1;
        } else if(arr[mid] > d){
            high = mid-1;
        }

    }

    low = 0;
    high = n-1;

    while ( low <= high ) {
        
        int mid = (low+high)/2;

        if (arr[mid] == d) {
            li = mid;
            low  = mid+1;            
        } else if (arr[mid] < d){
            low  = mid+1;
        } else if(arr[mid] > d){
            high = mid-1;
        }

    }

    System.out.println(fi);
    System.out.println(li);


 }

}

