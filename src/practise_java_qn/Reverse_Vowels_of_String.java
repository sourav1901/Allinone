import java.util.*;

public class Reverse_Vowels_of_String {

    //1st way --------------------------------using Stack 
    public static String reverseVowels(String s) {
            String a="";
            Stack<Character> S1=new Stack<>();
            for(int i=0;i<s.length();i++)
            {
                         char x=s.charAt(i);
                           if (x == 'a' || x == 'e' || x == 'i' ||
                            x == 'o' || x == 'u' || x == 'A' ||
                            x == 'E' || x == 'I' || x == 'O' || x == 'U')
                           {
                               S1.add(x);
                           }
                              
            }
            for(int i=0;i<s.length();i++)
            {
                         char x=s.charAt(i);
                           if (x == 'a' || x == 'e' || x == 'i' ||
                            x == 'o' || x == 'u' || x == 'A' ||
                            x == 'E' || x == 'I' || x == 'O' || x == 'U')
                           {
                               a=a.concat(Character.toString(S1.pop()));
    
                           }
                             else
                                        {
                                              a=a.concat(Character.toString(x));
                                     }
            }
                        
            return a;
            
        }
    
    
    public static void main(String[] args) {
        String s = "hello";
       System.out.println( reverseVowels2(s));
    }


        //2nd way -------------------------------------------------------------using String Builder//

    public static String reverseVowels2(String s) {
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
                     char x=s.charAt(i);
                       if (x == 'a' || x == 'e' || x == 'i' ||
                        x == 'o' || x == 'u' || x == 'A' ||
                        x == 'E' || x == 'I' || x == 'O' || x == 'U')
                       {
                           sb.append(x);
                       }
        }
        if(sb.length()<1){
            return s;
        }
        sb.reverse();
        
        for(int i=0,j=0;i<s.length();i++)
        {
                     char x=s.charAt(i);
                       if (x == 'a' || x == 'e' || x == 'i' ||
                        x == 'o' || x == 'u' || x == 'A' ||
                        x == 'E' || x == 'I' || x == 'O' || x == 'U')
                       {
                           ch[i] = sb.charAt(j++);
                       }
        }
        return String.valueOf(ch);
    }


}
