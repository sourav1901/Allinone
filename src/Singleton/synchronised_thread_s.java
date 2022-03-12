public class synchronised_thread_s {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run(){

                sourav s= sourav.getInstance();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run(){

                sourav s= sourav.getInstance();
            }
        });
        t1.start();
        // try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace(); }   it takes 10 millisec slow your program
        t2.start();
        
    }
    
}
class sourav{
    public static sourav s;
    private sourav(){
        System.out.println("we are one");

    }
    public static synchronized sourav getInstance(){   //synchronised use here  do 100 tyms slow your program
        if(s == null){
            s = new sourav();

        }
        return s;
    }
}
