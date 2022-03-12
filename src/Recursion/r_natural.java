public class r_natural{
    //print n to 0
    public static void printNumbers(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }

    public static void main(String[] args) {
        int n= 10;
        printNumbers(n);
        
    }
}