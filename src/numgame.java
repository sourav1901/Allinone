import java.util.Scanner;
import java.util.Random;

class Game {
    public int number;
    public int inputnumber;
    public int noOfGuesses=0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number= rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("guess the number");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();

    }
    boolean isCorrect(){
        noOfGuesses++;
        if(inputnumber == number){
            System.out.format("you guessed it right \n you guessed the number %d\n you guessed it in %d attempts",number, noOfGuesses);
            return true;
        }
        else if(inputnumber > number){
            System.out.println("you have chose greater number");
        }
        else if(inputnumber < number){
            System.out.println("you have chose smaller no.");
        }
        return false;


    }
}
public class numgame {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b){
            g.takeUserInput();
            b= g.isCorrect();
        }

    }

}
