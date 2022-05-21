package GettingStarted;

import java.util.*;

public class RotateNumber {

	public static void main(String[] args) {
		// write your code here

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int size = 0;
		int temp = n;

		while (temp > 0) {
			temp /= 10;
			size++;
		}

		k = k % size;
		if (k < 0) {
			k += size;
		}

		int num1 = n % (int) Math.pow(10, k);
		int num2 = n / (int) Math.pow(10, k);

		System.out.println(num1 * (int) Math.pow(10, size - k) + num2);

	}
}