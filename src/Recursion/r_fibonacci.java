public class r_fibonacci {
    public static void fab(int a, int b, int n){

        if(n==0){
            return;
        }

        System.out.print(a);
        fab(b, a+b, n-1);

    }
    
    public static void main(String[] args) {
        fab(0, 1, 8);
    }
    
}
