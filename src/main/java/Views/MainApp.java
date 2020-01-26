package Views;

import Controllers.ProductController;
import Stream.InputStreamReader;
import Stream.OutputStreamWriter;

public class MainApp {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.addProduct(1, 1.1, 1.5);
        productController.addProduct(2, 1.2, 1.5);
        productController.addProduct(3, 1.3, 1.5);
        productController.addProduct(4, 1.4, 1.5);
        productController.addProduct(5, 1.5, 1.5);
        productController.addProduct(6, 1.5, 1.5);

        productController.writeProductsInFileJson();
        productController.readProductsInFileJson();
    }
}
