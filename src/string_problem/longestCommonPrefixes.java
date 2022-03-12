public class longestCommonPrefixes {
    

    public static String longestCommonPrefix(String[] str) {
        if(str.length==0)return "";
        String pre = str[0];
        for (int i = 0; i < str.length; i++) 
            while(str[i].indexOf(pre) !=0)
                pre = pre.substring(0,pre.length()-1);
                
        return pre;

        

    }


    public static void main(String[] args) {
        String[] str ={"flower","flow","flight"};
        System.out.println(longestCommonPrefix( str)); 

    }

}
