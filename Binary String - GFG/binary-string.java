// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static Scanner sc = new Scanner(System.in);
	public static void main (String[] args){
        int t;
    	t=sc.nextInt();
    	sc.nextLine();
    	while((t--)!=0){
    	    int n=sc.nextInt();
    	    sc.nextLine();
    	    String s = new String();
    	    s=sc.nextLine();
    	    Solution obj = new Solution();
    	    System.out.println(obj.binarySubstring(n, s));
    	}
	}
}// } Driver Code Ends




class Solution
{
    //Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(int a, String str)
    {
        // Your code here
        
        // int count = 0;
        
        // for(int i=0; i<str.length(); i++){
            
        //     for(int j=i+1; j<=str.length(); j++){
                
        //         if(str.substring(i, j).charAt(0) == '1' && str.substring(i, j).charAt(str.substring(i, j).length()-1) == '1'  && str.substring(i, j).length() > 1){
                    
        //             count++;
                    
        //         }
                
        //     }
            
        // }
        
        // return count;
        
       int len=str.length();
       int count=0;
       for(int i=0;i<len;i++)
       {
           
           if(str.charAt(i)=='1')
           {
               count++;
           }
       }
       
       return count*(count-1)/2;
        
    }
}