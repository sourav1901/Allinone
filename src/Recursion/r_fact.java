public class r_fact {

    public static void fact(int n, int f){

        if(n==0){
            System.out.println(f);
            return;
        }
        f *=n;
        fact(n-1, f);
    }



    public static void main(String[] args) {
        fact(5, 1);
    }
    
}
