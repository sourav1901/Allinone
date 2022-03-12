import java.util.Stack;

public class decodeStringUsingStack {
    public static String decodeString(String s){

        Stack<StringBuilder> sbStack = new Stack<>();
        Stack<Integer> tStack = new Stack<>();
        sbStack.push(new StringBuilder());
        int times=0;

        for(char curr : s.toCharArray()){
            if(curr=='['){
                tStack.push(times);
                sbStack.push(new StringBuilder());
                times=0;

            }else if(curr==']'){
                String temp = sbStack.pop().toString();
                StringBuilder sb = sbStack.peek();
                int n = tStack.pop();
                for (int i = 0; i < n; i++) sb.append(temp);

            }else if(Character.isDigit(curr)){
                times = times * 10 + (curr - '0');
            }else{
                sbStack.peek().append(curr);
            }
        }
        return sbStack.pop().toString();

    }
   
   
   
    public static void main(String[] args) {
       System.out.println(decodeString("3[a2[c]]"));    //--------------> accaccacc
    }
}
