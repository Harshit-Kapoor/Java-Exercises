package Strings;

import java.io.*;
import java.util.*;

public class StringCompression {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		// System.out.println(compression2(str));
	}
	
	public static String compression1(String str){
		// write your code here

		String s = str.charAt(0) + "";

		for (int i = 1; i < str.length(); i++) {
			
			char curr = str.charAt(i);
			char prev = str.charAt(i-1);

			if (curr != prev) {
				s = s + curr + "";
			}

		}

		return s;

	}
	
}
