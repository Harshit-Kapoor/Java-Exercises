package QuestionSet1;

import java.util.*;

public class BenjaminBulbs {

	public static void main(String[] args) {
		// write your code here

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int j = 1;

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = 0;
		}

		while (j != n) {
			for (int i = 0; i < n; i += j) {

				if(i % 2 == 1) {
					if (arr[i] == 0) {
						arr[i] = 1;
					} else if (arr[i] == 1) {
						arr[i] = 0;
					}									
				}else {
	
				}
			}

			j++;

		}

		for (int i = 0; i < n; i++) {
			if (arr[i] == 1) {
				System.out.println(i + 1);
			}
		}

	}
}