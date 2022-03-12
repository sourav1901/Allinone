public class r_f_l_occurrence {

    public static int first = -1;
    public static int last = -1;
    public static void getIndices(String str,char s,int idx){
        if(str.length()==idx){
            return;
        }

        if(s==str.charAt(idx)){
            if(first == -1){
                first = idx;
            }
            last=idx;
        }
        getIndices(str, s, idx+1);
    }
    public static void main(String[] args) {
        String str = "sfsfrsaaffassdrr";
        char s = 'f';
        getIndices(str,s,0);
        System.out.println(first);
        System.out.println(last);
    }
}
