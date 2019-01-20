package rocks.zipcode.quizweek7.collections.inventory;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quizweek7.collections.Inventory;

public class RemoveItemFromInventory {

    @Test
    public void test1() {
        Inventory inventory = new Inventory();

        inventory.addItemToInventory("Basketball");
        inventory.removeItemFromInventory("Basketball");
        Assert.assertEquals(Integer.valueOf(0), inventory.getItemQuantity("Basketball"));

        inventory.removeItemFromInventory("Basketball");
        Assert.assertEquals(Integer.valueOf(0), inventory.getItemQuantity("Basketball"));
    }

    @Test
    public void test2() {
        Inventory inventory = new Inventory();

        inventory.addItemToInventory("Baseball");
        inventory.addItemToInventory("Rake");
        inventory.removeItemFromInventory("Baseball");
        Assert.assertEquals(Integer.valueOf(0), inventory.getItemQuantity("Baseball"));
        Assert.assertEquals(Integer.valueOf(1), inventory.getItemQuantity("Rake"));
    }
}
