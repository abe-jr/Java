package Models;

import java.util.ArrayList;
import java.util.Arrays;

public class Product {
    private int quantity;
    private double price;
    private double volume;

    public Product(int quantity, double price, double volume) {
        super();
        this.quantity = quantity;
        this.price = price;
        this.volume = volume;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(float volume) {
        this.volume = volume;
    }
}