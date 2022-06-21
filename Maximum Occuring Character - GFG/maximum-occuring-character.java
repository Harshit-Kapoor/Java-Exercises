// { Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}// } Driver Code Ends




class Solution
{
    //Function to find the maximum occurring character in a string.
	public static char getMaxOccuringChar(String line) {

		int[] ch = new int[126];

		for (int i = 0; i < line.length(); i++) {

			ch[line.charAt(i)]++;

		}

		int max = ch[0];

		for (int i = 0; i < ch.length; i++) {

			if (max < ch[i]) {
				max = ch[i];
			}

		}

		char c = '0';
		
		for (int i = ch.length-1; i >= 0; i--) {

			if(ch[i] == max) {
				
				c = (char)i;
				
			}

		}
		
		return c;
	}
    
}