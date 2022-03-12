package dp;


/* output
   1 0-->false
2 0-->false
3 0-->false
4 0-->false
5 0-->false
0 2-->false
1 1-->true       1
1 2-->true       2
1 3-->false       else
1 4-->false       1
1 5-->false       else
2 1-->false       else
2 2-->true       2
2 3-->true       1
2 4-->false       1
2 5-->false       else
3 1-->false       else
3 2-->true       2
3 3-->false       else
3 4-->true       1
3 5-->false       else
4 1-->false       else
4 2-->true       2
4 3-->true       1
4 4-->false       1
4 5-->false       else
5 1-->false       else
5 2-->true       2
5 3-->false       else
5 4-->true       1
5 5-->false       1
false    */

public class dp_wildCardMatching {
    public static boolean isMatch(String s, String p) {
        int m = s.length(),n=p.length();
           boolean[][] t = new boolean[m+1][n+1];
        
        t[0][0] = true;
        for(int i = 1; i < m+1; i++){
            t[i][0] = false;
            System.out.println(i+" 0"+"-->"+t[i][0]);

        }       
        for(int j = 1; j < n+1; j++){
            if(p.charAt(j-1) == '*'){
                t[0][j] = t[0][j-1];
                System.out.println("0 "+j+"-->"+t[0][j]);
            }            
        }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(s.charAt(i-1)==p.charAt(j-1) || (p.charAt(j-1)=='?')){
                    t[i][j] = t[i-1][j-1];
                    System.out.println(i+" "+j+"-->"+t[i][j]+"       1");
                }else if(p.charAt(j-1)=='*'){
                    t[i][j] = t[i-1][j] || t[i][j-1];
                    System.out.println(i+" "+j+"-->"+t[i][j]+"       2");

                }
            }
        }
        return t[m][n];
    }

    public static void main(String[] args) {
        System.out.println(isMatch("acdcb","a*c?b"));
    }
}
