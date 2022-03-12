package MCM;

import java.util.Arrays;

public class palindromePartitioning {
   
    // recursion +memoization
    int[][] t;
    public int minCut(String s) {
        t=new int[s.length()+1][s.length()+1];
        for(int i[]: t){
            Arrays.fill(i,-1);
        }
        return solve(s,0,s.length()-1);
    }
    public int solve(String s, int i, int j){
        if(i>=j) return 0;
        if(isPalindrome(s,i,j)) return 0;
        int mn = Integer.MAX_VALUE;
        
       if(t[i][j]!=-1){ return t[i][j];}
        int temp=0;
        for(int k=i+1; k<=j;k++){
            if(isPalindrome(s,i,k-1)){
                 temp = solve(s,k,j)+1;
            }
        }      if(mn>temp)
                     mn=temp;
        
            
           
         return t[i][j]=mn;
    }
    
    boolean isPalindrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    

    public static void main(String[] args) {
        palindromePartitioning pp = new palindromePartitioning();
        System.out.println(pp.minCut("aaaba")); 
    }

}
