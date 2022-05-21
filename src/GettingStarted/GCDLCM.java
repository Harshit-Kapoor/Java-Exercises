package GettingStarted;

import java.util.*;

public class GCDLCM {

	private static int lcm;

	public static void main(String[] args) {
		// write your code here
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int gcd = 1;

		for (int i = 2; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}

		System.out.println(gcd);

		int max = n1 > n2 ? n1 : n2;

		for (int i = max; i >= max; i++) {
			if (i % n1 == 0 && i % n2 == 0) {
				lcm = i;
				break;
			}
		}

		System.out.println(lcm);

	}
}