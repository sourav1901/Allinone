

import java.util.Stack;

public class reverseUsingStack {
    

    public static void main(String[] args) {
        String str = "sourav";
        char[] c = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char ch : c) {
            stack.push(ch);
        } 
        for (int i = 0; i < c.length; i++) {
            c[i]= stack.pop();
        }
        
        System.out.println(new String(c));
    }
}
