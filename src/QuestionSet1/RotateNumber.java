package QuestionSet1;
import java.util.*;

public class RotateNumber {

public static void main(String[] args) {
  // write your code here  

     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int temp = n;  
     int k = sc.nextInt();

     int length = 0;

     while(temp > 0){
       temp = temp / 10;
       length++;
     }

     if(k > length){
       k = k % length;
     }

     if(k < 0){
       k = k + length;
     }

     int count = length;

     for(int i=1; i<=k; i++){

       int digit = n % 10;    

       n = n / 10;

       n = n + digit * (int)Math.pow(10, count - 1);

     }

     System.out.println(n);


 }
}
