public class simpleSorting{
    
    public static void PrintArray(int []arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    
    
    
    
    public static void main(String[] args) {
        
        int []arr={1,44,3,3,4};

        /*
       // bubble sort
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = 1;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        } 
        */


        /*
        //selection sort
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest]){
                    smallest =j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]= temp;
        }
        */
        
        /*
        // insertion sort
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];

            int j =i-1;
            while (j>=0 && arr[j]>current) {
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        */



        PrintArray(arr);
    }
}