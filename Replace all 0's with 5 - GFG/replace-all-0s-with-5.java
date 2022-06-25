// { Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}// } Driver Code Ends


class GfG {
    int convertfive(int n) {
        // Your code here
        
            
    int num = 0;
    int five = 5;
    int temp = n;
    
    while(n>0){
        int rem = n%10;
        if(rem==0){
            temp = temp+five;
        }
        
        five = five*10;
        n/=10;
        
    }
    return temp;
    
}
}