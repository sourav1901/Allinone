package StackQn;

import java.util.Stack;

public class nextGreaterElement {
    // public static int[] nextGreaterElementRight(int[] arr){
    //     int[] a = new int[arr.length];

    //     Stack<Integer> s = new Stack<>();
       
    //     for (int i = arr.length-1; i >=0 ; i--) {
            
    //         if(s.size()==0){
    //             a[i]=-1;
    //         }else if(s.size()>0 && s.peek()>arr[i]){
    //             a[i]=s.peek();
    //         }else if(s.size()>0 && s.peek()<=arr[i]){
    //             while(s.size()>0 && s.peek()<=arr[i]){
    //                 s.pop();
    //             }
    //             if(s.size()==0)
    //                 a[i]=-1;
    //             else{
    //                 a[i]=s.peek();
    //             }
    //         }
    //         s.push(arr[i]);
    //     }
    //     return a;
    // }

    public static int[] nextGreaterElementLeft(int[] arr){
        int[] a = new int[arr.length];

        Stack<Integer> s = new Stack<>();
       
        for (int i = 0; i <arr.length ; i++) {
            
            if(s.size()==0){
                a[i]=-1;
            }else if(s.size()>0 && s.peek()>arr[i]){
                a[i]=s.peek();
            }else if(s.size()>0 && s.peek()<=arr[i]){
                while(s.size()>0 && s.peek()<=arr[i]){
                    s.pop();
                }
                if(s.size()==0)
                    a[i]=-1;
                else{
                    a[i]=s.peek();
                }
            }
            s.push(arr[i]);
        }



        return a;

    }

public static void main(String[] args) {
    
        // int[] arr = {12,4,5,6,24,1};
        int[] arr = {2,3,8,4,3,9,8};
      
        //  int[] a = nextGreaterElementRight(arr);
         int[] a = nextGreaterElementLeft(arr);
         for (int i : a) {
             System.out.print(i+" ");
         }
}
    
}
