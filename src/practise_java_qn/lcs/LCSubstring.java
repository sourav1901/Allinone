package lcs;

public class LCSubstring {

    public static void main(String[] args) {
        String t1 = "abced";
        String t2 = "abcwssesd";
    
        System.out.println(longestCommonSubstring(t1,t2));
    }



    public static int longestCommonSubstring(String text1, String text2) {
        
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
        int max_len=0;
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(a[i-1]==b[j-1]){
                    t[i][j]=1 + t[i-1][j-1];
                }else{
                    t[i][j]=0;               //just change in lcs and find the maxlen
                }
                max_len = Math.max(max_len, t[i][j]);
            }
        }
        return max_len;
    } 


}
    

