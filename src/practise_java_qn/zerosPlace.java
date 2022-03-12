 
import java.util.Scanner;

//22,5,0,1,0,18 -> 1,5,18,22,0,0

public class zerosPlace {
    static int temp=0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int []arr = new int[6];
        for(int i= 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        sort(arr);
        zeroAtEnd(arr);

        for (int i : arr) {
            
            System.out.print(i+" ");
        }

    }

    static int[] zeroAtEnd(int[] arr) {

         int j=0;

        // 1st method 
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i] != 0){
        //         arr[j++]=arr[i];
        //     }
        // }
        // while(j<arr.length){
        //     arr[j++]=0;
        // }

        //2nd method
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]!=0 && arr[j]==0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                if(arr[j]!=0){
                    j++;
                }
            }


        return arr;
    }

    public static int[] sort(int[] arr) {

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    
}
