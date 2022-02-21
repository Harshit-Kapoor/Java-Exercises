package Patterns;

import java.util.*;

public class Pattern3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nsp = n - 1;
        int nst = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nsp; j++) {
                System.out.print("\t");
            }

            for (int j = 0; j < nst; j++) {
                System.out.print("*\t");
            }

            nsp--;
            nst++;
            System.out.println();
        }

    }
}
