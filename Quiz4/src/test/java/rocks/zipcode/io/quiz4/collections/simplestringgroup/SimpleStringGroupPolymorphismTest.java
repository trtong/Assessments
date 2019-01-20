package rocks.zipcode.io.quiz4.collections.simplestringgroup;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.collections.SimpleStringGroup;

import java.util.Collection;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroupPolymorphismTest {
    @Test
    public void test1() {
        Assert.assertTrue(new SimpleStringGroup() instanceof Iterable);
    }

    @Test
    public void test2() {
        Assert.assertFalse(new SimpleStringGroup() instanceof Collection);
    }

}
