package GettingStarted;

import java.util.Scanner;

public class InverseNumber {

	public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int inverted = 0;
    int place = 1;

    while (n > 0) {
      int digit = n % 10;
      n = n / 10;
      inverted += place * Math.pow(10, digit - 1);
      place++;
    }
    System.out.println(inverted);
  }
}