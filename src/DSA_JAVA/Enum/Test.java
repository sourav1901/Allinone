
enum Mobile{
    Me(100,"s"),Mi(20,"P"),Samsung,Poco;
    
    int price = 500;
    String versionName;
    
    Mobile(){
        System.out.println("hii");
    }
    Mobile(int price, String versionName){
        this.price = price;
        this.versionName = versionName;
    }
}
public class Test{
public static void main(String[] args) {
   System.out.println(Mobile.Me.hashCode());
   System.out.println(Mobile.Me.ordinal());
   
   System.out.println(Mobile.Me.versionName);
   System.out.println(Mobile.Me.price);
   Mobile m[] = Mobile.values();


   for (Mobile mobile : m) {
   System.out.println(mobile+" "+mobile.versionName);
       
   }
}
}