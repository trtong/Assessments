package rocks.zipcode.quizweek7.collections.inventory;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quizweek7.collections.Inventory;

public class AddItemToInventroy {

    @Test
    public void test1() {
        Inventory inventory = new Inventory();
        inventory.addItemToInventory("Lamp");

        Assert.assertEquals(Integer.valueOf(1) ,inventory.getItemQuantity("Lamp"));

        inventory.addItemToInventory("Lamp");
        Assert.assertEquals(Integer.valueOf(2) ,inventory.getItemQuantity("Lamp"));

        inventory.addItemToInventory("Basketball");
        Assert.assertEquals(Integer.valueOf(2) ,inventory.getItemQuantity("Lamp"));
        Assert.assertEquals(Integer.valueOf(1) ,inventory.getItemQuantity("Basketball"));
    }
}
