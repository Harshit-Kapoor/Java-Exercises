package Stacks;
import java.util.*;

public class StockSpan {
    
    // STOCK SPAN IS DIFFERENCE BETWEEN CURRENT ELEMENT AND NEXT GREATER ELEMENT ON THE LEFT

public static void main(String[] args) throws Exception {

    int a[] = {2,5,9,3,1,12,6,8,7};
    int[] span = solve(a);
    display(span);
  }

  // POP ANS PUSH

  public static int[] solve(int[] arr) {
    int[] span = new int[arr.length];
    Stack< Integer> st = new Stack<>();
    st.push(0);
    span[0] = 1;

    for (int i = 1; i < arr.length; i++) {
      while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
        st.pop();
      }
      if (st.size() == 0) {
        span[i] = i + 1;
      } else {
        span[i] = i - st.peek();
      }

      st.push(i);
    }
    return span;
  }

  public static void display(int[] a) {
    StringBuilder sb = new StringBuilder();

    for (int val : a) {
      sb.append(val + " ");
    }
    System.out.println(sb);
  }
}

