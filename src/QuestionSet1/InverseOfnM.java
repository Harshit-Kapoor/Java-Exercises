package QuestionSet1;
import java.util.*;

public class InverseOfnM {

	public static void main(String[] args) {
	  // write your code here  

	    Scanner sc = new Scanner(System.in);

	    int n = sc.nextInt();
	    int temp = n;

	    int size = 0;

	    while(temp>0){
	      temp = temp/10;
	      size++;
	    }

	    double sum = 0;

	    for(int i=1; i<=size; i++){

	      int counter = 1;

	      int d = n % 10;
	      n = n / 10;
	      
	      System.out.println(d);

	      sum = sum + i * (int)Math.pow(10, d - 1); 
	      	      
	      System.out.println(sum);	
	    }

	 }
	}
