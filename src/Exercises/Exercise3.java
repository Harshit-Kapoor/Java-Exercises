//w.a.p to reverse an array
package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        int count =  10;
        int[] arr = readIntegers(count);
        System.out.println(Arrays.toString(arr));
        int[] reversedArr = reverse(arr);
        System.out.println(Arrays.toString(reversedArr));
    }

    public static int[] readIntegers(int count){
        System.out.println("Enter arrays elements:-");
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<count;i++){
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int[] reverse(int[] arr){
        int[] array = new int[arr.length];
        int j=0;
        for(int i=arr.length-1; i>=0; i--){
            array[j] = arr[i];
            j++;
        }
        return array;
    }
}
