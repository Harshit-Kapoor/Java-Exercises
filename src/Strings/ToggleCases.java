package Strings;

import java.io.*;
import java.util.*;

public class ToggleCases {

	public static String toggleCase(String str){

		// 'P' - 'A' = 'p' - 'a'	
		String s = "";


		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				char uc = (char)(str.charAt(i) - 'a' + 'A'); 
				s = s+uc+"";
			} else{
				char lc = (char)(str.charAt(i) - 'A' + 'a');
				s = s+lc+"";
			}

		}

		return s;

	}

	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}