package Arrays_Lists;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[5] = 98;

        int[] newIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        int[] givenArray = new int[10];

        for (int i = 0; i < givenArray.length; i++) {
            givenArray[i] = i * 10;
        }

        printArray(givenArray);
        System.out.println("Average is"+getAverage(givenArray));
        double[] myDoubleArray = new double[10];

        int[] arrInt = givenNumbers(5);
        printArray(arrInt);
        System.out.println("Average is"+getAverage(arrInt));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " value is = " + array[i]);
        }
    }

    public static int[] givenNumbers(int numbers){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers \r");
        int arr[] = new int[numbers];
        for(int i=0; i<numbers; i++){
            arr[i] = numbers*i;
        }
        return arr;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum+=array[i];
        }
        int avg = sum/ array.length;
        return avg;
    }
}
