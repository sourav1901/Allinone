package lcs;

public class shortestCommonSuperSequence {
    public static int shortestCommonSupersequence(String text1, String text2) {
        
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
        return m+n-t[m][n];
    } 


    public static void main(String[] args) {
        String t1 = "abaaa";
        String t2 = "baabaca";
    
        System.out.println(shortestCommonSupersequence(t1,t2));
    }
}
