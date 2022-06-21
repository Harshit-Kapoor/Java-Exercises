// { Driver Code Starts
//saksham raj seth
import java.util.*;
class Anagrams{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			GfG g=new GfG();
			System.out.println(g.remAnagrams(s,s1));
		}
	}
}// } Driver Code Ends


/*Complete the function below*/
class GfG
{
	public int remAnagrams(String s,String s1)
        {
        //add code here.
        
        int[] farr = new int[126];
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            farr[ch]++;
        }
        
      for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            farr[ch]--;
        }
        
        int count = 0;
        
        for(int i=0; i<farr.length; i++){
            if(farr[i] != 0){
                count = count + Math.abs(farr[i]);
            }
        }
        
        return count;
        
        }
}