public class evaluateExpressionTrue {
    
    static int countWays( String s){
        return solve(s.toCharArray(),0,s.length()-1,true);
    }
    
    static int solve(char[] s, int i, int j,boolean isTrue){
        
        if(i>j)return 0;
        if(i==j){
            if(isTrue == true) return (s[i] == 'T')?1:0;
            else return (s[i] == 'F')?1:0;
            
        }
        int ans=0;
        for(int k=i+1;k<=j-1;k=k+2){
            int lT = solve(s,i,k-1,true);
            int lF = solve(s,i,k-1,false);
            int rT = solve(s,k+1,j,true);
            int rF = solve(s,k+1,j,false);
            
            if(s[k]=='&'){
                if(isTrue==true) ans = ans+(lT*rT);
                else ans = ans+(lF*rT)+(lF*rF)+(lT*rF);
            }
            else if(s[k]=='|'){
                if(isTrue==true) ans = ans+(lT*rT)+(lT*rF)+(lF*rF);
                else ans = ans+(lF*rF);
            }
            else if(s[k]=='^'){
                if(isTrue==true) ans = ans+(lT*rF)+(lF*rT);
                else ans = ans+(lF*rF)+(lT*rT);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
    //    System.out.println(countWays("T^F|F")); //2
       System.out.println(countWays("T|T&F^T")); 
    }
    
}
