package rocks.zipcode.quizweek7.objectorientation.address;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quizweek7.objectorientation.Address;

/**
 * @author leon on 28/11/2018.
 */
public class SetCityTest {
    @Test
    public void test1() {
        // Given
        Address address = new Address();
        String expected = "Philadelphia";

        // when
        address.setCity(expected);
        String actual = address.getCity();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // Given
        Address address = new Address();
        String expected = "New York";

        // when
        address.setCity(expected);
        String actual = address.getCity();

        // then
        Assert.assertEquals(expected, actual);
    }
}
