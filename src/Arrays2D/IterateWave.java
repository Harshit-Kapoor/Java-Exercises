package Arrays2D;

import java.io.*;
import java.util.*;

public class IterateWave {

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

		for (int c = 0; c < m; c++) {
			if (c % 2 == 0) {
				for (int r = 0; r < n; r++) {
					System.out.println(arr[r][c]);
				}
			} else {
				for (int r = n - 1; r >= 0; r--) {
					System.out.println(arr[r][c]);
				}
			}

		}

	}

}