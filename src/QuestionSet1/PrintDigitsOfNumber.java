package QuestionSet1;

import java.util.*;

public class PrintDigitsOfNumber {

public static void main(String[] args) {
  // write your code here  

  Scanner sc = new Scanner(System.in);

  int n = sc.nextInt();

  List<Integer> lst = new ArrayList<Integer>();

  while(n > 0){

     int d = n%10;
     lst.add(d);
     n = n / 10;
     
  }

  for(int i=lst.size()-1; i>=0; i--){

     System.out.println(lst.get(i));  

  }


 }
}