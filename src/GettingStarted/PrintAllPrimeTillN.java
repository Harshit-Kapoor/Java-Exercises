package GettingStarted;

import java.util.*;

public class PrintAllPrimeTillN{
    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int begin = sc.nextInt();
        int end = sc.nextInt();       

        for (int i = begin; i <= end; i++) {
            
            isPrime(i);

        }
    }

    public static void isPrime(int num){

        boolean b = false;

        for (int i = 2; i < num/2; i++) {
            if (num%i == 0) {
                b = true;
                break;
            }
        }

        if (b == false) {
            System.out.println(num);
        } 

    }

}