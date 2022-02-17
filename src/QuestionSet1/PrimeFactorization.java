package QuestionSet1;
import java.util.*;

public class PrimeFactorization {

public static void main(String[] args) {
  // write your code here  
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 int counter = 2;

 while(n != 1){

    if(n % counter == 0){
       n = n / counter;
       System.out.print(counter + " ");
    }else{
      counter++;
    }     
   
 } 
 }
}