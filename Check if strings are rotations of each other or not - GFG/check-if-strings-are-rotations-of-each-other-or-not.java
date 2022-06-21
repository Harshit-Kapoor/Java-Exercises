// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException{
		
		//taking input using BufferedReader class
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//taking total count of testcases
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    //Reading the two Strings
		    String s1 = br.readLine();
		    String s2 = br.readLine();
		    
		    //Creating an object of class Rotate
		    Solution obj = new Solution();
		    
		    //calling areRotations method 
		    //of class Rotate and printing
		    //"1" if it returns true
		    //else "0"
		    if(obj.areRotations(s1,s2))
		    {
		        System.out.println("1");
		    }
		    else
		    {
		        System.out.println("0");
		    }
		}
	}
}// } Driver Code Ends



class Solution
{
    //Function to check if two strings are rotations of each other or not.
//     //Function to check if two strings are rotations of each other or not.
//     public static boolean areRotations(String s1, String s2 )
//     {
//         // Your code here

// 	char[] arr = s1.toCharArray();

// 	for(int i = 0; i<arr.length; i++)
// 	{

// 		 String ans = rotate(arr, i);

// 		if (ans.equals(s2)) {
//             return true;
// 		} 

// 	}
	
//         return false;

// 	}


// 	private static String rotate(char[] ch, int r) {
		
// 		String str = "";
		
// 		r = r % ch.length;

// 	    if(r < 0){r+=ch.length;}

// 		reverse(ch, 0, ch.length-1);
// 		reverse(ch, 0, r-1);
// 		reverse(ch, r, ch.length-1);
// 		for (int j = 0; j < ch.length; j++) {
// 			str = str + ch[j] + "";			
// 		}
		
// 		return str;
		
// 	}

// 	private static char[] reverse(char[] ch, int i, int j) {
		
// 		while(i < j) {
// 			int temp = ch[i];
// 			ch[i] = ch[j];
// 			ch[j] = (char) temp;
// 			i++;
// 			j--;
// 		}
		
// 		return ch;

// }
// }


private static boolean strMatch(int st, String s1, String s2, int n)
    {
        
        for(int i=0; i<n; i++)
        {
            if(s1.charAt(i)!=s2.charAt(st%n)) return false;
            st++;
        }
        
        
        return true;
        
        
    }
    
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        char st = s1.charAt(0);
        
        int n = s2.length();
        
        if(n!=s1.length()) return false;
        
        for(int i=0; i<n; i++)
        {
            if(s2.charAt(i)==st)
            {
                if(strMatch(i, s1, s2, n)) return true;
            }
        }
        
        return false;
    }
    
}