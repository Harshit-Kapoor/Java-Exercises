package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {

    // Example
    // ((a + b) + (c + d)) -> false: There is no redundant or duplicate braces found
    // (a + b) + ((c + d)) -> true: There is a pair of redundant or duplicate braces around c+d.

        public static void main(String[] args) throws Exception {
        
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();

            Stack<Character> st = new Stack<>();
            
            for (int i = 0; i < input.length(); i++) {
             
                if (input.charAt(i) == ')') {
                    if (st.peek() == '(') {
                        System.out.println("True, there is duplicacy of brackets");
                        return;
                    } else {
                        while (st.peek() != '(') {
                            st.pop();
                        }
                        st.pop();
                    }
                } else {
                    st.push(input.charAt(i));
                }
            }

           System.out.println("False, there is no duplicacy of brackets");
           return;
        
    }
}
