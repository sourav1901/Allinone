package lcs;

import java.util.Arrays;

public class LcsRMDp {
    public static void main(String[] args) {
        String t1 = "abac";
        String t2 = "caba";
    
        System.out.println(longestCommonSubsequence(t1,t2));
    }




    

    //1. recursive code************************************************************************************************************
    // public static int longestCommonSubsequence(String t1, String t2) {
    //     return lcsR(t1.toCharArray(),t2.toCharArray(),t1.length(),t2.length());
        
    // }
    
    // public static int lcsR(char[] a,char[] b,int m, int n){
    //     if(m==0 ||n==0){
    //         return 0;
    //     }
    //     if(a[m-1]==b[n-1]){
    //         return 1+lcsR(a,b,m-1,n-1);
    //     }else{
    //         return Math.max(lcsR(a,b,m-1,n),lcsR(a,b,m,n-1));
    //     }
    // } 








    //2.Memoization BottomUP*************************************************************************************************************** */
    // static int[][] t = new int[1001][1001];
    
    // public static int longestCommonSubsequence(String text1, String text2) {
        // for (int[] row: t){
                // Arrays.fill(row, -1);
        // }
    //     return lcsM(text1.toCharArray(),text2.toCharArray(),text1.length(),text2.length());
        
    // }
    // public static int lcsM(char[] a,char[] b,int m, int n){
    //     if(m==0 ||n==0){
    //         return 0;
    //     }
        
    //     if(t[m][n]!=-1){
    //         return t[m][n];
    //     }
    //     if(a[m-1]==b[n-1]){
    //         return t[m][n]=1+lcsM(a,b,m-1,n-1);
    //     }else{
    //         return t[m][n]=Math.max(lcsM(a,b,m-1,n),lcsM(a,b,m,n-1));
    //     }
    // } 








    //3.dp topdown************************************************************************** */

    public static int longestCommonSubsequence(String text1, String text2) {
        
        return lcs(text1.toCharArray(),text2.toCharArray(),text1.length(),text2.length());
        
    }
    public static int lcs(char[] a,char[] b,int m, int n){
           int[][] t = new int[m+1][n+1];

        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0) t[i][j]=0;
                if(j==0) t[i][j]=0;
            }
        }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(a[i-1]==b[j-1]){
                    t[i][j]=1 + t[i-1][j-1];
                }else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        return t[m][n];
    } 


}






