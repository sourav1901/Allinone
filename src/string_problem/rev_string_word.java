public class rev_string_word {
    public static void main(String[] args) {
        String str="love you my life";
        String[] s=str.split(" ");
        
        for(int i=0;i<s.leng th;i++){
            char[] ch=s[i].toCharArray();
            for(int j=ch.length-1;j>=0;j--){
                System.out.print(ch[j]);
                
            }
            System.out.print(" ");
        }
    }

}
//leetcode
    // class Solution {
    //     public String reverseWords(String s) {
    //         String[] sr = s.split(" ");
    //         for(int i=0;i<sr.length;i++){
    //            char[] ch = sr[i].toCharArray();
                
    //             int k=0;
    //             int j=ch.length-1;
    //             while(k<j){
    //                 char temp =ch[k];
    //                 ch[k]=ch[j];
    //                 ch[j]=temp;
    //                 k++;
    //                 j--;
    //             }
    //             sr[i]=String.valueOf(ch); //char to string
    //         }
    //         return String.join(" ", sr); //array string to string
            
    //     }
        
    // }

