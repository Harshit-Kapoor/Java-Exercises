package GettingStarted;

import java.util.Scanner;

public class isPrime {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			
			int num = sc.nextInt();
			isPrime(num);
			
		}
		
	}
	
	public static void isPrime(int num) {
	
		boolean b = false;
		
		for(int i=2; i<num/2; i++) {
			if(num%i == 0) {
				b = true;
				break;
			}	
		}
		
		if(b == false) {
			System.out.println("is Prime");
		}else {
			System.out.println("is not Prime");
		}
		
	}
	
}
