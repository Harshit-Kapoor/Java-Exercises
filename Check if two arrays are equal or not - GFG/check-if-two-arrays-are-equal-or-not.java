// { Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;

import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long t=sc.nextLong();
		
		while(t-->0)
		{
		  int n=sc.nextInt();
		  long arr[]=new long[n];
		  long brr[]=new long[n];
		  
		  for(int i=0;i<n;i++)
		  {
		      arr[i]=sc.nextLong();
		  }
		  
		  for(int i=0;i<n;i++)
		  {
		      brr[i]=sc.nextLong();
		  }
		  Solution ob = new Solution();
		  System.out.println(ob.check(arr,brr,n)==true?"1":"0");
		  
		  
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
            // time limit exceeded        
        // for(int i=0; i<A.length; i++){
        //     for(int j=0; j<A.length-i-1; j++){
        //         if(A[j] > A[j+1]){
                    
        //             long temp = A[j];
        //             A[j] = A[j + 1];
        //             A[j + 1] = temp;
        //         }
        //     }
        // }
        
        // for(int i=0; i<B.length; i++){
        //     for(int j=0; j<B.length-i-1; j++){
        //         if(B[j] > B[j+1]){
                    
        //             long temp = B[j];
        //             B[j] = B[j+1];
        //             B[j+1] = temp;
        //         }
        //     }
        // }
        
        // int c = 0;
        
        // for(int i=0; i<A.length; i++){
            
        //     if(A[i] != B[i]){
        //         return false;
        //     }
            
        // }
    
        // return true;
        
       Arrays.sort(A);
       Arrays.sort(B);
        
        for(int i=0;i<N;i++)
        {
            if(A[i]!=B[i])
               return false;
        }
        
        return true;
        
    }
}