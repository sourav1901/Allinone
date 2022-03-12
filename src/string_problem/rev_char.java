public class rev_char{
    public static void main(String[] args) {
        String str = "sourav";
       
        //Approach1 using toCharArray()

        char[] carr= str.toCharArray();
        for(int i=carr.length-1;i>=0;i--){
            System.out.print(carr[i]);
        }

        System.out.println();
        //Approach2

        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }

        System.out.println();
        //Approach3

        StringBuffer sbf = new StringBuffer(str);
        System.out.println(sbf.reverse());

        //Approach4

        StringBuilder sbr = new StringBuilder(str);
        System.out.println(sbr.reverse());
       
       
    }
}