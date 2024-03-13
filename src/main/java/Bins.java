
public class Bins {
    private int[] resultHolder;
    private int lowestRoll;
    private int highestRoll;

    public Bins(int lowestRoll, int highestRoll){
        this.lowestRoll = lowestRoll;
        this.highestRoll = highestRoll;
        resultHolder = new int[this.highestRoll - this.lowestRoll + 1]; //2-12=10 but int[10] is only 9 slots, need + 1
    }

    public void increment(int rollResult){
        resultHolder[rollResult - lowestRoll] += 1;
    }

    public int getBin(int index){

        return resultHolder[index];
    }


}
