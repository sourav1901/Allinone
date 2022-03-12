public class bstInfinitearray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,7,8,12,22,31,34,37,41,51,55,57,59,61,63,64,67,69,73,76,79,85,89};
       System.out.println(InfiniteBST(arr,49)); 
    }

    private static int InfiniteBST(int[] a, int target) {

        int i=0, j=1 ,mid=0;
        while(a[j]<target){
            j=j*2;
        }
        while(i<=j){
            mid = (j-i)/2+i;
            if(target==a[mid]){
                return mid;
            }else if(a[mid]>target){
                j=mid-1;
            }else if(a[mid]<target){
                i=mid+1;
            }
        }
        return -1;
    }
}
