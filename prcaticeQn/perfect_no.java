public class perfect_no {
    public static void main(String[] args) {
        int n= 13;
        boolean b = isPerfect(n);

        if(b){
            System.out.println("perfect no.");
        }
        else
            System.out.println("its not");
        
    }
    public static boolean isPerfect(int n) {
        int sum = 0;
        for(int i=1;i<n/2;i++){
            if(n%i==0){
                sum += i;
            }
            if(n == sum){
                return true;
            }
            
        }



        return false;
        
    }
    
}
