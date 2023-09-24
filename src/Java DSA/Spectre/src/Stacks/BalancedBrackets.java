package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

        // [][][](()){{}}(({{}}))  - balanced
    
        public static void main(String[] args) throws Exception {
        
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();

            Stack<Character> st = new Stack<>();

            for (int i = 0; i < input.length(); i++) {
                
                if (input.charAt(i) == ')') {
                    while(st.peek() != '(' && st.peek() != '{' && st.peek() != '[') {
                        st.pop();
                    }
                    if (st.peek() != '(') {
                        System.out.println("Not balanced brackets");
                    }
                    st.pop();
                } else if (input.charAt(i) == '}') {
                    while(st.peek() != '(' && st.peek() != '{' && st.peek() != '[') {
                        st.pop();
                    }
                    if (st.peek() != '{') {
                        System.out.println("Not balanced brackets");
                    }
                    st.pop();
                } else if (input.charAt(i) == ']') {
                    while(st.peek() != '(' && st.peek() != '{' && st.peek() != '[') {
                        st.pop();
                    }
                    if (st.peek() != '[') {
                        System.out.println("Not balanced brackets");
                    }
                    st.pop();
                } else if (input.charAt(i) == '[' || input.charAt(i) == '(' || input.charAt(i) == '{') {
                    st.push(input.charAt(i));
                }
            } 

            if (st.empty()) {
                System.out.println("Stack empty -> " + st + " hence balanced");
            } else {
                System.out.println("Stack not empty -> " + st + " hence not balanced");
            }

        }
}
