package QuestionSet1;

import java.util.*;

public class GradingSystem {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n > 90){
            System.out.print("excellent");
        }else if(n > 80 && n <= 90){
            System.out.print("good");
        }else if(n > 70 && n <= 80){
            System.out.print("fair");
        }else if(n > 60 && n <= 70){
            System.out.print("meets expectations");
        }else if(n <= 60){
            System.out.print("below par");
        }
    }
}
