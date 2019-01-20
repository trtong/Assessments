package rocks.zipcode.quizweek7.collections;

import java.util.HashMap;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {

    private HashMap<String, Integer> storage = new HashMap<>();

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        if (storage.containsKey(item)) {
            storage.replace(item, getItemQuantity(item) + 1);
        } else {
            storage.put(item, 1);
        }
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        if (storage.get(item) != null || getItemQuantity(item) < 2) {
            storage.replace(item, 0);
        } else {
            storage.replace(item, getItemQuantity(item) - 1);
        }

    }

    /**
     * @param item - remove all of this item from stock
     */
    public void unlistItem(String item) {
        storage.replace(item, 0);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        return storage.get(item);
    }
}
