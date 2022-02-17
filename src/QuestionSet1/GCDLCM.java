package QuestionSet1;
//import java.util.*;
//
//public class GCDLCM {
//  public static void main(String[] args)
//  {
//    Scanner scn = new Scanner(System.in);
//    int n1 = scn.nextInt();
//    int n2 = scn.nextInt();
//    int temp1 = n1;
//    int temp2 = n2;
//
//    while (n1 % n2 != 0)
//    {
//      int remainder = n1 % n2;
//      n1 = n2;
//      n2 = remainder;
//    }
//    int gcd = n2;
//    int lcm = (temp1 * temp2) / gcd;
//
//    System.out.println(gcd);
//    System.out.println(lcm);
//  }
//}

import java.util.*;
    
    public class GCDLCM{
    
    public static void main(String[] args) {
      // write your code here  

      Scanner sc = new Scanner(System.in);

      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      int smaller = 0;
      int larger = 0;

      //to check smaller of the two
      if(num1 < num2){
        smaller = num1;
        larger = num2;
      }else{
        smaller = num2;
        larger = num1;
      }

      //GCD
      int gcd = 0;
      for(int i = smaller; i>1; i--){

         if(num1 % i == 0 && num2 % i == 0){
           gcd = i; 
           break;
         } 

      }

      //LCM
      int lcm = 0;
      for(int i = larger; i <= 2 * larger; i++){
    
          if(i % num1 == 0 && i % num2 == 0){
           lcm = i;   
           break;
         } 
    
      }

           System.out.println(gcd);
           System.out.println(lcm);

     }
    }

    
