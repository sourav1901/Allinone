
public class missingNum {
    public static void main(String[] args) {
       
        int[] arr = {1,3,2,4,7,6};
        System.out.println(findMissingNum(arr));

    }

    public static int findMissingNum(int[] arr) {
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        for (int i : arr) {
            sum = sum-i;
        }
        return sum;

    }


}
