package QuestionSet1;

import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		// write your code here

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a = 0;
		int b = 1;
		int c = 0;

		System.out.println(a);
		System.out.println(b);

		for (int i = 0; i < n - 2; i++) {

			c = a + b;
			System.out.println(c);
			a = b;
			b = c;

		}

	}
}