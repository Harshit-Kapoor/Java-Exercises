package FunctionsAndArrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RotateAnArray {

	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int r = sc.nextInt();
		
		rotate(arr, r);
		
	}

	private static void rotate(int[] arr, int r) {
		
		r = r % arr.length;

	    if(r < 0){r+=arr.length;}

		reverse(arr, 0, arr.length-1);
		reverse(arr, 0, r-1);
		reverse(arr, r, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}

	private static int[] reverse(int[] arr, int i, int j) {
		
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		return arr;
		
		
	}
	
	
}
