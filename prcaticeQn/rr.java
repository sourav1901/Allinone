import java.util.Scanner;

public class rr {

    public static boolean searchNo(int[][] d, int t){

        // for (int i = 0; i < d.length; i++) {
        //     for (int j = 0; j < d.length; j++) {
        //         if(d[i][j]==t){
        //             return true;
        //         }
        //     }
        // }


            int i=0 , j= d[0].length-1;
            while(i<d.length && j>=0){
                if(d[i][j]==t)
                    return true;
                else if(d[i][j]>t){
                    j--;
                }else{
                    i++;
                }
            }


            


        return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] d = new int[3][3];
         
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++) {
                d[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println(searchNo(d,8));

        sc.close();


        
    }

    
}
