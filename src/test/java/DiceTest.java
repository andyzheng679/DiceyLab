import org.junit.Test;
import org.junit.Assert;

public class DiceTest {

    @Test
    public void testTossAndSum2() { // testing rolling 2 dice
        Dice dice = new Dice(2);
        int toss = dice.tossAndSum();
        Assert.assertTrue(toss >= 2 && toss <= 12);
    }
    @Test
    public void testTossAndSum4() { // testing rolling 4 dice
        Dice dice = new Dice(4);
        int toss = dice.tossAndSum();
        Assert.assertTrue(toss >= 4 && toss <= 24);
    }

    @Test
    public void testTossAndSum6() { // testing rolling 6 dice
        Dice dice = new Dice(6);
        int toss = dice.tossAndSum();
        Assert.assertTrue(toss >= 6 && toss <= 72 );
    }
    @Test
    public void testTossAndSum8() { // testing rolling 8  dice
        Dice dice = new Dice(8);
        int toss = dice.tossAndSum();
        Assert.assertTrue(toss >= 8 && toss <= 96);
    }




}