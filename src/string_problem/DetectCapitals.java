public class DetectCapitals {
    public static boolean detectCapitalUse(String word) {
        
        
        
        //1st method
        
        // return word.matches("[A-Z]*|.[a-z]*");




//************************************************ 2nd method
        // int n = word.length();
        // if(n<2) return true;
        
        // if(Character.isUpperCase(word.charAt(0))&& Character.isUpperCase(word.charAt(1))){
        //     for(int i=2;i<n;i++){
        //         if(!Character.isUpperCase(word.charAt(i))) return false;
        //     }
        // }else{
        //     for(int i=1;i<n;i++){
        //         if(Character.isUpperCase(word.charAt(i))) return false;
        //     }
            
        // }
        // return true;







//*******************************************3rd method */      
        int n = word.length();
        
        boolean m1= true,m2= true,m3= true;
        
        //all capital
        for(int i=0;i<n;i++){
            if(!Character.isUpperCase(word.charAt(i))){
                m1=false;
                break;
            }
        }
        if(m1) return true;
        
         //all not capital
        for(int i=0;i<n;i++){
            if(!Character.isLowerCase(word.charAt(i))){
                m2=false;
                break;
            }
        }
        if(m2) return true;
        
        if(!Character.isUpperCase(word.charAt(0))) m3=false;
        
        if(m3){
            for(int i=1;i<n;i++){
                if(!Character.isLowerCase(word.charAt(i))){
                    m3= false;
                }
            }
            
        }
        if(m3) return true;
        
        return false;
    }
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("Good"));
    }
}
