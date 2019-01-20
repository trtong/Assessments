package com.zipcodewilmington.assessment1.part3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class StoreTest {
    private static final double DELTA = 0.01;
    private Store store;
    private Product[] products = new Product[10];

    @Before
    public void setup(){
        store = new Store();

        for (int i = 0; i < 10; i++) {
            products[i] = new GarmentTest.Shirt(i + 10.99, "M");
        }
    }

    @Test
    public void testGetSetName(){
        String storeName = "Bee";

        store.setName(storeName);

        Assert.assertEquals(storeName, store.getName());
    }

    @Test
    public void testInitialSize(){
        int initialSize = 0;
        Assert.assertEquals(initialSize, store.size());
    }

    @Test
    public void testSizeAfterAddProduct(){
        Product product = products[0];
        store.addProduct(product);

        Assert.assertEquals(1, store.size());
    }

    @Test
    public void testSizeAfterAddingMultipleProduct(){
        store.addProduct(products[0]);
        store.addProduct(products[1]);
        store.addProduct(products[2]);

        Assert.assertEquals(3, store.size());
    }

    @Test
    public void testSizeAfterRemoveProduct_whenProductNotInThere(){
        store.removeProduct(products[0]);

        Assert.assertEquals(0, store.size());
    }

    @Test
    public void testSizeAfterRemoveProduct_whenProductIsInStore(){
        Product product = products[0];
        store.addProduct(product);

        store.removeProduct(product);

        Assert.assertEquals(0, store.size());
    }

    @Test
    public void testHasProduct_NotInStore(){
        Product product = products[0];

        Assert.assertFalse(store.hasProduct(product));
    }

    @Test
    public void testHasProduct_inStore(){
        Product product = products[0];

        store.addProduct(product);

        Assert.assertTrue(store.hasProduct(product));
    }

    @Test
    public void testHasProduct_inStoreWithManyProducts(){
        Product product = products[0];
        store = new Store(products);

        Assert.assertTrue(store.hasProduct(product));
    }

    @Test
    public void testCheapestProduct_atTheEnd(){
        Product cheapShirt = new GarmentTest.Shirt(1.99, "XL");
        store = new Store(products);

        store.addProduct(cheapShirt);

        Product actualCheapestShirt = store.getCheapestProduct();
        System.out.println("cheapest shirt " + cheapShirt.getPrice());
        System.out.println("actual " + actualCheapestShirt.getPrice());


        Assert.assertEquals(cheapShirt, actualCheapestShirt);
    }

    @Test
    public void testCheapestProduct_atTheBeginning(){
        Product cheapShirt = new GarmentTest.Shirt(1.99, "XL");
        products[0] = cheapShirt;
        store = new Store(products);

        Product actualCheapestShirt = store.getCheapestProduct();

        Assert.assertEquals(cheapShirt, actualCheapestShirt);
    }

    @Test
    public void testCheapestProduct_inTheMiddle(){
        Product cheapShirt = new GarmentTest.Shirt(1.99, "XL");
        products[4] = cheapShirt;
        store = new Store(products);

        Product actualCheapestShirt = store.getCheapestProduct();

        Assert.assertEquals(cheapShirt, actualCheapestShirt);
    }

    @Test
    public void testGetAveragePrice_forEmptyStore(){
        Assert.assertEquals(0, store.getAveragePrice(), DELTA);
    }

    @Test
    public void testGetAveragePrice_oneProduct(){
        Product product = products[0];
        double expected = product.getPrice();

        store.addProduct(product);

        Assert.assertEquals(expected, store.getAveragePrice(), DELTA);
    }

    @Test
    public void testGetAveragePrice_withVariousPrices(){
        double expected = 15.49;

        store = new Store(products);

        Assert.assertEquals(expected, store.getAveragePrice(), DELTA);
    }

    @Test
    public void testGetProducts_oneProduct(){
        Product product = products[0];
        store.addProduct(product);

        Product[] expectedProducts = {product};

        Assert.assertArrayEquals(expectedProducts, store.getProducts());
    }

    @Test
    public void testGetProducts_withMultipleProducts(){
        store.addProduct(products[3]);
        store.addProduct(products[4]);
        store.addProduct(products[5]);
        store.addProduct(products[6]);

        Product[] expectedProducts = {products[3], products[4], products[5], products[6]};

        Assert.assertArrayEquals(expectedProducts, store.getProducts());
    }

    @Test
    public void testGetProducts_fromConstructor(){
        store = new Store(products);

        Product product = new GarmentTest.Shirt(1.90, "15");
        store.addProduct(product);

        Product[] expected = Arrays.copyOf(products, products.length + 1);
        expected[10] = product;

        Assert.assertArrayEquals(expected, store.getProducts());
    }

}
