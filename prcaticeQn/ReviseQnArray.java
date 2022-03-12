public class ReviseQnArray{
    public static void ZeroToEnd(int[] a){

        int j=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=0 && a[j]==0){
                int temp = a[i];
                a[i]=a[j];
                a[j]=temp;

            }
            if(a[j]!=0)
                j++;
        }

    }
    public static int[] removeEvenFromArray(int[] a){
        int oddCount=0;
        
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2!=0)
                oddCount++;
        }
        int[] odd = new int[oddCount];
        int j=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2!=0){
                odd[j]= a[i];
                j++;
            }
        }
        return odd;
    }
    public static void reverseArray(int[] arr){
        int j= arr.length-1;
        for (int k = 0; k < arr.length/2; k++) {
            int temp = arr[k];
            arr[k] = arr[j];
            arr[j] = temp;

            j--;
        }
    }

    public static int MaxNum(int[] arr){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) max=arr[i];
        }



        return max;
    }
    public static int SecondMaxNum(int[] arr){
        int max = Integer.MIN_VALUE;
        int SecondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {


            if(arr[i]>max){
                SecondMax = max;
                max=arr[i];
            } else if(arr[i]>SecondMax && arr[i]!=max){
                SecondMax=arr[i];
            }

        }
        return SecondMax;
    }


    public static int AreaOfHistogram(int[] arr){
        int i=0, j= arr.length-1;
        int max =0;
        int area =0;
        while(i<j){

            if(arr[i]>arr[j]){
                area = (j-i)*arr[j];
                j--;
            }else{
                area = (j-i)*arr[i];
                i++;
            }
            if(area>max){
                max= area;
            }
        }
        return max;
    }

    public static int MaximumWaterContain(int[] arr){
        int i=0, j=arr.length-1;
        int count =0;
        

        while(i<j){
            if(arr[i]<arr[j]){
                for (int k = i+1; k < j; k++) {
                    if(arr[k]>arr[i]){
                        i=k;
                        
                    }
                    count+=arr[i]-arr[k];
                }
            }else{
                for (int k = j-1; k > i; k--) {
                    count+=arr[j]-arr[k];
                }
            }
        
        }
        return count;
    }

    public static void main(String[] args) {
        
        int[] arr={5,0,2,3,4,0,8,9};
 

        ZeroToEnd(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }


        System.out.println();
        int[] odd=removeEvenFromArray(arr);
        for (int i = 0; i < odd.length; i++) {
            System.out.print(odd[i]);
        }


        System.out.println();
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }


        System.out.println();
        System.out.println(MaxNum(arr)); 
        System.out.println(SecondMaxNum(arr)); 

        System.out.println();

        // int[] arr1 = {4,2,0,3,2,5};
        int[] arr1 = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(AreaOfHistogram(arr1));
        // System.out.println(MaximumWaterContain(arr1));


        




    }
}