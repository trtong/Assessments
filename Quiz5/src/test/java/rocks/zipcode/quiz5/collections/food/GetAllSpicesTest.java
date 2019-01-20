package rocks.zipcode.quiz5.collections.food;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz5.collections.Food;
import rocks.zipcode.quiz5.objectorientation.Curry;
import rocks.zipcode.quiz5.objectorientation.Ginger;
import rocks.zipcode.quiz5.objectorientation.Pepper;
import rocks.zipcode.quiz5.objectorientation.Spice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class GetAllSpicesTest {
    @Test
    public void test1() {
        // given
        test(() -> Arrays.asList(
                (Spice) new Pepper(),
                (Spice) new Ginger(),
                (Spice) new Curry()));
    }

    @Test
    public void test2() {
        // given
        test(() -> Arrays.asList(
                (Spice) new Pepper(),
                (Spice) new Pepper(),
                (Spice) new Ginger(),
                (Spice) new Curry()));
    }


    @Test
    public void test3() {
        // given
        test(() -> Arrays.asList(
                (Spice) new Pepper(),
                (Spice) new Pepper(),
                (Spice) new Ginger(),
                (Spice) new Ginger(),
                (Spice) new Curry()));
    }


    @Test
    public void test4() {
        // given
        test(() -> Arrays.asList((Spice) new Curry()));
    }

    @Test
    public void test5() {
        // given
        test(() -> Arrays.asList((Spice) new Ginger()));
    }

    @Test
    public void test6() {
        // given
        test(() -> Arrays.asList((Spice) new Pepper()));
    }

    private void test(Supplier<List<Spice>> listSupplier) {
        // given there is some food
        Food food = new Food();

        // given there is a list of spices to apply
        List<Spice> expected = listSupplier.get();

        // given spices are applied to the food
        expected.forEach(spice -> food.applySpice(spice));

        // when spice on food is evaluated
        List<Spice> actual = food.getAllSpices();

        // then
        Assert.assertEquals(expected, actual);
    }
}
