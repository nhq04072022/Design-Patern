package edu.hus.sc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Store implements IStore {

    List<Product> productList = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public Store() {
    }

    //Add new product in store
    @Override
    public void addProduct(Product product) {
        // TODO
    }

    //Check Prodduct ID Valid
    @Override
    public boolean checkProductId(String id) {
        // TODO
        return false;
    }

    //Generate Product ID
    @Override
    public String generateProductID() {
        String id;
        String s = "QWERTYUIOPLKJHGFDSAZXCVBNM0987654321";
        do {
            Random r = new Random();
            id = "";
            for (int i = 0; i < 3; i++) {
                int k = r.nextInt(s.length());
                id += s.charAt(k);
            }
            if (checkProductId(id)) {
                return id;
            }
        } while (true);
    }

    //Update price of product
    @Override
    public void updatePrice(String productId, double newPrice) {
        // TODO
    }

    //Sort all products by Price
    @Override
    public void sortByPrice() {
        // TODO
    }

    //Print Product
    @Override
    public void print() {
        // TODO
    }

    @Override
    public String getProductName(String productId) {
        // TODO
        return null;
    }
    
    @Override
    public double getProductPrice(String productId) {
        // TODO
        return 0;
    }
}

