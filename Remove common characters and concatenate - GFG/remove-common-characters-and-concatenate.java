// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        
        while(t--!=0){
            String s1=in.next(),
                   s2=in.next();
            
            Solution obj = new Solution();
            
            System.out.println(obj.concatenatedString(s1,s2));
        }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1,String s2)

{ 
       // Your code here
       String s="";
       String sum=s1+s2;
       int[] H1=new int[26];
       int[] H2=new int[26];
       
       for(int i=0;i<s1.length();i++){
           H1[s1.charAt(i)-97]++;
       }
       for(int i=0;i<s2.length();i++){
           H2[s2.charAt(i)-97]++;
       }
       for(int i=0;i<sum.length();i++){
           if(H2[sum.charAt(i)-97]==0){
               s+=sum.charAt(i);
           }else if(H1[sum.charAt(i)-97]==0){
               s+=sum.charAt(i);
           }
       }
       if(s==""){
           return "-1";
       }else{
           return s;
       }
   }
}

//     {
//         // Your code here
        
//         int[] ch = new int[126];
        
//         String ans = "";
        
//         for(int i=0; i<s1.length(); i++){
            
//             ch[s1.charAt(i)]++;
            
//         }
        
//         for(int i=0; i<s2.length(); i++){
            
//             if(ch[s2.charAt(i)] != 0){
                
//                 ch[s2.charAt(i)] = 0;
                
//             } else{
                
//                 ch[s2.charAt(i)]++;
                
//             }
            
//         }
        
//         for(int i=0; i<ch.length; i++){
            
//             if(ch[i] != 0){
                
//                 ans = ans + (char)i + "";
                
//             }
            
//         }
        
//         if(ans.equals("")){
//             return "-1";
//         }
        
//         return ans;
        
//     }
// }
