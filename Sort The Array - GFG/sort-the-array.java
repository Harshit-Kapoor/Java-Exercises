// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 


class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt(); 
            int arr[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                arr[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int []ans= obj.sortArr(arr, n);
            for(int i=0;i<n;i++)
            {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
        
    }
}// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int[] sortArr(int[] arr, int n) 
    { 
        // code here
        
    int low = 0;
    int high = n-1;
    
    int[] ans = mergeSort(arr, low, high);
        
    return ans;   
        
    }
    
    public static int[] mergeSort(int[] arr, int low, int high){
        
        if(low == high){
            int[] base = new int[1];
            base[0] = arr[low];
            return base;
        }
        
        int mid = (low + high)/2;
        
        int[] left = mergeSort(arr, low, mid);
        int[] right = mergeSort(arr, mid+1, high);        
        
        int[] ans = mergeSortedArrays(left, right);
        
        return ans;
    }
    
    public static int[] mergeSortedArrays(int[] a, int[] b){
        
    int i = 0, j =0, k = 0;
    int[] ans = new int[a.length + b.length];
    while(i < a.length && j < b.length){
        if(a[i] <= b[j]){
          ans[k] = a[i];
          i++;
          k++;
        }else{
          ans[k] = b[j];
          j++;
          k++;
        }
    }

    while(i < a.length){
      ans[k] = a[i];
      k++;
      i++;
    }

    while(j < b.length){
      ans[k] = b[j];
      k++;
      j++;
    }
    
    return ans;
        
    }
} 