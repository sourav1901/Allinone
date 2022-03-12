public class r_longestPalindrome {
    public static String res="";
    public static void printSub(String s,int idx, String r){
        
        
        if(s.length()==idx){
            
            String str = new StringBuilder(r).reverse().toString();
            
            if(r.equals(str)){
                
                if(res.length()==0){
                    res=str;  
                }
               else if(res.length()<str.length()){
                    res=str;
                }
            }       
                     
            return ;
        }
        
        printSub(s,idx+1,r+s.charAt(idx));
        
        printSub(s,idx+1,r);
        
        
    }
    
    public static String longestPalindrome(String s) {
        printSub(s,0,"");
        return res;
    }

    public static void main(String[] args) {
        String s = "abab";
        System.out.println(longestPalindrome(s)); 
    }
}