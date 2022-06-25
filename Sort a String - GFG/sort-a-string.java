// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0){
            String s = sc.nextLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.sort(s));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String sort(String s) 
    {
        // code here
        
        // char[] ch = s.toCharArray();
        
        // String ans = "";
        
        // for(int i=0; i<ch.length; i++){
            
        //     for(int j=0; j<ch.length - i - 1; j++){
                
        //         if(ch[j] > ch[j+1]){
                    
        //         char temp = ch[j];
        //         ch[j] = ch[j + 1];
        //         ch[j + 1] = temp;

        //         }
                
        //     }
            
        // }
        
        // for(int i=0; i<ch.length; i++){
            
        //     ans = ans + ch[i] + "";
            
        // }
        
        // return ans;
        
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
        
    }
} 