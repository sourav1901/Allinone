package dp;


class dp_TargetSumution {
    static int countOfSubsetSum(int[] arr,int n,int sum){
        int[][] dp = new int[n+1][sum+1];
        
        
        
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0) dp[i][j]=0;
                if(j==0) dp[i][j]=1;
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                
                if(arr[i-1] <=j){
                    dp[i][j]=dp[i-1][j-arr[i-1]]+dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    static int findTargetSumWays(int[] A , int N, int target) {
        // code here
        int sumA = 0;
        for(int i=0;i<N;i++){
            sumA += A[i];
        }
        
        int sum = (target+sumA)/2;
        
          if(target+sumA < 0 || (target+sumA)%2==1)
           return 0;
        
        return countOfSubsetSum(A,N,sum);
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1 };
        int TargetSum = 3;

       System.out.println(findTargetSumWays(arr,arr.length,TargetSum));
       
    }
}