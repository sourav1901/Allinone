public class r_arrSortStrictly {

    public static boolean checkSort(int[] arr, int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(!checkSort(arr, idx+1)){
            return false;
        }
        // System.out.println(arr[idx]+" "+ arr[idx+1]);
        return arr[idx] < arr[idx+1];
    }
    
    public static void main(String[] args) {
        
        int arr[]={2,6,4,3,7,3};
        // int arr2[]={1,3,5,7,8};
        System.out.println(checkSort(arr,0));
    }
}
