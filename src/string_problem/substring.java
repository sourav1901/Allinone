public class substring {
    public static void main(String[] args) {

        // sum of substring which is equal to 2
        int arr[]={1,1,1,2,3,4,111,1,1,1};
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            sum= arr[i]+arr[i+1];
            // System.out.println(arr[i]+arr[i+1]);
            if(sum==2){
                count++;
            }
        }
        System.out.println(count);

        //     int count=0;
        // String str= "abcbcbcbcbcbc";     //cbc found
        // char ch[]=str.toCharArray();
        // for(int i=0;i<ch.length-1;i++){
        //     if(ch[i]=='c' && ch[i+1]=='b' && ch[i+2]=='c'){
        //         count++;
        //     }
        // }
        // System.out.println(count);
    }
    
}
