import java.util.Arrays;

public class revString {
    public static void main(String[] args) {
        String str = "fixer:filer:finer:fizer:filter:fucker:fimer:finner:funel:sunel:soura";
        String s[] = str.split(":");

        for (String string : s) {
            // System.out.println(string);
            char ch[]= string.toCharArray();


            if(ch.length==5 && ch[0]=='f' && ch[1]=='i' && ch[3]=='e' && ch[4]=='r'){

                for(int i=0;i<ch.length;){

                    ch[2]=String.valueOf('a').charAt(0);
                System.out.println(Arrays.toString(ch));
                break;
    
                }
            }

            
        }
    }
}
