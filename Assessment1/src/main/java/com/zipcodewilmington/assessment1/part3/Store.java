package com.zipcodewilmington.assessment1.part3;

import com.zipcodewilmington.assessment1.part2.ArrayUtils;

import java.util.Arrays;

public class Store {

    int size = 0;
    Product[] products;
    String name;



    // FIELDS
    //
    // 1. Create a field called "products" of type Product array
    // 2. Create a field called "name" of type String
    //
    // Create any other fields necessary to make the code work

    public Store(){
        products = new Product[size];

    }


    public Store(Product[] products){
        //set the instance products field to the parameter products
        //products = new Product[];
        this.products = products;

        this.size = products.length;


    }

    /**
     * Set the store name to the name given
     * @param name new name of the store
     *
     */


    public void setName(String name){
        this.name = name;
    }

    /**
     * @return the name of the store
     */
    public String getName() {

        return this.name;
    }


    /**
     * @return the number of items in the store
     */
    public int size(){
        return products.length;
    }

    /**
     * @param product to add
     */
    public void addProduct(Product product){

        this.products = Arrays.copyOf(products, products.length + 1);
        this.products[products.length - 1] = product;

    }


    /**
     * @param product to remove from the store
     */
    public void removeProduct(Product product) {

        if (products.length > 0) {
            Product[] result = new Product[products.length - 1];
            int index = 0;
            for (Product i : products) {
                if (!i.equals(product)) {
                    result[index++] = i;
                }
            }

            products = result;
        }

    }

    /**
     * Check if the store has the product
     * @param product to check
     * @return true if the store has the product, false otherwise
     */
    public Boolean hasProduct(Product product) {

        boolean hasProduct = false;

        for (int i = 0; i < size(); i++) {
            if (this.products[i].equals(product))
                hasProduct = true;
                break;
        }

        return hasProduct;

    }

    /**
     * @return the product with the lowest price
     */
    public Product getCheapestProduct(){

        double lowestPrice = products[0].getPrice();

        Product cheapest =  this.products[0];

        for (int i = 1; i < this.products.length; i++) {
            if (this.products[i].getPrice() < lowestPrice) {
                cheapest = this.products[i];
                lowestPrice = cheapest.getPrice();
            }
        }

        return cheapest;
    }

    /**
     * @return the average price of the product in the store
     */
    public double getAveragePrice(){

        double price = 0;

        if (size() > 0) {
            for (Product object: this.products) {
                price += object.getPrice();
            }
        } else {
            return 0;
        }

        return price/size();
    }

    /**
     * @return all the products in the store
     */
    public Product[] getProducts(){
        return this.products;
    }

}
