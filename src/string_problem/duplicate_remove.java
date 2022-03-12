import java.util.LinkedHashSet;
import java.util.Set;

public class duplicate_remove {
    public static void main(String[] args) {
        String str= "Programming";

        //Approach 1

        StringBuilder sbr = new StringBuilder();
       str.chars().distinct().forEach(c -> sbr.append((char) c));
       System.out.println(sbr);

        //Approach2
        StringBuilder sbr2 = new StringBuilder();
        for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);
           int idx = str.indexOf(ch, i+1);
            if(idx ==-1){
                sbr2.append(ch);
            }
        } 
        System.out.println(sbr2);


        //Approach3
        char[] arr = str.toCharArray();
        StringBuilder sbr3 = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            Boolean repeated =false;
            for(int j=i+1;j<arr.length;j++){

                if(arr[i]==arr[j]){
                    repeated = true;
                    break;
                }
            }
            if(!repeated){
                sbr3.append(arr[i]);
            }
        }
        System.out.println(sbr3);


        //Approach4
        StringBuilder sbr4 = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){

            set.add(str.charAt(i));
        }
        for (Character cha : set) {
            sbr4.append(cha);
        }
        System.out.println(sbr4);
        
    }
}
