// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);
            
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public String removeConsecutiveCharacter(String S){
        
        
        StringBuilder sb = new StringBuilder(S);
        
        for(int i=sb.length()-1; i>0; i--){
            
            if(sb.charAt(i)==(sb.charAt(i-1))){
                
                sb.deleteCharAt(i);
                
            }
            
            
        }
        
        return sb.toString();
        
        
    }
}