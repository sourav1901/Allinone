package dp;

import java.util.*;

public class dp_TicketMinimumCost {
    public static int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[365 + 30 + 1];
        HashSet<Integer> set = new HashSet<>();
        for (int i:days) {
            set.add(i);
        }
        for (int i = days[days.length-1]; i >=1; i--) {
          
            if (set.contains(i)){
                dp[i] = Math.min(dp[i+1] + costs[0], dp[i+7] + costs[1]);
                dp[i] = Math.min(dp[i], dp[i+30] + costs[2]);
                System.out.println(i +" "+dp[i]);
            }else{
                dp[i]=dp[i+1];
            System.out.println(i +" else "+dp[i]);
                continue;
            }
        }
        return dp[1];
    }
    public static void main(String[] args) {
        int[] days={1,2,3,4,5,6,7,8,9,10,30,31};
        int[] costs={2,7,12};

       System.out.println(mincostTickets(days, costs)); 
    }
}
