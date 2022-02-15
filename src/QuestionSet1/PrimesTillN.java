package QuestionSet1;

import java.util.*;

public class PrimesTillN {

	public static void main(String[] args) {
		// write your code here

		Scanner sc = new Scanner(System.in);

		int low = sc.nextInt();
		int high = sc.nextInt();

		for (int i = low; i <= high; i++) {

			int ans = givePrime(i);

			if (ans != 0) {
				System.out.println(ans);
			}

		}

	}

	public static int givePrime(int number) {

		boolean b = true;

		for (int i = 2; i * i <= number; i++) {

			if (number % i == 0) {
				b = false;
				break;
			}

		}

		if (b) {
			return number;
		} else {
			return 0;
		}

	}
}