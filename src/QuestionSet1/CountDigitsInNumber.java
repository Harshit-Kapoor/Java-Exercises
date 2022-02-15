package QuestionSet1;
import java.util.*;

public class CountDigitsInNumber {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int d = 0;

    while(n > 0){
       n = n/10;
       d++;
    }     

    System.out.print(d);

 }
}