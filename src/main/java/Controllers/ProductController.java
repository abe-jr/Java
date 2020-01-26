package Controllers;

import Adapters.ProductAdapter;
import Models.Product;
import Stream.InputStreamReader;
import Stream.OutputStreamWriter;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductController {
    private ProductAdapter productAdapter = new ProductAdapter();

    public void addProduct(int quantity, double price, double volume) {
        Product product = new Product(quantity, price, volume);
        productAdapter.addElement(product);
    }

    public ArrayList<Product> getAllProducts() {
        return productAdapter.getAllElements();
    }

    public void writeProductsInFileJson() {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter("json_1", getAllProducts());
        outputStreamWriter.start();
    }

    public void readProductsInFileJson() {
        InputStreamReader inputStreamReader = new InputStreamReader("json_1");
        inputStreamReader.start();
    }
}