public class enum_singleton {
    public static void main(String[] args) {
        sourav s = sourav.INSTANCE;
        s.i=3;
        s.show();
        sourav s1 = sourav.INSTANCE;
        s1.i=3; 
        s1.show();
        
    }
    
}
enum sourav{
    INSTANCE;
    int i;
    public void show(){
        System.out.println(i);
    }

}
