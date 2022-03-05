package FunctionsAndArrays;
import java.io.*;
import java.util.*;

public class FindElement {

public static void main(String[] args) throws Exception {
    // write your code here

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    int value = sc.nextInt();

    int element = -1;

    for(int j=0; j<n; j++){
        if (arr[j] == value) {
            element = j;   
            break;
        }
    }

    System.out.println(element);

 }

}