import java.util.Random;

public class Dice {

    private int numOfDicesRolled;
    private Random random; //creating an object of Random

    //constructor
    public Dice(int numOfDicesRolled){
        this.numOfDicesRolled = numOfDicesRolled;
        this.random = new Random();
    }

    public int tossAndSum(){
        int sum = 0;

        for(int i = 0; i < this.numOfDicesRolled; i++){
            sum += random.nextInt(6) + 1;   //roll dice from 0-5, +1 bc it's a 6 sided dice
        }
        return sum;
    }


}
