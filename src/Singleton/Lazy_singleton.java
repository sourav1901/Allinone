public class Lazy_singleton {
    public static void main(String[] args) {
        sourav s= sourav.getInstance();
        sourav s1= sourav.getInstance();
        
    }
    
}
class sourav{
    public static sourav s;
    private sourav(){
        System.out.println("we are one");

    }
    public static  sourav getInstance(){
        if(s == null){
            s = new sourav();

        }
        return s;
    }
}
