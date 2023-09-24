package Stacks;
import java.util.*;

public class NextGreaterElementToRight {
  public static void main (String[] args) throws java.lang.Exception
  {

    int arr[] = {2,5,9,3,1,12,6,8,7};
    
    System.out.println(Arrays.toString(solve(arr)));
    
    /* Using Arrays
    
    int arr[] = {2,5,9,3,1,12,6,8,7};

    int max = 0;

    ArrayList<Integer> lst = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
        
        for (int j = i; j < arr.length; j++) {
            
            max = arr[i];

            if (arr[j] > max) {
                max = arr[j];
                break;
            }

            if (max == arr[i]) {
                max = -1;
            }

        }

        lst.add(max);
        
    }

    System.out.println(lst); */

  }

  public static int[] solve(int[] arr) {

    // pop - ans - push

    int[] nge = new int[arr.length];
    Stack< Integer> st = new Stack< >();

    nge[arr.length - 1] = -1;
    st.push(arr[arr.length - 1]);

    for (int i = arr.length - 2; i >= 0; i--) {

        while (st.size() > 0 && arr[i] >= st.peek()) {
        st.pop();
        }

        if (st.size() == 0) {
        nge[i] = -1;
        } else {
        nge[i] = st.peek();
        }

        st.push(arr[i]);
    }

    return nge;
    }  

}