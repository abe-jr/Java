package Stream;

import Helpers.FileHelper;
import Helpers.JSONHelper;
import Models.Product;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class OutputStreamWriter extends Thread {
    private String fileName;
    private ArrayList<Product> products;
    private JSONHelper jsonHelper;

    public OutputStreamWriter(String fileName, ArrayList<Product> products) {
        this.fileName = fileName;
        this.products = products;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("OutputStreamWriter running");
        try {
            jsonHelper = new JSONHelper();
            JSONArray jsonProducts = jsonHelper.createArray("products");

            for (Product product : products) {
                JSONObject object = jsonHelper.createObject("product", product);
                jsonProducts = jsonHelper.putElementIntoArray(jsonProducts, object);
            }

            JSONObject jsonObjectArray = new JSONObject();
            jsonObjectArray.put("products", jsonProducts);

            FileHelper fileHelper = new FileHelper(this.fileName, jsonObjectArray);
            fileHelper.createFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
