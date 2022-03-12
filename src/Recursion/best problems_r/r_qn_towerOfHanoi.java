public class r_qn_towerOfHanoi {
    
    public static void towerOfHanoi(int n, String sec, String helper, String dest){

        if(n==1){
        System.out.println("transfer disk "+ n + " from "+ sec +" to " + dest);
        return;
            
        }

        towerOfHanoi(n-1, sec, dest, helper);
        
        System.out.println("transfer disk "+ n + " from "+ sec +" to " + helper);
        
        towerOfHanoi(n-1, helper, sec, dest);
    }
    
    
    public static void main(String[] args) {
        towerOfHanoi(2, "A", "B", "C");
    }
}
