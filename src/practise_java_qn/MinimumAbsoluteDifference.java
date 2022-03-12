import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> l = new ArrayList<>();
        int diff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        
        for(int i=1;i<arr.length;i++){
            int currentDiff = arr[i]-arr[i-1];
           
            if(currentDiff<diff){
                l = new ArrayList<>();     //clear all value in list and start fresh
                diff = currentDiff;
            }
            
            if(currentDiff == diff){
                l.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return l;
    }
    
    public static void main(String[] args) {
        
        int[] arr  ={4,2,5,2,21,8,1,2,4};

        for (Object l : minimumAbsDifference(arr)) {
            System.out.println(l);
        }
    }
}
