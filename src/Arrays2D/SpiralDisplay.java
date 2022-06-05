package Arrays2D;

import java.io.*;
import java.util.*;

public class SpiralDisplay {

    public static void main(String[] args) throws Exception {
        // write your code here
 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();    

    int[][] arr = new int[n][m];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            arr[i][j] = sc.nextInt();
        }
    }

    int minr = 0;
    int maxr = arr.length-1;
    int minc = 0;
    int maxc = arr[0].length-1;

    int tne = n*m;

    while ( tne > 0 ) {
        
        //lw
        for (int i = minr, j = minc; i <= maxr && tne > 0; i++) {
            System.out.println(arr[i][j]);
            tne--;
        }

        minc++;

        //bw
        for (int i = maxr, j = minc; j <= maxc && tne > 0; j++) {
            System.out.println(arr[i][j]);
            tne--;
        }

        maxr--;

        //rw
        for (int i = maxr, j = maxc; i >= minr && tne > 0; i--) {
            System.out.println(arr[i][j]);
            tne--;
        }

        maxc--;

        //tw
        for (int i = minr, j = maxc; j >= minc && tne > 0; j--) {
            System.out.println(arr[i][j]);
            tne--;
        }

        minr++;


    }

 
    }

}