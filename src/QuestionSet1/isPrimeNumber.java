package QuestionSet1;
import java.util.*;

public class isPrimeNumber {

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

      int t = scn.nextInt();

      for(int i=0; i<t; i++){

         int n = scn.nextInt(); 

         System.out.println(checkPrime(n));

      }
   }

   public static String checkPrime(int num){

     boolean b = true; 

     for(int i=2; i*i<=num; i++){

      if(num%i==0){
        b = false;
        break;
      }

     } 

      if(b){
        return "prime";
      }else{
        return "not prime";
      }
   }

}