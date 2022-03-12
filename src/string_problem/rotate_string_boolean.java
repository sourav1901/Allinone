
// Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

// A shift on s consists of moving the leftmost character of s to the rightmost position.

// For example, if s = "abcde", then it will be "bcdea" after one shift.





public class rotate_string_boolean {

    public static boolean rotateString(String s, String goal){
        String temp = s+s;
        return(s.length()==goal.length() && temp.contains(goal) );
    }
    public static void main(String[] args) {
        String a = "sourav", b="ravsou";
       
        System.out.println( rotateString(a,b));
    }
}
