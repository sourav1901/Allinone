public class r_print_xpow_n {

    public static int printPower(int x, int n){ 
    /*  (with stack Height = n)
      
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int x_ = printPower(x, n-1);
        int xn = x*x_;
        return xn;

        */
    //  (with stack Height = logn)
      
        if(n==0){
            return 1;
        }
        
       if(n%2==0){
           return printPower(x, n/2) * printPower(x, n/2);
       }
       else{
           return  x * printPower(x, n/2) * printPower(x, n/2);
       }

    }

    
    public static void main(String[] args) {
        int output = printPower(2, 3);
        System.out.println(output);

    }
}
