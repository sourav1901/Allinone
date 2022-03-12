import java.util.HashSet;

public class r_unique_subsequence {
    
    public static void printUniSubse(String str,int idx, String res,HashSet<String> hs){

        if(str.length()==idx){
            if(hs.contains(res)){
                return;
            }else{
                hs.add(res);
                System.out.println(res);
                return;
            }
        }

        //choose
        printUniSubse(str,idx+1,res+str.charAt(idx),hs);
        
        //not choose
        printUniSubse(str,idx+1,res,hs);

    }
    
    
    
    
    
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> hs = new HashSet<>();
        printUniSubse(str,0,"",hs);
    }
}
