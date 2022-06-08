package RecursionQuestions;

import java.util.Scanner;

public class PowerLinear {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		int ans = power(x, n);
		System.out.println(ans);
		
    }

    public static int power(int x, int n){

    	if (n==0) {
			return 1;
		}
    	
    	int ans = x * power(x, n-1);
    	return ans;
    	
    }
	
}
