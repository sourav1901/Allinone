package dp;

public class dp_countOfSubset {

    public static int countSum(int arr[],int s){
        int t[][]=new int[arr.length+1][s+1];
        
        for (int i = 0; i <= arr.length; i++) 
             t[i][0]=1;
        for (int j = 1; j <= s; j++) 
            t[0][j]=0;
    
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= s; j++) {
                // if(i==0) t[i][j]=1;
                // else if(j==0) t[i][j]=0;
                if(arr[i-1]<=j){
                    t[i][j]=t[i-1][j-arr[i-1]] + t[i-1][j]; 
                }
                else{
                    t[i][j]= t[i-1][j];
                }
            }
        }
        System.out.println(t[arr.length][s]);
        return t[arr.length][s];
    }
    public static void main(String[] args) {
        int arr[] = {3, 3, 3, 3 };
        int sum = 6;

        countSum(arr,sum);

    }
}
