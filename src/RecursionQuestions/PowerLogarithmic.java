package RecursionQuestions;

import java.util.Scanner;

public class PowerLogarithmic {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();

		int ans = power(x, n);
		System.out.println(ans);
	}

	public static int power(int x, int n) {

		if (n == 0) {
			return 1;
		}
		
		int hans = power(x, n/2);
		
		if(n%2==0) {
			return hans*hans;
		} else {
			return hans*hans*x;
		}
		

	}

}
