package rocks.zipcode.quizweek7.collections.inventory;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quizweek7.collections.Inventory;

public class UnlistItem {

    @Test
    public void test1() {
        Inventory inventory = new Inventory();
        inventory.addItemToInventory("Baseball");
        inventory.addItemToInventory("Baseball");
        inventory.addItemToInventory("Baseball");

        inventory.unlistItem("Baseball");
        Assert.assertEquals(Integer.valueOf(0), inventory.getItemQuantity("Baseball"));
        inventory.addItemToInventory("Basketball");
        inventory.addItemToInventory("Baseball");
        inventory.unlistItem("Basketball");
        Assert.assertEquals(Integer.valueOf(0), inventory.getItemQuantity("Basketball"));
        Assert.assertEquals(Integer.valueOf(1), inventory.getItemQuantity("Baseball"));
    }

    @Test
    public void test2() {
        Inventory inventory = new Inventory();
        inventory.addItemToInventory("Lamp");
        inventory.addItemToInventory("Lamp");
        inventory.addItemToInventory("Lamp");

        inventory.unlistItem("Cheesesteak");
        Assert.assertEquals(Integer.valueOf(3), inventory.getItemQuantity("Lamp"));
    }



}
