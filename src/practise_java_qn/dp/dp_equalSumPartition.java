package dp;
public class dp_equalSumPartition {

    static boolean equalSum(int arr[]){
        int sum =0;
        for (int i : arr) sum +=i;
        if(sum%2!=0)return false;
        
        return subsetSum(arr,sum/2);
    
    }

    static boolean subsetSum(int[] arr, int s) {
       boolean[][] t  = new boolean[arr.length+1][s+1];
        for (int i = 0; i <= arr.length; i++) {            
            for (int j = 0; j <= s;j++) {
                if(i==0){
                    t[i][j]=false;
                }
                else if(j==0){
                    t[i][j]=true;
                }   
                else if(arr[i-1]<=j){
                    t[i][j]=t[i-1][j-arr[i-1]] || t[i-1][j];
                }
                else{
                    t[i][j]= t[i-1][j];
                }
            }
        }   
        return t[arr.length][s];
    } 
  

    public static void main(String[] args) {
        

       int[] arr ={7,4,1};
      System.out.println(equalSum(arr));  
    }
    
}
