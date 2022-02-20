package QuestionSet1;
import java.util.*;

public class Pythogras {

public static void main(String[] args) {
  // write your code here  

  Scanner sc = new Scanner(System.in);

  int a = sc.nextInt();
  int b = sc.nextInt();
  int c = sc.nextInt();
  int sum = 0;

  if(a >= b && a >= c){
    sum = b*b + c*c;
    if(a*a == sum){
        System.out.print("true");
    }else{
        System.out.print("false");
      }
  }else if(b >= a && b >= c){
      sum = a*a + c*c;
      if(b*b == sum){
        System.out.print("true");
      }else{
          System.out.print("false");
        }
  }else{
     sum = a*a + b*b;
     if(c*c == sum){
        System.out.print("true");
     }else{
         System.out.print("false");
       }
  }

 }
}

