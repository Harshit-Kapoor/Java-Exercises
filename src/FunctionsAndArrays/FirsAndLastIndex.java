package FunctionsAndArrays;
import java.io.*;
import java.util.*;

public class FirsAndLastIndex {

public static void main(String[] args) throws Exception {
    // write your code here

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    int d = sc.nextInt();

    int i = 0;
    int j = arr.length-1;
    int fi = -1;

    while ( i <= j ) {
        int mid = (i+j)/2;
        if(arr[mid] > d) j = mid - 1;
        else if(arr[mid] < d) i = mid + 1;
        else{
            fi = mid;
            j = mid-1;
        }    
    }
    

     i = 0;
     j = arr.length-1;
     int li = -1;

         while ( i <= j ) {
        int mid = (i+j)/2;
        if (arr[mid] == d) {
            li = mid;
            i = mid+1;
        } else if(arr[mid] > d){
            j = mid - 1;
        } else if(arr[mid] < d){
            i = mid + 1;
        }
    }

    System.out.println(fi);
    System.out.println(li);

 }

}

