public class r_removeDuplicate {
    public static String ans ="";   
    public static String removeDuplicate(String str,int idx,boolean present[]){
        if(str.length()==idx){
            return ans;
        }

        char curr = str.charAt(idx);
        if(present[curr -'a']){                                //a-a=0,b-a=1,c-a=2,d-a=3,.........z-a=25
            return removeDuplicate(str, idx+1, present);
        }else{
            present[curr-'a']=true;
            ans += str.charAt(idx);
            return removeDuplicate(str, idx+1, present);
        }
    }

    public static void main(String[] args) {
        String str ="abbssssasds";
        boolean present[] = new boolean[26];
        System.out.println(removeDuplicate(str,0,present)); 
    }
}
