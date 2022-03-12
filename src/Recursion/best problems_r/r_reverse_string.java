public class r_reverse_string {
    public static String reverseString(String str){

        if(str.length()==1){
            return str;
        }

        String reverse = reverseString(str.substring(1))+str.charAt(0);

        return reverse;
    }



    public static void main(String[] args) {
          String str ="sourav";

          String rev = reverseString(str);
          System.out.println(rev);
    }
    
}
