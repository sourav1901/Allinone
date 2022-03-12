public class r_subsequence {

    public static void printSubseq(String str, int idx, String res){

        if(str.length()==idx){
            System.out.println(res);
            return;
        }


        //choose
        printSubseq(str, idx+1, res + str.charAt(idx));

        //do not choose
        printSubseq(str,idx+1, res);

    }



    public static void main(String[] args) {
        String str = "abc";
        printSubseq(str,0,"");

    }
}
