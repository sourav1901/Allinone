
public class sort_char {
    public static void main(String[] args) {
        String str="sourav";
        char[] ch = str.toCharArray();
        
        // Approach1
        char temp;
        for(int i= 0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i] > ch[j]){
                    temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;

                }
            }
        }
        System.out.println(new String(ch));


        // //Approach2
        // Arrays.sort(ch);
        // System.out.println(new String(ch));


    }
    
}
