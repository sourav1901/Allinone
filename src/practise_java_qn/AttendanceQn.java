
import java.util.Scanner;

public class AttendanceQn {
    
    static int a=0,p=0,l=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        
        if(check(s) == true){
            System.out.println(true);
            System.out.println("yes you are eligible for prize");
        }else{
            System.out.println(false);
            System.out.println("No you are not eligible for prize");
        }
        sc.close();
        
    }
    
    static Boolean check(String s) {

        char[] ch = s.toCharArray();
     
        for(int i= 0;i<ch.length;i++){
            if(ch[i]=='A'){a++;}
            if(ch[i]=='P'){p++;}
            if(ch[i]=='L'){l++;}

        }
        if(a>2 && l>=3){
            return false;

        }else{

            return true;
        }

    }
}
