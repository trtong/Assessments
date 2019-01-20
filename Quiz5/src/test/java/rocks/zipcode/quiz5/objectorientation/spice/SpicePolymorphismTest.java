package rocks.zipcode.quiz5.objectorientation.spice;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz5.objectorientation.Curry;
import rocks.zipcode.quiz5.objectorientation.Ginger;
import rocks.zipcode.quiz5.objectorientation.Pepper;
import rocks.zipcode.quiz5.objectorientation.Spice;

/**
 * @author leon on 27/12/2018.
 */
public class SpicePolymorphismTest {
    @Test
    public void testPepperIsSpice() {
        Assert.assertTrue(new Pepper() instanceof Spice);
    }

    @Test
    public void testGingerIsSpice() {
        Assert.assertTrue(new Ginger() instanceof Spice);
    }

    @Test
    public void testCurryIsSpice() {
        Assert.assertTrue(new Curry() instanceof Spice);
    }
}
