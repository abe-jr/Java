package Adapters;

import Models.Product;

import java.util.ArrayList;

public class ProductAdapter {
    private ArrayList<Product> productsAdapter = new ArrayList<Product>();

    public void addElement(Product product) {
        productsAdapter.add(product);
    }

    public ArrayList<Product> getAllElements() {
        return productsAdapter;
    }

}
