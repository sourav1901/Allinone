public class remove_whspace_char{
    public static void main(String[] args) {
        String str="abc23jj42#$#@dj##";

        //replaceAll method
       String s= str.replaceAll("[^a-zA-Z0-9]", "");
       System.out.println(s);


       //remove whiteSpaces
       String str1="   s ou r a v   ";
       //    String p = str1.trim();
       String p = str1.replaceAll("//s", "");
     
       System.out.println(p);
    }
}