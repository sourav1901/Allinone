public class StockProblem {
    public static int MaximumProfit(int[] a){
        int minSoFar=a[0];
        int max=0;

        for (int i = 0; i < a.length; i++) {
            minSoFar = Math.min(a[i],minSoFar);
            int profit = a[i]-minSoFar;
            if(max<profit)
                max=profit;   
        }
        return max;
    }
    public static int MaximumProfitOverAll(int[] a){
        int maxSum=0;

        for (int i = 0; i < a.length-1; i++) {
            if(a[i+1]>a[i]){
                maxSum += a[i+1]-a[i];
            }
            
        }

        return maxSum;
    }


    public static void main(String[] args) {
        
        

        int[] arr ={2,5,6,16,9,20};

        System.out.println(MaximumProfit(arr));
        System.out.println(MaximumProfitOverAll(arr));
    }
    
}
