
public class replace_char {
    public static void main(String[] args) {
        String str = "weareone";
        char CharToReplace = 'e';

        if(str.indexOf(CharToReplace)==-1){
            System.out.println("Given char not available in string");
            System.exit(0);
        }
        int count=1;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==CharToReplace){
               str = str.replaceFirst(String.valueOf(ch), String.valueOf(count));
                count++;
            }
        }
        System.out.println(str);



        //it will print character till 9
        // char arr[]= str.toCharArray();
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==CharToReplace){
        //         arr[i]=String.valueOf(count).charAt(0);
        //         count++;
        //     }
        // }
        // System.out.println(Arrays.toString(arr));

    }
    
}
