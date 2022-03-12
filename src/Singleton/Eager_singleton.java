public class Eager_singleton{
    public static void main(String[] args) {
        sourav s = sourav.getInstance();
        sourav s2 = sourav.getInstance();
        
    }
}

class sourav{
    static sourav s = new sourav();
    private sourav(){

            System.out.println("we are one");

    }
    public static  sourav getInstance(){
       

        return s;

    }

}




/*Eager initialization is easy to implement but it may cause resource and CPU time wastage.
 Use it only if cost of initializing a class is less in terms of resources or 
 your program will always need the instance of class.*/