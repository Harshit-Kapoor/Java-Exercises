//w.a.p to Sort elememnt in descending order
package Arrays_Lists;

import java.util.Scanner;

public class arrChallenge {

    public static void main(String[] args) {

        int[] myArr = givenNumbers(5);
        descsort(myArr);
    }

    public static int[] givenNumbers(int number){
        System.out.println("Enter the numbers \r");
        Scanner sc = new Scanner(System.in);
        int[] array = new int[number];
        for (int i=0;i<number;i++){
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static void descsort(int[] array){
        System.out.println("Descending order:-");
        int temp;
        boolean flag = true;
        while (flag){
            flag=false;
            for(int i=0; i<array.length-1; i++){
                if(array[i] < array[i+1]){
                    temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    flag=true;
                }
            }
        }

        printArray(array);
    }
}
