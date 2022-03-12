

public class wordsReverse{
    public static void main(String[] args) {
       
        String str="I love u meli jaan";
        String s[]= str.split(" ");

        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }
        System.out.println();
        for(int i=s.length-1;i>=0;i--){
            System.out.println(s[i]+" ");
        }
        



    }
}