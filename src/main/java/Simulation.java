

public class Simulation {

    private int numberOfDies;

    private int numberOfTosses;

    private Bins bins;  //get Bins so we can use the methods

    public Simulation(int numberOfDies, int numberOfTosses, int lowestRoll, int highestRoll){
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        this.bins = new Bins(lowestRoll, highestRoll);
    }

    public void runSimulation(){
        Dice dice = new Dice(numberOfDies);     //numberOfDies is gone be numOfDicesRolled

        for(int i = 0; i < numberOfTosses; i++){        //for every single toss, we get the dice.tossAndSum and set to sum
            int sum = dice.tossAndSum();
            bins.increment(sum);        //increment
        }
    }

    public String result(){
        StringBuilder builder = new StringBuilder();
        builder.append("***\n");
        builder.append("Simulation of ").append(numberOfTosses).append(" tosses with ").append(numberOfDies).append(" dice.\n");
        builder.append("***\n\n");

        for (int i = numberOfDies; i <= 6 * numberOfDies; i++) {
            builder.append(String.format("%2d : %8d: %.2f ", i, bins.getBin(i), (double) bins.getBin(i) / numberOfTosses));
            for (int j = 0; j < (double) bins.getBin(i) / numberOfTosses * 100; j++) {
                builder.append("*");
            }
            builder.append("\n");
        }
        return builder.toString();

    }



    public static void main(String args[]){
        Simulation simulation = new Simulation(2, 1000000, 2, 12);

        simulation.runSimulation();

        System.out.println(simulation.result());
    }




}
