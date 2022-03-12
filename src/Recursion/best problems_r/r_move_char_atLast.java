public class r_move_char_atLast {

    public static String Add(int count){
        String newStr = "s";
        for (int i = 1; i < count; i++) {
            newStr += 's';
        }
        return newStr;
    }

    public static String moveAll(String str,int idx, int count){
        if(str.length()-1==idx){
            return Add(count);
        }
        if(str.charAt(idx)=='s'){
            return moveAll(str, idx+1, count+1);
        }
        String nextValue = moveAll(str, idx+1, count);
        return str.charAt(idx)+nextValue;

    }
    public static void main(String[] args) {
        String str ="sassaaapabde";
        int count=0;

        System.out.println(moveAll(str,0,count));
    }
}
