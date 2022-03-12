

interface Bird{
    public void fly();
    public void sound();
}
interface toyDuck{
    void squeak();
}

class parrot implements Bird{

    @Override
    public void fly() {
       System.out.println("parrot fly furrr");
    }

    @Override
    public void sound() {
       System.out.println("rupu katori katori");
    }
    
}
class plasticToyDuck implements toyDuck{

    @Override
    public void squeak() {
       System.out.println("squeak squeak");
    }
    
}
//client would be toyDuck and adaptee would be Bird

class BirdAdapter implements toyDuck{

    Bird bird;
//wrap a bird in a bird adapter so it behaves like toyduck.
    
    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        //translate the method
       bird.sound();
        
    }
    
}



public class BirdExampleMain {

    public static void main(String[] args) {
        
        parrot parrot  = new parrot();
        toyDuck birdAdapter = new BirdAdapter(parrot);
        birdAdapter.squeak();
    }
}
