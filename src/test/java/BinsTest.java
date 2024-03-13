import org.junit.Test;
import org.junit.Assert;

public class BinsTest {

    @Test
    public void testIncrement(){
        Bins bins = new Bins(2, 12);
        bins.increment(12);
        Assert.assertEquals(1, bins.getBin(12));
    }

    @Test
    public void testIncrement2(){
        Bins bins = new Bins(2, 12);
        bins.increment(7);
        bins.increment(7);
        bins.increment(7);
        Assert.assertEquals(3, bins.getBin(7));
    }




}